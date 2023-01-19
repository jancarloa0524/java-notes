# Insertion Sort

## Description
Similiar to selection sort, it loops through the array in order, however it instead compares each value to all the values that come before it in order to find an element that, for example, is less than the current one. When this occurs, it bumps each element after the current element down the array by one spot, and inserts the current element into the correct spot. Operating this way gaurantees that every value after the beginning or selected part of the array will be sorted correctly. The steps are as follows:

1. Get the next value to be inserted into the partially sorted array.
2. If there is a value to the left, check to see if the value is less than that one.
3. Move that value to the right
4. Move to the next value to the left - and repeat
5. When it no longer is less than the value to the left, insert the value
6. Repeat steps 1 - 5 until array is sorted. 

Always begin with the second value in the list!

## Implementation:

You would store your `elements[j]` (second loop) in a temporary variable. So, once you find the correct spot, you can increase the index of every element between the spot and `elements[j]` by 1 and insert `temp` at that spot. Let's see this in action.

1. ``` java
    // Selected Value: 34
    [56, 34, 55, 12, 88, 37, 45, 21]
    ```
    Begin at index 1. Is 34 less than 56? If yes, then move 34 into index 0, and move the rest of the array forward. 

2. ``` java
    // Selected Value: 55
    [34, 56, 55, 12, 88, 37, 45, 21]
    ```
    Now go on to index 2. Is 55 less than 56? If yes, continue unless unable to. But is 55 less than 34? No, so stop, and move 55 into that position, and all other indexes after move forward.

3. ``` java
    // Selected Value: 12
    [34, 55, 56, 12, 88, 37, 45, 21]
    ```
    Now go to index 3, which is 12. Compare it to the values before, and keep moving until it finds a variable it is not less than. In this case, 12 is less than all previous values, so it inserts itself in index 0, while all other values move forward

4. ``` java
    // Selected Value: 88
    [12, 34, 55, 56, 88, 37, 45, 21]
    ```
    88 is bigger than the rest of the values behind it, so it's position does not change.
5. ``` java
    // Selected Value: 37
    [12, 34, 55, 56, 88, 37, 45, 21]
    ```
    Move down the list again, reaching 34 because 34 is not less than 37. Insert 37 in that position, and move the rest of the array forward.
6. ``` java
    // Selected Value: 45
    [12, 34, 37, 55, 56, 88, 45, 21]
    ```
    Move 45 down the list the same way as before, which should land between 37 and 55.
7. ``` java
    // Selected Value: 21
    [12, 34, 37, 45, 55, 56, 88, 21]
    ```
    21 will now move down the list between 12 and 34, leaving us with out final sorted array. 
    ``` java
    [12, 21, 34, 37, 45, 55, 56, 88]
    ```

## Advangtages and Distadvantages

It is easy to code and understand, however it is very slow with large sets of data.

## Comparing Sort Times

We have learned 2 types of sorting methods so far, Selection Sort and Insertion Sort. In order to determine which one will run more efficiently, run a statment execution count. 

``` java
public static void selectionSort(int[] elements)
{
  for (int j = 0; j < elements.length - 1; j++)
  {
    int minIndex = j;
    for (int k = j + 1; k < elements.length; k++)
    {
      if (elements[k] < elements[minIndex])
      {
        minIndex = k;
      }
    }
    int temp = elements[j];
    elements[j] = elements[minIndex];
    elements[minIndex] = temp;
  }
}
```
``` java
public static void insertionSort(int[] elements)
{
  for (int j = 1; j < elements.length; j++)
  {
    int temp = elements[j];
    int possibleIndex = j;
    while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
    {
      elements[possibleIndex] = elements[possibleIndex - 1];
      possibleIndex--;
    }
    elements[possibleIndex] = temp;
  }
}
```

For the selection sort method, values are compared by the line `if (elements[k] < elements[minIndex]`. So add a count variable above this one to track statement execution. 

In the insertion sort method, values are instead compared by the line `while (possibleIndex > 0 && temp < elements[possibleIndex - 1])`, so the statement execution count is trickier. You would put the count variable before the while loop (for the first time the condition is checked) and at the end of the contents of the while loop (for each subsequent time). You might also have to make a conditional to make sure it doesn't count executions where the possible index is 0, due to short circuit evaluation. 