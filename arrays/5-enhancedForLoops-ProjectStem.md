# The Enhanced For Loop

## Printing Using an Enhanced For Loop

In order to write a for loop in general:

``` java
for (double n : arr) {
  System.out.println(n + " ");
}
```

The format is: `for (datatype varName : arrayName)`
## Limitations of the Enhanced For Loop

``` java
int[] arr = {2, 5, 3, 7, 9};
for (int num : arr) {
  num++;
}

for (int num : arr) {
  System.out.print(num + " ");
}

// 2 5 3 7 9
```

Despite the fact that the value of num is changed in the first for loop, the value of arr is only copied to num. Because it is only a copy, the original value does not change. 

**Other limitations:** 
- cannot access index of currently accessed element
- cannot perform operations on more than one element
- cannot traverse more than one array simultaneously. 

## Enhanced For Loops with Objects

However, since objects are stored as references in memory, an enhanced for loop looping through objects could still work because it only sends in a copy of the reference to the same object.

``` java
public static void main(String[] args)
{
  Circle[] elements = {new Circle(), new Circle()};   
  for (Circle c: elements) 
  {
    c.setRadius(5.0);
  }   

  for (Circle c: elements) 
  {           
    System.out.println(c); 
  }
}

// circle with radius 5.0
// circle with radius 5.0
```

