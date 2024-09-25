import 'package:digital_sales_app/Models/category.dart';
import 'package:digital_sales_app/Widgets/ProductCard.dart';
import 'package:flutter/material.dart';
import 'package:digital_sales_app/Models/Product.dart';
import 'package:digital_sales_app/Widgets/searchBar.dart'; // Import the searchBar.dart file

Product p = Product(
  id: '1',
  name: 'Canon EOS 5D',
  description: 'Description 1',
  price: 100,
  quantity: 60,
  category: Category(id: '1', name: 'Cameras'),
  image: 'https://images.pexels.com/photos/90946/pexels-photo-90946.jpeg?auto=compress&cs=tinysrgb&w=600',
  idUser: '2',
);

class ProductsPage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Products'),
      ),
      body: Column(
        children: [
        //  SearchBar(), 
          Expanded(
            child: ListView.builder(
              itemCount: 1,
              itemBuilder: (context, index) {
                return productCard(product: p);
              },
            ),
          ),
        ],
      ),
    );
  }
}
