# Java Technical Interview 

## 1. What is Java?

Java is a strongly typed, class-based, object-oriented programming language. It is a write once, run anywhere language, 
meaning that compiled Java code can run on a JVM installed on any platform that support Java without recompilation.

## 2. What are the differences between primitive data types and objects in Java?

Primitives and objects highlight the core methods in how Java handles basic data vs. complex structures.

In terms of storage, primitives store actual values while objects store references. Primitives take up less memory, 
objects more. Primitives have limited built-in operations while you can implement as many methods as you want for 
objects.

Also, primitives can’t be null, limiting their flexibility (depends on the context) while objects can. For their 
simplicity, primitives are generally faster to access and manipulate.

## 3. What is the difference between String, StringBuilder, and StringBuffer?

If your string is not going to change, use a String class as a String object is immutable. If your string should be 
modified and will be accessed only by a single thread, StringBuilder is good enough. In other scenarios (string can be 
changed, using multiple threads), use StringBuffer because it is synchronous and thread-safe.

    String s = "Hello"; // immutable
    s += " World"; // Creates a new String object
    
    // StringBuilder is mutable, not thread-safe
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World"); // Modifies the same object
    
    // StringBuffer is mutable, thread-safe
    StringBuffer sbf = new StringBuffer("Hello");
    sbf.append(" World"); // Thread-safe modification



## 4. How do you handle exceptions in Java?

Exceptions in Java can be gracefully handled using try-catch blocks. In the try block, we write the code that might 
throw an exception, and the catch block specifies what the code must do if the exception occurs.

A finally block can be used for cleanup operations if try-catch blocks deal with external resources like file managers, 
database connections, etc.



## 5. Explain the concept of inheritance in Java through examples

Inheritance is one of the core pillars of object-oriented programming in Java. It allows one class to inherit properties 
and methods from another class, promoting code reuse and establishing a parent-child relationship between classes.

For example, Car class may inherit from a general Vehicle class. When doing so, Car can behave just like Vehicle in 
terms of attributes and methods like:

Vehicle class has members like year and make while Car has an additional member transmission.
Vehicle class has a move method while Car overrides move with additional behavior suited to cars.



## 6. What is the difference between == and .equals() when comparing strings?

== compares object references (memory addresses), while .equals() compares the content of strings. For string 
comparison, always use .equals().

Here’s an example to illustrate the difference:

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    System.out.println(str1 == str2);       // true (same object reference)
    System.out.println(str1 == str3);       // false (different object references)
    System.out.println(str1.equals(str2));  // true (same content)
    System.out.println(str1.equals(str3));  // true (same content)
