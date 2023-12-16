# Singleton Pattern

## Overview
The Singleton pattern is a design principle that ensures a class has only one instance and provides a global point of access to that instance. This is especially useful for managing resources, such as database connections or configuration settings.

## Implementation Details
In this example, the Singleton pattern is implemented using lazy initialization, ensuring that the instance is created only when it is first needed.

## Key Points
- Ensures that a class has only one instance.
- Provides a global access point to that instance.
- Implemented here using lazy initialization.

## Usage
The `Singleton` class can be accessed by calling `Singleton.getInstance()`. This method ensures that only one instance of the class is created and returned.

## Example
```java
public class SingletonDemo {
    public static void main(String[] args) {
        // Get the only object available
        Singleton instance = Singleton.getInstance();
    }
}
