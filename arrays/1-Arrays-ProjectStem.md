# Arrays

## Arrays are...
Objects that are used to hold large sets of data. They can hold both primitives and class types. However, you need to declare the values that they will hold, because they cannot hold different data types in the same array. 

## To declare an array...
```java
int[] list = new int[7];
// Declaring int array "lists" with 7 empty indexes. This cannot be changed. 
// This allows arrays to be more lightweiht. For adding and removing elements, check arraylists. 
```

## Array Indices:
Indices start at 0, and end at -1. Index values outside of this range will result in *ArrayIndexOutOfBoundsException*. "list" does not have any elements defined and therefore, all of them are currently 0. 

| Elements | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| -------- | - | - | - | - | - | - | - |
| Indices  | 0 | 1 | 2 | 3 | 4 | 5 | 6 |

We can also initialize an array with an *initializer list*:

``` java
int[] list = {-10, 14, 0, 0, 3, 4, 6};
```
| Elements | -10 | 14 | 0 | 0 | 3 | 4 | 6 |
| -------- | - | - | - | - | - | - | - |
| Indices  | 0 | 1 | 2 | 3 | 4 | 5 | 6 |

You can also change the values of elements:

``` java
list[1] = 3;
list[4]++;
```

| Elements | -10 | 3 | 0 | 0 | 4 | 4 | 6 |
| -------- | - | - | - | - | - | - | - |
| Indices  | 0 | 1 | 2 | 3 | 4 | 5 | 6 |

Note: when initilizing a boolean array, all elements default to false. In an array of doubles, all values default to 0.0. 
