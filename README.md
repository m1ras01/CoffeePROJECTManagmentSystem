# 🏆 FinalProject  |  Online **AITU's Coffee System**

### Group: SE-2214

### Miras Zhailaubai   |   Bakyt Erkinkyzy   |   Aisha Kalimatova


## Project Overview:

### About project 

A web-based application **AITU's Coffee management system** has been created to simplify and digitize the processes involved in managing a cafe. This system caters to two primary user categories: administrators and regular users. It offers a virtual marketplace where users can see various coffee options, make orders. The primary objective is to enhance the overall efficiency and accessibility of cafe services.

### Project Idea:

The idea behind the Online AITU's Coffee System is to create a convenient and user-friendly platform for both administrators and regular users to manage cafe activities digitally.

### Purpose:

The primary purpose of this project is to transition traditional coffee cafe services into the digital realm, offering a centralized and easily accessible platform. The system automates various aspects of cafe management, including order processing, inventory management, and user communication. The ultimate goal is to provide a more convenient and modernized experience for users.

## Objectives:

1. **Graphical  Interface Design:**
   - Create a user-friendly and easily navigable interface tailored for both administrators and regular users.

2. **Efficient Order Management:**
   - Establish a resilient order management system that facilitates seamless browsing, effective cart management, and simplified order placement.

3. **Effective Inventory Control:**
   - Develop an inventory management system focused on ordering items from suppliers that system have in database, and updating the product database..

6. **Comprehensive Administrative Dashboard:**
   - Develop a dashboard that offers administrators a comprehensive overview, enabling them to monitor and manage orders, track inventory, and gain insights into user activities.

7. **Built-in Scalability:**
   - Design the system with scalability in mind, allowing it to seamlessly accommodate user growth and catalog expansion.

8. **Robust Security Measures:**
   - Implement stringent security measures to safeguard data, ensure secure transactions, and prevent unauthorized access.

9. **Optimized Performance:**
   - Optimize system performance to guarantee quick response times, even during periods of peak usage.

## UML diagram
![uml]

## Design Patterns used in project

1. **Singleton Pattern:**
   - The Singleton pattern ensures that a class has only one instance, and provides a global access point to that instance. And this is our Inventory Manager, which can contain methods and data related to inventory management.
 

2. **Decorator Pattern:**
   - Decorator patterns (MilkDecorator, WhipCreamDecorator, SugarDecorator) add new properties or actions to the main coffee object. It combines functionality in various combinations.
   

3. **Factory Pattern:**
   -  The Factory Method pattern is  approach to creating a wide range of coffee products. Its core purpose lies in the creation of these products through a unified interface.
 

4. **Command Pattern:**
- This pattern implements  to encapsulate requests as objects, allowing for parameterization of clients with different requests, queuing of requests, and supporting undo operations.


  5. **Strategy Pattern:**
   - The Strategy pattern allows you to separate the algorithm (brewing method) from the context (coffee shop), which makes them independent and easy to change. All strategies implement a common interface, which makes them interchangeable.
   

6. **Chain of Responsibility Pattern:**
- Pattern defines a Discount Handler interface with methods like apply Discount() and setNextHandler().
And implements concrete handlers for different discount scenarios

7. **Observer Model:**
  - The Observer pattern allows objects (observers) to respond to changes and notifications in another object and automatically receive updates.


8. **State     pattern:**
- We use the State pattern to model a general order (Status received, Status In progress, Ready to Receive, Status Completed). Using State, the code associated with various states is transferred to separate classes getting rid of large blocks of conditional statements.


## Conclusion:

### Future Improvements:

1. Adding more options of coffee:
   - Adding more options of coffee to menu to get more profit.

2. Personalized User Profiles:
   - Implement personalized user profiles, allowing users to maintain order history, preferences, and receive recommendations.

3. Completing features
   - Implement the function of sending email messages to suppliers

![image](https://github.com/m1ras01/CoffeePROJECTManagmentSystem/assets/123997571/b376670d-bcbf-4f03-b68f-d4f1a68a3928)

