# Builder Pattern

## Overview
The Builder pattern is a creational pattern that allows for the step-by-step construction of complex objects. It separates the construction of a complex object from its representation, allowing the same construction process to create various representations.

## Implementation Details
The `House` class in this example uses the nested `HouseBuilder` class. `HouseBuilder` offers methods to set the properties of a `House` and a `build()` method to create a `House` instance with the specified properties.

## Key Points
- Facilitates the construction of complex objects step by step.
- Allows creating different representations of an object using the same construction code.
- Provides control over the construction process.

## Usage
The builder pattern is used as follows:

```java
House house = new House.HouseBuilder()
                    .foundation("Concrete")
                    .structure("Wood")
                    .roof("Metal")
                    .furnished(true)
                    .painted(true)
                    .build();
