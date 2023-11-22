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
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/dbf6512c-948c-490b-9128-ae88bf18be38)

2. **Decorator Pattern:**
   - Decorator patterns (MilkDecorator, WhipCreamDecorator, SugarDecorator) add new properties or actions to the main coffee object. It combines functionality in various combinations.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/672315d6-3ea2-4fc5-b464-6f6fe7d5291d)

3. **Factory Pattern:**
   -  The Factory Method pattern is  approach to creating a wide range of coffee products. Its core purpose lies in the creation of these products through a unified interface.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/9bcc5302-6443-400c-8ac7-aa6d75181378)

4. **Command Pattern:**
- This pattern implements  to encapsulate requests as objects, allowing for parameterization of clients with different requests, queuing of requests, and supporting undo operations.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/8719adf0-80e9-4731-a09b-78af684ee801)

  5. **Strategy Pattern:**
   - The Strategy pattern allows you to separate the algorithm (brewing method) from the context (coffee shop), which makes them independent and easy to change. All strategies implement a common interface, which makes them interchangeable.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/9a2744fa-90cc-4306-abc5-4ce922e80227)

6. **Chain of Responsibility Pattern:**
- Pattern defines a Discount Handler interface with methods like apply Discount() and setNextHandler().
And implements concrete handlers for different discount scenarios

7. **Observer Model:**
  - The Observer pattern allows objects (observers) to respond to changes and notifications in another object and automatically receive updates.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/5bed6d07-b470-469d-ae08-cae01b89960b)

8. **State     pattern:**
- We use the State pattern to model a general order (Status received, Status In progress, Ready to Receive, Status Completed). Using State, the code associated with various states is transferred to separate classes getting rid of large blocks of conditional statements.
   code:
   !(https://github.com/zbekxzz/software-design-pattern-final/assets/129783111/9bcc5302-6443-400c-8ac7-aa6d75181378)


## Conclusion:

### Future Improvements:

1. Adding more options of coffee:
   - Adding more options of coffee to menu to get more profit.

2. Personalized User Profiles:
   - Implement personalized user profiles, allowing users to maintain order history, preferences, and receive recommendations.

3. Completing features
   - Implement the function of sending email messages to suppliers

### References:

- Freeman, E. (n.d.). Head First Design Patterns, 2nd Edition. O’Reilly Online Learning. https://www.oreilly.com/library/view/head-first-design/9781492077992/?_gl=1*1y65lth*_ga*OTY0MzMzMjEyLjE3MDA0MTQ3ODg.*_ga_092EL089CH*MTcwMDQxNDc4OC4xLjEuMTcwMDQxNDgwMS40Ny4wLjA.
- Refactoring.Guru / Рефакторинг.Гуру. (n.d.). [Рефакторинг и Паттерны проектирования](https://refactoring.guru/ru)
