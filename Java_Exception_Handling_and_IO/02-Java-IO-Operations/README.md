# Java I/O Operations

Java I/O (Input/Output) provides classes to create files, read data from files, and write data to files.

## Concepts

- **File creation:** Uses the `File` class to create a new file.
- **Read and write:** Uses file streams or readers and writers to store and retrieve text.
- **BufferedReader:** Reads character data efficiently, commonly one line at a time.
- **BufferedWriter:** Writes character data efficiently using a buffer.
- **File permissions:** Checks or changes basic read, write, and execute permissions.

## Example Programs

| Java File | Explanation |
|---|---|
| [FileCreationExample.java](FileCreationExample.java) | Creates a new file using `createNewFile()`. |
| [FileReadWriteExample.java](FileReadWriteExample.java) | Writes text to a file and reads it using `Scanner`. |
| [BufferedReaderExample.java](BufferedReaderExample.java) | Reads a text file line by line using `BufferedReader`. |
| [BufferedWriterExample.java](BufferedWriterExample.java) | Writes text using `BufferedWriter`. |
| [FilePermissionsExample.java](FilePermissionsExample.java) | Checks and changes basic file permissions. |

## Run a Program

```bash
javac FileCreationExample.java
java FileCreationExample
```

Run each example separately. `BufferedReaderExample.java` reads `notes.txt`, which is created by `FileReadWriteExample.java`. `FilePermissionsExample.java` uses `sample.txt`, which is created by `FileCreationExample.java`.

Permission changes may depend on the operating system and the permissions of the current user.
