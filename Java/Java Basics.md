# Java Basics and OOPS
Java is a statically typed language, that is, the type of the variable cannot be changed once the application is complied. The checking is done by the compiler is called Static type checking. Javascript is a dynamically typed language as the type of variable can be changed or the variable can store different type of data.

Java uses both compiler and interpreter. Java source code is converted into bytecode at compilation time. The interpreter executes this bytecode at runtime and produces output. Java is interpreted that is why it is platform-independent.

---
Java is machine independent: It means one code can run anywhere on any machine. The java provides java based platform. It has two components 
1. Runtime Environment
2. API(Application Development Interface)
The java code is compiled by the compiler into bytecode and bytecode is platform independent

In java the size of the variables is not fixed unlike C. So this makes it architecturally netural


Java Supports dynamic compilation and automatic memory management(Garbage collection)

### Terms:
1. Class Loader in java is a part of JRE. It is responsible to dynamically load a class into JVM(Java Virtual Machine)
2. Java gives automatic grabage collection in JVM that collects all the unsed objects by the application
3. <b>this keyword</b>: this keyword is a reference variable that refers to the current object.
```
Here is given the 6 usage of java this keyword.

1. this can be used to refer current class instance variable.
2. this can be used to invoke current class method (implicitly)
3. this() can be used to invoke current class constructor.
4. this can be passed as an argument in the method call.
5. this can be passed as argument in the constructor call.
6. this can be used to return the current class instance from the method.
```
4. super keyword: used to call the parent class's constructor
5. final keyword: it is used to fix the value of the variable. Same as const keyword in other languages. Similarly, for methods a final method cannot be overridden. For a final class, the class cannot be extended.

Important Terms:
1. JRE: Java runtime Enverionment
2. JVM:[JVM Link](https://www.javatpoint.com/jvm-java-virtual-machine) Java Virtual Machine : It is an abstract machine as it does not exist in real. It provides the runtime environment for the execution of the bytecode. It does the following : Loads code, Verifies code, Executes code, Provides runtime environment






## Classes and Objects
Everything in Java us an object. Classes are a logical entity. Objects are an instance of a class

1) Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists. A local variable cannot be defined with " " keyword.

2) Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.
It is called an instance variable because its value is instance-specific and is not shared among instances.

3) Static variable
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.
---
Why is the Java main method static?

Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

---
### OOPS - Object oriented programming
1. Class
2. Obejcts
3. Inheritance
4. Polymorphism
5. Abstraction
6. Encapsulation



## STD Input and Output
- System.out.println(): take the cursor to the next line
- System.out.print(): Keeps the cursor at the end of the same line
- System.out.println() Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class.

## Exceptions in Java
Exceptions are unwanted error and code that will in most cases result in termination of the program. 
There are two types of exceptions in Java:
1. Checked Exceptions : Compile-time it is checked.
2. Un Checked Exceptions : Not checked in compile time. Eg: Airthmetic , nullpointer and arrayoutofbound exceptions.
3. Errors: Non recoverable. VMError, asertion error.

Keywords:
1. try: where we are expecting the exception
2. Catch: used to handle the exception. It is preceded by try block
3. finally: will run even if the case was handled or not
4. throw: it is used to throw an exception
5. throws: used in method signature. It is used to show that this method will throw the error.g

## References
[Javapoint](https://www.javatpoint.com/inheritance-in-java)