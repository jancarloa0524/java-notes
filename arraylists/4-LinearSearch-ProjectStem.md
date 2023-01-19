# Linear search

Algorithm: Finishes in a finite time, and consists of a set of logical ordered steps.

This covers the linear or sequential search algorithm, one of two standard searching algorithms needed for APCSA. 

## Searching Any Set of Values

A linear search can apply to any set of values, as it works in a very simple way:
1. Start at the beginning of the data
2. Is this the value we're looking for?
    1. If yes, stop searching
    2. If no, keep searching
3. Repeat step 2 until we find what we're looking for, or until we reach the end of the set. 

This can be represented by a simple for loop. 

``` java
for (int i = 0; i < length; i++) {
    if (...) {
        return...
    }
}
```

When writing a linear search, never assume the length of the data set, always use a built-in length method. Even if the length changes, the algorithm will still work. It is easy to code and understand this loop, however it is very slow.