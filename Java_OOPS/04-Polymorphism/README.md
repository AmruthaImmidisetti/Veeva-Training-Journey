# Polymorphism

Polymorphism means **many forms**. It allows a method to behave differently depending on its parameters or the object calling it.

Java supports two types of polymorphism:

## 1. Compile-Time Polymorphism (Method Overloading)

Method overloading occurs when multiple methods in the same class have the same name but different parameter lists.

### Rules
- Methods must have the same name.
- Parameters must differ in number, type, or order.
- Changing only the return type is not method overloading.
- It is resolved at compile time.

### Example

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(2.5, 3.5));
    }
}
```

**Output:**
```text
30
60
6.0
```

## 2. Runtime Polymorphism (Method Overriding)

Method overriding occurs when a child class provides its own implementation of a method already defined in its parent class.

### Rules
- Inheritance is required.
- The method name and parameter list must be the same.
- The return type must be the same or covariant.
- The overriding method cannot have more restrictive access.
- Static methods cannot be overridden; they are hidden.
- It is resolved at runtime based on the actual object.

### Example

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

**Output:**
```text
Dog barks
```

Here, the parent class reference `a` refers to a child class object. Therefore, the overridden method in the `Dog` class is executed.

## Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name | Same method signature |
| Different parameters | Same parameters |
| Inheritance is not required | Inheritance is required |
| Compile-time polymorphism | Runtime polymorphism |
| Return type alone cannot differentiate methods | Return type must be compatible |
| Occurs within a class or across inherited classes | Occurs between parent and child classes |

## Advantages of Polymorphism

- Improves code reusability.
- Provides flexibility.
- Reduces code duplication.
- Makes programs easier to maintain.
- Supports dynamic method dispatch through overriding.