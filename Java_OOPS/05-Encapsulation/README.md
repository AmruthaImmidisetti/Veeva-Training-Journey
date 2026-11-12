# Encapsulation

Encapsulation is one of the four pillars of Object-Oriented Programming (OOP). It is the process of wrapping data (variables) and methods into a single unit (class) while restricting direct access to the data.

In Java, encapsulation is achieved using access modifiers and getter and setter methods.

## 1. How to Achieve Encapsulation

1. **Private Variables:** Declare class variables as `private` to prevent direct access from outside the class.
2. **Getter Methods:** Use public getter methods to retrieve private variable values.
3. **Setter Methods:** Use public setter methods to update private variable values.
4. **Data Validation:** Apply conditions inside setter methods to ensure only valid data is assigned.

## 2. Access Modifiers Used

- **private:** Accessible only within the same class.
- **public:** Accessible from anywhere.
- **protected:** Accessible within the same package and by subclasses, subject to Java access rules.
- **default:** Accessible only within the same package.

## 3. Advantages of Encapsulation

- **Data Hiding:** Prevents direct access to internal data.
- **Data Security:** Controls how data is accessed and modified.
- **Validation:** Allows checking values before updating them.
- **Maintainability:** Makes code easier to modify and manage.
- **Flexibility:** Internal implementation can change without affecting how other classes use it.

## 4. Getter and Setter Methods

| Getter | Setter |
|---|---|
| Retrieves a private variable's value | Updates a private variable's value |
| Usually starts with `get` | Usually starts with `set` |
| Returns a value | Usually returns `void` |
| Does not require a parameter | Accepts a parameter |

## Key Points to Remember

- Encapsulation is achieved by combining data and methods within a class.
- Private variables help restrict direct access.
- Getters and setters provide controlled access to private data.
- Validation can be implemented inside setter methods.
- Encapsulation improves data protection, flexibility and maintainability.