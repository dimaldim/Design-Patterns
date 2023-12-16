# Factory Pattern

## Overview
The Factory pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

## Implementation Details
The `VehicleFactory` class in this example demonstrates the Factory pattern. It provides a method `getVehicle` to instantiate objects based on provided information.

## Key Points
- Provides an interface for creating objects.
- Delegates instantiation to subclasses.
- Used to create a family of related or dependent objects.

## Usage
The factory can be used to create different types of vehicles like this:

```java
VehicleFactory factory = new VehicleFactory();

Vehicle car = factory.getVehicle("CAR");
car.create();  // Outputs: Creating car object

Vehicle truck = factory.getVehicle("TRUCK");
truck.create();  // Outputs: Creating truck object