Various Java projects I completed during my time at NEIU. <br>
<br>
<ins>**AbstractExtended**</ins>: <br>
This Java project implements an employee management system using inheritance and file handling. It defines an abstract Employee class with subclasses for Faculty and StudentWorker. The system calculates and stores paycheck information, and uses a FileOperator class to write employee data to a file. Additionally, it includes unit tests to verify object creation, paycheck calculations, and file writing functionality.

<ins>**BinarySearch**</ins>: <br>
This Java-based Binary Search Tree implementation includes key operations such as adding elements, performing in-order traversal, finding the maximum element, and evaluating mathematical expression trees. The BST class handles the tree's core logic, using non-recursive methods for insertion and traversal. The BSTNode class defines individual nodes with left and right children. Additionally, there are various tests to validate the functionality of the tree, including correctness of traversal, tree size, maximum element, and evaluation of binary expression trees.

<ins>**EnhancedTime&Shapes**</ins>: <br>
**Problem 1-** <br>
The code defines a base class Shape with methods to calculate area and perimeter, and a toString method for displaying the shape's attributes. The Circle and Rectangle classes extend Shape, overriding the area and perimeter methods to implement specific formulas for each shape. The TestShapes class tests the creation of Shape, Circle, and Rectangle objects, storing them in an array and verifying their output against expected values. The tests check if the toString() method correctly displays the area, perimeter, and color of each shape. <br>
**Problem 2-** <br>
The code defines a Time class that handles time in hours, minutes, seconds, and AM/PM format, with a copy constructor and a constructor to initialize the time. The EnhancedTime class extends Time and adds functionality to modify the time by adding seconds, taking into account time wrapping, hour and minute adjustments, and AM/PM transitions. The TestTime class tests the addSeconds method by loading test data from a file, comparing the result of the time adjustment to the expected output, and reporting the number of passed and failed tests. This approach ensures that the time manipulation logic works correctly for various scenarios. <br>

<ins>**GuessTheNumber**</ins>: <br>
The GuessTheNumber game is a simple console-based number guessing game. The program generates a random number between 0 and 100 and asks the user to guess it. It provides feedback on whether the guess is too high or too low and continues looping until the correct number is guessed. When the user guesses the correct number, a congratulatory message is displayed, and the program terminates. The Scanner object is used for reading user input, and the Random object is used to generate the target number. <br>

<ins>**GuessTheWord**</ins>: <br>
The GuessTheWord game is a word guessing game where the program selects a word from a predefined list, scrambles its letters, and asks the player to guess the original word. The word is scrambled using the scrambleWord method, which shuffles the letters randomly. The user is prompted to enter a guess, and the game continues until the user guesses correctly. When the correct word is guessed, the program congratulates the player. The Scanner object is used for reading input, and the game uses a loop to keep asking for guesses until the correct one is entered. <br>

<ins>**SortedList**</ins>: <br>
The PersonNode class represents a node in a linked list, containing an ID, name, and a reference to the next node. It provides methods to get and set the ID, name, and link to the next node. The SortedPersonList class manages a sorted linked list of PersonNode objects. It includes functionality to check if the list is empty, return the size of the list, and verify if a node with a specific ID exists. The list allows for retrieving a node by ID and adding new nodes in sorted order. If a node with the same ID exists, it will not be added again. It also supports removing nodes by ID and provides a string representation of the list for display. The nodes are always maintained in ascending order by their ID. <br>

<ins>**StackRecursion**</ins>: <br>

