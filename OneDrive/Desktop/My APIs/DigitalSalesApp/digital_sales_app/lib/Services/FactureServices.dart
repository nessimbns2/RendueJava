import 'dart:convert';

import 'package:digital_sales_app/Models/Facture.dart';
import 'package:digital_sales_app/Services/SecureStorage.dart';
import 'package:http/http.dart' as http;


import "../.env.dart";


Future<List<Facture>> getFactureByUser(String id, String token) async {
  try {
    final response = await http.get(
      Uri.parse('$apiUrl/factures/user/$id'),
      headers: {
        'Authorization': 'Bearer $token',
      },
    );
    if (response.statusCode == 200) {
      List<dynamic> responseBody = jsonDecode(response.body);
      List<Facture> contracts = responseBody.map((item) => Facture.fromJson(item)).toList();
      return contracts;
    }         else if (response.statusCode == 401) {
        logout();
        throw Exception('Unauthorized: ${response.statusCode}');
        }else {
      throw Exception('Failed to fetch data: ${response.statusCode}');
    }
  } catch (e) {
    throw Exception('Failed to fetch data: $e');
  }
}

