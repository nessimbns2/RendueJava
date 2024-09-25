import 'package:digital_sales_app/Models/Product.dart';

class FactureItem {
  Product product;
  int quantity;

  FactureItem({required this.product, required this.quantity});

  factory FactureItem.fromJson(Map<String, dynamic> json) {
    return FactureItem(
      product: Product.fromJson(json['product']),
      quantity: json['quantity'],
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'product': product.toJson(),
      'quantity': quantity,
    };
  }
}