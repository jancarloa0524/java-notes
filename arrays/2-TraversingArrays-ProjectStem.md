# Traversing Arrays

## To Search Through An Array...

We traverse arrays using *for* loops.

You can declare a variable to determine whether or not something was found:

``` java
int found = 0;
```

So, we use a for loop and if statement in order to find the value we are looking for:

``` java
// length does not require parenthesis because it is a public variable instead of a method. 
for (int i = 0; i < list.length; i++) {
    if (list[i] == look) {
        found = 1;
        break; // ends the loop, useful for once you find whatever you are looking for.
    }
}
```

## .length helps to avoid Out Of Bounds Errors!

Sometimes, we may miss an element at the beginning:
``` java
for (int i = 1; i < list.length; i++) {
    // code
}
```

Or access an invalid index

``` java
for (int i = 0; i <= list.length; i++) {
    // code
}
```

The compiler won't find an error, but runtime will throw the following:
`ArrayIndexOutOfBoundsException`.

## Array Algorithms

### Counting Instances:
``` java
int count = 0;
for (int i = 0; i < list.length; i++) {
    // if the selected element is equal to the value we are looking for, count it.
  if (list[i] == look) {
    count++;
  }
}
```

### Checking Every Element Meets a Condition
``` java
boolean found = true;
for (int i = 0; i < list.length; i++) {
  if (list[i] <= 0) {
    // If the element is less than or equal to 0, than the list does not meet the condition
    found = false;
    break;
  }
}
```

Make sure not to use just `i`, instead make sure you use `list[i]` so that you go through every element!

### Square Bracket Formatting:
``` java
// Format 1, default and common
double[] list = {1.0, 2.1, 3.3};

// Format 2, for transitioning programmers; uncommon
double list[] = {1.1, 2.2, 3.4};
```
