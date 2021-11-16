# Java OOPS concepts

## Classes and Objects
- The name of the .java file and class name should be same. It is a good practice but it can be otherwise as well.
- Classes: These are logical entities and blueprints. They contain the properties and behaviour of that particular class. They don't consume any space. It can also be defined as a collection of objects



## Polymorphism
There are two types of polymorphism:

1. Compile-Time 2. Runtime
- Method Overloading is an example of polymorphism. A method with the same name can have two bodies which are differentiated by the function declaration. Like the number of arguments and matching arguments, type of arguments.

**Paramater List must be different**

Valid cases og method overloading are
```
void update(int var){}
void update(int var,char s){}
void update(char s,int var){}
void update(short var){}
```
Order of arguments matter and will result in method overloading.
### Invalid Examples

1. Method return type is not counted in method overloading. 
Static and non static is also not considered. Change of variable is also not considered.
```
void update(int newid){} // eg

------------Invalid Examples------------------
void update(int nameChangedID){}
boolean update (int op){}
static void update(int newid){}
```
will throw an error by the compiler saying that the same method is used with different return type.

2. 
        
## Inheritance
Inheritance is the proprty by which one class inherits properties from its partents class. The `extend` keyword is used to inherit properties from the parent class. Every class object parent class is `Object class`. We can do method overriding in inheritance

## Encapsulation
In this we do this using packages and access modifiers. It is done for security reasons mainly and make the application more binded.

- Default: only visible in the same and children pacakges
- Public: Visible everywhere, in the same pacakge, different package as well
- Private: Visible nowhere, only within the class
- Protected: only inherti and not visible in class or package

Encapsulation is important for data hiding and keeping the relevant data together(encapsulating). Data hiding is achieved by creating getters and setters.

## Abstraction
Hiding the implementation is know as abstraction. Show only the part which is useful for the user. There are two ways to achieve abstraction in Java. 

1. Abstract Classes(0-100% abstraction)
2. Interfaces (100% abstraction)

- Abstract keyword: When we add abstract keyword in front of a class we cannot make an object of that particular class. We can define few functions if we want to but the oject cant be created. Also, a class containing an abstract function is automatically an abstract class.

*Functions with body are called as concrete functions*

Interfaces: In interfaces all the methods are by default abstract and public. We use the word `implements` to implement an interface. 

