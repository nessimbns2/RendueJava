import 'category.dart';

class Product {
  String id;
  String name;
  String image;
  String description;
  double price;
  int quantity;
  Category category;
  String idUser;

  Product({
    required this.id,
    required this.name,
    required this.image,
    required this.description,
    required this.price,
    required this.quantity,
    required this.category,
    required this.idUser,
  });

  // Factory method to create a Product from JSON
  factory Product.fromJson(Map<String, dynamic> json) {
    return Product(
      id: json['_id'],
      name: json['name'],
      image: json['image'],
      description: json['description'],
      price: json['price'],
      quantity: json['quantity'],
      category: Category.fromJson(json['category']),
      idUser: json['idUser'],
    );
  }

  // Method to convert a Product object to JSON
  Map<String, dynamic> toJson() {
    return {
      '_id': id,
      'name': name,
      'image': image,
      'description': description,
      'price': price,
      'quantity': quantity,
      'category': category.toJson(),
      'idUser': idUser,
    };
  }
}
