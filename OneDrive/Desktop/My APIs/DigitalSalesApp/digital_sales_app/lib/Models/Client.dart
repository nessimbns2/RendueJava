class Client {
  String id;
  String firstName;
  String lastName;
  String tel;

  Client({
    required this.id,
    required this.firstName,
    required this.lastName,
    required this.tel,
  });

  // Factory method to create a Client from JSON
  factory Client.fromJson(Map<String, dynamic> json) {
    return Client(
      id: json['id'],
      firstName: json['firstName'],
      lastName: json['lastName'],
      tel: json['tel'],
    );
  }

  // Method to convert a Client object to JSON
  Map<String, dynamic> toJson() {
    return {
      'id': id,
      'firstName': firstName,
      'lastName': lastName,
      'tel': tel,
    };
  }
}
