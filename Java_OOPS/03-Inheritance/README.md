# Inheritance

Inheritance is an important feature of Object-Oriented Programming (OOP) that allows one class to acquire the properties and methods of another class. It promotes code reusability and establishes a relationship between classes.

## Important Terminology

- **Parent Class (Superclass):** The class whose properties and methods are inherited.
- **Child Class (Subclass):** The class that inherits properties and methods from another class.
- **`extends` Keyword:** Used to inherit one class from another.
- **`super` Keyword:** Used to access parent class variables, methods, and constructors.

## Types of Inheritance in Java

1. **Single Inheritance:** One child class inherits from one parent class.
2. **Multilevel Inheritance:** A class inherits from a child class, forming a chain of inheritance.
3. **Hierarchical Inheritance:** Multiple child classes inherit from the same parent class.
4. **Multiple Inheritance:** One class inherits from multiple parent classes. Java does not support this through classes, but it can be achieved using interfaces.
5. **Hybrid Inheritance:** A combination of two or more inheritance types. It can be achieved using interfaces.

## Important Concepts

- **Method Overriding:** A child class provides its own implementation of an inherited method.
- **Constructor Inheritance:** Constructors are not inherited by child classes, but parent constructors can be called using `super()`.
- **Access Modifiers:** Private members cannot be accessed directly by child classes. Protected and public members can be accessed according to their access rules.
- **IS-A Relationship:** Inheritance represents an IS-A relationship between parent and child classes.

## Advantages of Inheritance

- Promotes code reusability.
- Reduces code duplication.
- Improves code organization.
- Makes maintenance easier.
- Supports method overriding and runtime polymorphism.

## Key Points to Remember

- Java uses the `extends` keyword for class inheritance.
- A class can extend only one class.
- A child class can inherit accessible members from its parent.
- Private members are not directly accessible in child classes.
- The `super` keyword helps access parent class members and constructors.
- Inheritance supports runtime polymorphism through method overriding.