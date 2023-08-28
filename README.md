# Car Service Station Program

This Java program simulates a car service station's billing system using Object-Oriented Programming (OOP) concepts. The program allows users to generate detailed service bills based on the type of car and requested service codes. It calculates service charges and provides the option for a complimentary cleaning if the total bill exceeds ₹10,000.

## Program Features

- The car service station caters to different types of cars: Hatchback, Sedan, and SUV.
- It offers various types of services, each with a unique service code and corresponding prices for different car types.
- The program generates a detailed bill that includes the total amount for each requested service based on the car type and service codes.
- If the total service bill exceeds ₹10,000, a complimentary cleaning is provided and specified in the bill.

## How the Program Demonstrates OOP Concepts

1. **Encapsulation**: The program encapsulates data related to car types, service codes, and prices within the `CarService` class. This class provides a clear interface for retrieving prices based on car type and service code.

2. **Abstraction**: The `CarService` class abstracts away the complexity of price calculations by providing a simple `getPrice` method. Users of this class don't need to know the internal details of how prices are stored or calculated.

3. **Inheritance**: Although not explicitly shown in this simplified example, you could implement inheritance by creating subclasses for different car types. Each subclass could provide specific details about car type-related behaviors and attributes, while inheriting common behaviors from a parent class.

4. **Polymorphism**: The program doesn't directly demonstrate polymorphism, but you could implement it by using interfaces or abstract classes for different services. This would allow you to create different service classes that share a common interface and exhibit polymorphic behavior when calculating prices.

5. **Composition**: The program composes the car service pricing and bill generation logic in separate classes (`CarService` and `BillGenerator`). This separation of concerns follows the composition principle, where smaller components are composed to create more complex behavior.

## Usage

1. Compile and run the program using a Java compiler.
2. Modify the `CarServiceStation` class's `main` method to provide your desired car type and service codes.
3. Run the program to generate a detailed service bill based on the provided inputs.
