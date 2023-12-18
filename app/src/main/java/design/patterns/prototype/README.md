# Prototype Pattern

## Overview
The Prototype pattern is used to create duplicate objects while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object.

## Implementation Details
In this example, `Shape` is an abstract class implementing `Cloneable` interface, and concrete classes `Rectangle` and `Circle` extend `Shape`. A class `ShapeCache` is used to store and clone the shapes.

## Key Points
- Avoids the overhead of creating objects from scratch.
- Used when creating an instance of a class is more expensive than copying an existing instance.
- Relies on the `Cloneable` interface.

## Usage
```java
ShapeCache.loadCache();

Shape clonedShape = ShapeCache.getShape("1");
System.out.println("Shape : " + clonedShape.getType());
