# Exception Handling

Exception Handling in Java is a mechanism used to handle runtime errors and maintain the normal flow of program execution. It helps prevent unexpected program termination by providing appropriate ways to detect and handle exceptions.

## Concepts Covered

- **try:** Encloses code that may generate an exception.
- **catch:** Handles exceptions thrown from the associated `try` block.
- **finally:** Executes after the `try` and `catch` blocks, regardless of whether an exception occurs.
- **throw:** Explicitly throws an exception.
- **throws:** Declares exceptions that a method may pass to its caller.
- **Custom Exceptions:** User-defined exceptions created by extending the `Exception` or `RuntimeException` class.

## Example Programs

| Java File | Explanation |
|---|---|
| [TryCatchFinallyExample.java](TryCatchFinallyExample.java) | Demonstrates try, catch, and finally blocks using division by zero. |
| [ThrowThrowsExample.java](ThrowThrowsExample.java) | Explains explicitly throwing exceptions and declaring them using throws. |
| [CustomExceptionExample.java](CustomExceptionExample.java) | Demonstrates creating and handling a custom age-validation exception. |

## How to Run

Compile and execute a Java program using the terminal:

```bash
javac TryCatchFinallyExample.java
java TryCatchFinallyExample
```

Replace the filename with the required Java program. Each example can be executed independently.

## Learning Objectives

- Understand how exception handling works in Java.
- Differentiate between throw and throws.
- Learn to handle runtime errors using try-catch-finally.
- Create and handle user-defined exceptions.