# bairesdev-exercises
Coding exam exercises

## Exercise 1
Implement a method that, given a number, calculates the factorial of that number. The
method implementation must use a stack data structure.

### Implementation:
Implement the class `Factorial` and call the method `getFactorial(int n)` which receives an `int` as parameter and returns the factorial of that number. 

## Exercise 2
Implement a class that represents people waiting in line to talk to a line operator. Use the
best data structure for implementation, specifying which one you picked.

### Implementation:
A Queue was used to represent this case.
Implement the class `Queue` and call the method `enqueue(int amount)` which receives an `int` as parameter that indicates the number of people that will wait in the queue. People are named "Person*<index>*". 

In order to get the name of the person in the *i* position, the method  `getPersonName(int index)` can be called. 

## Exercise 3
Given the following table of Names - Professions, implement a class that allows me to get the profession of a person using his name. Use the best possible data structure for the implementation.

### Implementation:
HashMap was used to solve this exercise.
Implement the class `People` and call the method `findPerson(String name)` which receives an `String` as parameter indicating the Name of the person whose profession you want to find. This method returns a `String` with the profession found or "Person not found." otherwise.

## Exercise 4
Given two lists of numbers: 
- Create two new lists C and D.
- C must contain elements present in A and B
- D must contain elements present in B but not present in A.
- Lists are ordered, can contained repeated elements, and may be of different sizes.

### Implementation:
Implement the class `Classifier` and call the method `classify(ArrayList<Integer> a, ArrayList<Integer> b)` which receives two `ArrayList<Integer>` as parameter indicating the lists of numbers to evaluate. This method sets to private `ArrayList<Integer>` in the `Classifier` class (list C and list D). In order to get them, you can call the methods `getListC()` and `getListD()`.

## TestingModule
Unit Test class `TestingModule` with 4 methods to test each exercise:
 - `testExercise1`
 - `testExercise2`
 - `testExercise3`
 - `testExercise4`