This topic is much harder, so there will be individual examples laid out for you. 

1. Decleration, Initialization, and Assignment
    - Explains the process of declaring, initializing, and assigning 2D arrays.
2. Accessing Elements in a 2D Array
    - Explains how to access indexes of a 2D array
3. Modifying Elements in a 2D Array
    - Explains how to modify indexes of a 2D array
4. Nested Loops
    - Review of how to write loops within loops
5. Traversing 2D Arrays
    - Using nested loops in order to work with information in 2D arrays
6. Practice With Loops
    - Practice with the previous exercise
7. Row Major Order
    - Traversing 2D arrays row by row.
8. Column Major Order
    - Traversing 2D arrays column by column
9. Combining Traversal and Conditional Logic
    - Modifying and interacting with data while traversing through 2D arrays
10. Review
    - Just a review of some of the topics practiced. 

Notes:
*Declaring, initializing, and assigning*
``` java
// Declaring without initializing
int[][] intTwoD;
 
// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];
 
// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];
 
// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
 
// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};
```

*Row-major and Column-major order*
``` java
// Row-major order
for(int o = 0; o < letters.length; o++) {
    for(int i = 0; i < letters[o].length; i++) {
        char c = letters[o][i];
    }
}
 
// Column-major order
for(int o = 0; o < letters[0].length; o++) {
    for(int i = 0; i < letters.length; i++) {
        char c = letters[i][o];
    }
}
```

*Retrieving data*
``` java
char c = letters[0][1];
```

*Modifying Data*
``` java
letters[1][2] = 'z';
```