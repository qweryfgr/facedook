# Facedook App

## Description
This application tries to mimic Facebook features in order to understand basic java programming principals.

## Programming Principals
### Accessors
They are accessible methods generally provided in the class to access attributes values. `getters` and `setters`.

### Encapsulation
Encapsulation is used to hide the values or state of a structured data object inside a class, preventing unauthorized parties' direct access to them.
 
Other client classes should call the `accessors` to retrieve and modify the values within the object.
### Example from Code
Page class attributes are private. They cannot be read or modified directly. One should use the `accessors` to do so.

Getters in this case are public but setters are package protected. So attribute values can be read by any other object but can be modified only by classes from the same package.
## Polymorphism
It describes a language’s ability to process objects of various types and classes through a single, uniform interface.

Polymorphism in Java has two types: `Compile time polymorphism` (static binding) and `Runtime polymorphism` (dynamic binding). 

`Method overloading` is an example of static polymorphism, 

`method overriding` is an example of dynamic polymorphism.

An important example of polymorphism is how a parent class refers to a child class object.  In fact, any object that satisfies more than one IS-A relationship is polymorphic in nature.

### Example from Code
#### Method overloading
In PageService, `create` method has been `overloaded` to support creating a page by passing only a page name or by passing a page name and description.
#### Method overriding
In PageService and VideoService, findAll method has been overridden in both services in order to return a pages list or a video list.