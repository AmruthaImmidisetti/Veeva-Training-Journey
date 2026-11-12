# Java Exception Handling and I/O

This folder contains Java programs and explanations covering Exception Handling and Input/Output (I/O) Operations. It includes theoretical concepts, important points, and practical examples to understand how Java handles runtime errors and performs file operations.

## Topics Covered

### 1. Try, Catch and Finally

Exception handling allows a program to handle runtime errors without terminating unexpectedly. The `try` block contains code that may cause an exception, `catch` handles the exception, and `finally` executes regardless of whether an exception occurs.

**Files:**
- [Try, Catch and Finally - Explanation](01-Exception-Handling/README.md)
- [TryCatchExample.java](01-Exception-Handling/TryCatchExample.java)

### 2. Throw and Throws

The `throw` keyword is used to explicitly throw an exception, whereas `throws` is used in a method declaration to indicate that the method may pass an exception to its caller.

**Files:**
- [Throw and Throws - Explanation](01-Exception-Handling/README.md)
- [ThrowExample.java](01-Exception-Handling/ThrowExample.java)
- [ThrowsExample.java](01-Exception-Handling/ThrowsExample.java)

### 3. Custom Exceptions

Custom exceptions are user-defined exceptions created by extending the Exception class or RuntimeException class. They allow developers to handle application-specific error conditions.

**Files:**
- [Custom Exceptions - Explanation](01-Exception-Handling/README.md)
- [CustomExceptionExample.java](01-Exception-Handling/CustomExceptionExample.java)

### 4. File Handling

Java provides the `File` class to create, check, and manage files and directories. It allows us to perform basic file operations such as checking file existence and retrieving file information.

**Files:**
- [File Handling - Explanation](02-Java-IO-Operations/README.md)
- [FileCreation.java](02-Java-IO-Operations/FileCreation.java)

### 5. File Reading and Writing

Java provides different classes to read data from files and write data into files. These operations help store and retrieve information permanently.

**Files:**
- [File Reading and Writing - Explanation](02-Java-IO-Operations/README.md)
- [FileReading.java](02-Java-IO-Operations/FileReading.java)
- [FileWriting.java](02-Java-IO-Operations/FileWriting.java)

### 6. BufferedReader and BufferedWriter

`BufferedReader` is used to read text efficiently by buffering characters, while `BufferedWriter` is used to write text efficiently by buffering output.

**Files:**
- [BufferedReader and BufferedWriter - Explanation](02-Java-IO-Operations/README.md)
- [BufferedReaderExample.java](02-Java-IO-Operations/BufferedReaderExample.java)
- [BufferedWriterExample.java](02-Java-IO-Operations/BufferedWriterExample.java)

### 7. File Permissions

Java provides methods to check and modify file permissions, such as whether a file can be read, written, or executed.

**Files:**
- [File Permissions - Explanation](02-Java-IO-Operations/README.md)
- [FilePermissions.java](02-Java-IO-Operations/FilePermissions.java)

## How to Run Java Programs

1. Install the Java Development Kit (JDK).
2. Open the project in Eclipse or any Java IDE.
3. Navigate to the required topic folder.
4. Open and execute the Java program.
5. Alternatively, compile and run using the terminal:

```bash
javac FileName.java
java FileName
```

Replace `FileName` with the actual Java filename.

## Learning Objectives

- Understand Java exception handling mechanisms.
- Learn the difference between checked and unchecked exceptions.
- Understand the usage of `try`, `catch`, `finally`, `throw`, and `throws`.
- Learn to create and handle custom exceptions.
- Understand file creation, reading, and writing operations.
- Work with buffered I/O classes.
- Learn to check and modify file permissions.
- Develop practical Java programming skills useful for automation testing.
