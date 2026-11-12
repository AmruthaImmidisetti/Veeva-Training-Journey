# Abstraction

Abstraction is one of the four pillars of Object-Oriented Programming (OOP). It is the process of hiding implementation details and showing only the essential features to the user.

Java supports abstraction mainly through **abstract classes and interfaces**.

## 1. Abstract Class

An abstract class is a class declared using the `abstract` keyword. It provides a common structure for its child classes.

### Characteristics

- Declared using the `abstract` keyword.
- Cannot be instantiated directly.
- Can contain both abstract and concrete methods.
- Can have constructors, variables and instance methods.
- Can contain static and final methods.
- A concrete child class must implement all inherited abstract methods.
- A class can extend only one abstract class.

### Abstract Method

An abstract method is a method declared without a body. Its implementation is provided by the child class.

## 2. Interface

An interface is a blueprint that defines a contract that implementing classes must follow.

### Characteristics

- Declared using the `interface` keyword.
- A class implements an interface using the `implements` keyword.
- Cannot be instantiated directly.
- Supports abstraction and multiple inheritance of type.
- Variables declared in an interface are implicitly `public static final`.
- Can contain abstract, default, static and private methods.
- A class can implement multiple interfaces.

## 3. Difference Between Abstract Class and Interface

| Abstract Class | Interface |
|---|---|
| Declared using `abstract class` | Declared using `interface` |
| Extended using `extends` | Implemented using `implements` |
| Can have instance variables | Variables are public, static and final |
| Can have constructors | Cannot have constructors |
| Supports single class inheritance | Supports multiple interface implementation |
| Can have abstract and concrete methods | Can have abstract, default, static and private methods |

## 4. Advantages of Abstraction

- Hides unnecessary implementation details.
- Reduces code complexity.
- Improves code reusability and maintainability.
- Provides a common structure for different classes.
- Supports flexible and modular application design.

## 5. When to Use

- **Abstract Class:** When related classes share common properties and behaviors but need different implementations for certain methods.
- **Interface:** When different classes need to follow the same contract, even if they are not related through inheritance.

## Key Points to Remember

- Abstraction focuses on what an object does rather than how it does it.
- Java achieves abstraction using abstract classes and interfaces.
- Abstract classes can contain constructors and instance variables.
- Interfaces support multiple inheritance of type.
- Abstract classes and interfaces cannot be instantiated directly.
- Concrete subclasses must implement inherited abstract methods.