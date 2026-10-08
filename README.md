# Java Homework 1 (COMP 282): Fundamentals

Short Java programs on user input, conditions, loops, methods, and classes.

## The programs

| Program | What it does |
|---|---|
| `divisibility/Divisibility.java` | Asks for a dividend and a divisor and says whether the dividend divides evenly. Dividing by zero is handled |
| `factorial/Factorial.java` | Asks for a number and prints its factorial, using a for loop |
| `isDivisible/IsDivisible.java` | A method that returns whether `a` is divisible by `b`, and returns false when `b` is zero |
| `isInteger/IsInteger.java` | A method that checks whether a string is a whole number by testing that every character is a digit |
| `threeStrings/ThreeStrings.java` | Asks for three strings and says whether the first plus the second equals the third |
| `dog/Dog.java` and `dog/DogTester.java` | A `Dog` class that holds a name and a breed, and a tester that creates two dogs |

## How to run

In IntelliJ, open the folder that contains `pom.xml` and run the program you want.

From the command line, with JDK 21 or newer, run these from the project folder:

```
javac -d out $(find src -name '*.java')
java -cp out divisibility.Divisibility
java -cp out factorial.Factorial
java -cp out threeStrings.ThreeStrings
java -cp out dog.DogTester
```

`IsDivisible` and `IsInteger` are classes with methods and have no `main`, so they are meant to be called from other code.

## Other files

`.idea/`, `exportToHTML/`, `hw#1.userlibraries`, and `homeWorkOne.eml` are IntelliJ project settings and are not part of the code.
