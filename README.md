Showroom Management System (Redmi cars Shop Example)
Overview

This is a Java-based console application that simulates a showroom management system. It allows the user to:

Add Showrooms, Employees, Cars, and Redmi Mobiles.

View details of all entries.

Manage the showroom inventory in a structured way.

This project is primarily created for learning object-oriented programming concepts like inheritance and polymorphism in Java.

Features

Add Showroom Details – Name, Address, Manager, Total Employees, Total Cars.

Add Employee Details – Employee ID, Name, Age.

Add Car Details – Car Name, Color, Price, Type.

Key Concepts Demonstrated
1. Inheritance

The Employees, Cars, and Redmi classes inherit from the base class Showroom.

This allows them to reuse properties (like showroom name or manager) and reduce duplicate code.


2. Polymorphism

All classes implement the utility interface, which defines set_detailes() and get_detailes() methods.

This allows runtime polymorphism: the program can call the same method on any object (Showroom, Cars, Employees, Redmi), and the appropriate subclass method runs.

Additional Notes

The program uses arrays for storage (can be extended to ArrayList for dynamic size).

Scanner is used for user input.

Focused on teaching OOP concepts, not persistent storage.
