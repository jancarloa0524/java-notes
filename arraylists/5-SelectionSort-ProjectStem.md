# Selection Sort

This covers the *selection sort* algorithm.

## Goal of a sorting algorithm
To put an ArrayList of items in order.
1. Get the starting position
2. Set the value of the minimum
3. Cycle through all the values
4. Compare current minimum with others to find the new minimum
5. Swap the two values

So, for example:
| Values: | 21 | 79 | 64 | 67 | 56 | 12 |
|---------|----|----|----|----|----|----|
| Index:  |  0 |  1 |  2 |  3 |  4 |  5 |

The algorithm will set 21 to the minimum, and find other values to set as the minimum. It will then swap positions with that number. This is what that will end up looking like:
| Values: |*12*| 79 | 64 | 67 | 56 |*21*|
|---------|----|----|----|----|----|----|
| Index:  |  0 |  1 |  2 |  3 |  4 |  5 |

The algorithm then moves on to the next index, and swaps it with the smallest value it finds once again. 
| Values: | 12 |*21*| 64 | 67 | 56 |*79*|
|---------|----|----|----|----|----|----|
| Index:  |  0 |  1 |  2 |  3 |  4 |  5 |

Do the same thing for the next value...
| Values: | 12 | 21 |*56*| 67 |*64*| 79 |
|---------|----|----|----|----|----|----|
| Index:  |  0 |  1 |  2 |  3 |  4 |  5 |

And again...
| Values: | 12 | 21 | 56 |*64*|*67*| 79 |
|---------|----|----|----|----|----|----|
| Index:  |  0 |  1 |  2 |  3 |  4 |  5 |

## The code:
Often times you'll find an algorithm uses two `for` loops
``` java
for (from i = 0 to length - 1)...// This will get the starting position
{
  for (from current position(i) to length - 1)...  
  // Only looks at indexes past the starting position
  {
    swap smallest with i
  }
}
```

A Selection Sort would look something like this:
``` java
for (int i = 0; i < elements.length - 1; i++) {
  int minIndex = i;
  for (int j = i + 1; j < elements.length; j++) {
    if (elements[j] < elements[minIndex]) {
      minIndex = j;
    }
  }
    
  int temp = elements[i];
  elements[i] = elements[minIndex];
  elements[minIndex] = temp;
 }
```

It's easy to code and understand, but it is very slow with large data sets. 