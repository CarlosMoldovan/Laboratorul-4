# Java Project with Four Classes

## Overview

This Java project consists of four classes that demonstrate various object-oriented programming concepts. The project includes classes for managing personal information, student records, logging messages, and a Singleton design pattern.

## Project Structure

### Class 1: `Persoana`
- **Package**: `ex1`
- Fields:
  - `nume`: String
  - `prenume`: String
  - `cnp` (private): int
  - `birthyear`: int
  - `birthmonth`: String
  - `birthday`: String
  - `adresa` (private): String
- Constructors:
  - `Persoana(String nume, String prenume, int cnp, int birthyear, String birthmonth, String birthday, String adresa)`
- Methods:
  - `setCnp(int cnppers)`
  - `getCnp()`
  - `setAdresa(String adresaPers)`
  - `getAdresa()`
  - `toString()`

### Class 2: `Student`
- **Package**: `ex1`
- Fields:
  - `nume`: String
  - `prenume`: String
  - `nrmatricol` (private): int
  - `an`: int
  - `nrinstantieri` (private static): int
- Constructors:
  - `Student(String nume, String prenume, int nrmatricol, int an)`
- Methods:
  - `getNumarInstante()`

### Class 3: `logging`
- **Package**: `ex1`
- Fields:
  - `instance` (private static): `logging`
  - `mesaj`: String
- Methods:
  - `getInstance()`
  - `setMesaj(String mesaj)`

### Class 4: `StudentSingleton`
- **Package**: `ex1`
- Fields:
  - `instance` (private static): `StudentSingleton`
  - `nume`: String
  - `prenume`: String
  - `nrmatricol`: int
  - `an`: int
- Constructors:
  - `StudentSingleton()`
- Methods:
  - `getInstance()`
  - `setNume(String nume)`
  - `setPrenume(String prenume)`
  - `setNrmatricol(int nrmatricol)`
  - `setAnStudiu(int an)`
  - `getNume()`
  - `getPrenume()`
  - `getNrmatricol()`
  - `getAnStudiu()`

### Class 5: `ex1main`
- **Package**: `ex1`
- Main class containing the `main` method for the project.

## Description

This Java project demonstrates various object-oriented programming concepts, including class structures, constructors, encapsulation, static fields/methods, and the Singleton design pattern. It covers management of personal information, student records, and logging messages.

## Usage

Uncomment sections in the `main` method of the `ex1main` class to run different parts of the project, including creating and manipulating objects of different classes. This project provides a comprehensive example of Java programming concepts.

Feel free to explore, modify, and utilize the code as needed for your specific requirements. Enjoy working with this Java project!

