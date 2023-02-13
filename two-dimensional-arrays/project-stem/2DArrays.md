# Project Stem: Two-Dimensional Arrays
**Topics Covered:**
- [2-D Arrays](#2-d-arrays)
- [2-D Array Algorithms](#2-d-array-algorithms)
## 2-D Arrays

**2-D Arrays**: Arrays that have rows and columns. Still store one type of data, indexed from 0 to length - 1, and used to store large amounts of data. Specifically used to store a table of data, and is simply an array of arrays. 

You can easily imagine a table of Student ID numbers, and their test scores, like this:
``` java
[[5543, 94, 87, 89],
 [5538, 93, 99, 77],
 [5540, 88, 93, 90]]
```

### Syntax:

``` java
int[][] grid = new int[4][3]; // creates a 2-d array of 4 rows and 3 columns
```

``` java
int[][] grid = {{1, 5, 2}, 
                {3, 8, 6}, 
                {9, 4, 7}};
// Helps make code clearer, but can be done on one line
```

If you want to accesss a number in an array...
``` java
System.out.println(grid[1][2]);
// 99

// This will override what was at 3, 0 with a 55
grid[3][0] = 55;        
System.out.println(grid[3][0]);
// 55
```

### Looping through 2D Arrays

Stack for loops, one inside the other, the outer loop for every row, the innner loop for every column:

``` java
for (int r = 0; r < grid.length; r++)  // Accesses rows
{
  for (int c = 0; c < grid[0].length; c++) // Accesses columns 
  {
    System.out.print(grid[r][c] + " \t"); // Prints elements on same line
  }
  System.out.println(); // Skips to next line
}
```

Since the loop traverses through rows in the outer loop, this is a **Row-Major** for loop. The inverse would be a **Column-Major** for loop. 

``` java
for (int c = 0; c < grid[0].length; c++)  // Accesses columns
{
  for (int r = 0; r < grid.length; r++) // Accesses rows 
  {
    System.out.print(grid[r][c] + " \t"); // Prints elements on same line
  }
  System.out.println(); // Skips to next line
}
```

We can also use enhanced for loops:

``` java
for (int[] row : grid)  // Each row is a 1d array of ints called 'row'
{
  for (int num : row) // Each element in the row is an int
  {
    System.out.print(num + " \t");
  }
  System.out.println();
}
```

## 2-D Array Algorithms

The trick to writing arrays for 2-D Array algorithms is understanding both Row-Major and Column-Major traversal, then act upon the required task. This is shown in the following example:

Say we have a bunch of test scores we want to average out, 25 rows all being the test scores of a student, each column being a test score. This is how we would do it:

``` java
public static void calcAverages(int[][] testScores, double[] average)
{
  for (int r = 0; r < testScores.length; r++) // Go through every row
  {
    double sum = 0; // declare a sum for the average of each row, which resets to 0 after a row is complete
    for (int c = 0; c < testScores[0].length; c++) // Go through every column within a row
    {
      sum += testScores[r][c]; // add the scores
    }
    average[r] = sum / testScores[0].length; // average the scores for that row, and replace the specified value in the "average" array. 
  }
}
```

If we wanted to instead average out the score for a specific test, rather than a student, we would use column traversal. 
``` java
public static void testAverage(int[][] scores, double[] average)
{
  for (int c = 0; c < testScores[0].length; c++) // loop through columns
  {
    double sum = 0;
    for (int r = 0; r < testScores.length; r++) // Loop through every row
    {
      sum += scores[r][c];
    }
    average[c] = sum / scores.length; // sum + average out scores
  }
}
```

What if we wanted to check the improvement of students on tests? We could once again go through each row and every column, however this time compare the current test score to the score before it, and if a grade is less than the previous one, than mark that student's improvement with a boolean as false. 

``` java
public static void improve(int[][] scores, Boolean[] check)
{
  for (int r = 0; r < scores.length; r++) // loop through rows
  {
    int count = 0; // establish a count... if the count is equal to the length of the row - 1, since we are comparing values before the current one, then the student progressed
    for (int c = 1; c < scores[0].length; c++)
    {
      if (scores[r][c - 1] <= scores[r][c]) // compare current to previous score
      {
        count++; 
      }
    }
    if (count == scores[0].length - 1) // if thecount matches length of the row - 1, then it means that the student progressed. Otherwise, set that students progression to false
    {
      check[r] = true;
    }
    else
    {
      check[r] = false;
    }
  }
}
```