import 'package:digital_sales_app/Models/FactureItem.dart';
import 'package:digital_sales_app/Models/Product.dart';

class Facture {
  final String id;
  final String userID;
  final DateTime date;
  final double totalAmount;
  final List<FactureItem> factureItems;
  final String clientID;

  Facture({
    required this.id,
    required this.userID,
    required this.clientID,
    required this.date,
    required this.factureItems,
    required this.totalAmount,
  });

  factory Facture.fromJson(Map<String, dynamic> json) {
    return Facture(
      userID: json['userID'],
      id: json['id'],
      clientID: json['clientID'],
      date: DateTime.parse(json['date']),
      factureItems: (json['factureItems'] as List).map((e) => FactureItem.fromJson(e)).toList(),
      totalAmount: json['totalAmount'],
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'clientID': clientID,
      'date': date.toIso8601String(),
      'totalAmount': totalAmount,
      
    };
  }
}