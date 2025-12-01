🚗📱 Showroom Management System (Redmi cars Shop Example)
🌟 Overview

This is a Java-based console application that simulates a Redmi cars showroom management system. It allows the user to:

🏢 Add Showrooms, Employees, and cars;

📄 View details of all entries

📊 Manage showroom inventory in a structured way

This project is primarily created to demonstrate object-oriented programming concepts like inheritance and polymorphism in Java.

🛠 Features

Showroom Details

Name, Address, Manager, Total Employees, Total Mobiles

Employee Details

Employee ID, Name, Age

Cars Details

Model Name, Color, Price;

View All Details

Show all data in a formatted way

Console-based Menu System

Easy-to-navigate user interface

💡 Key Concepts Demonstrated
1️⃣ Inheritance

Employees,   originally Cars inherit from the base class Showroom

This allows them to reuse common properties like showroom name or manager, reducing duplicate code.

Example:

public class Employees extends Showroom implements utility { ... }

2️⃣ Polymorphism

All classes implement the utility interface, which defines:

void set_detailes();
void get_detailes();


This enables runtime polymorphism: the program can call the same method on any object (Showroom, Employees, cars), and the appropriate subclass method runs.
