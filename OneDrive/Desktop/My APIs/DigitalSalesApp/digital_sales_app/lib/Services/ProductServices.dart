import 'dart:convert';
import 'package:digital_sales_app/.env.dart';
import 'package:digital_sales_app/Models/Product.dart';
import 'package:digital_sales_app/Services/SecureStorage.dart';
import 'package:http/http.dart' as http;



Future<List<Product>> getProductsByUser_Id(String userId, String token) async {
  try {
    final response = await http.get(
      Uri.parse('$apiUrl/products/get-by-id/$userId'),
      headers: {
        'Authorization': 'Bearer $token',
      },
    );
    if (response.statusCode == 200) {
      List<dynamic> responseBody = jsonDecode(response.body);
      List<Product> contracts = responseBody.map((item) => Product.fromJson(item)).toList();
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

