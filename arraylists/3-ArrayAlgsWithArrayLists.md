# Array Algorithms with ArrayLists

## Common Algorithms Using ArrayLists

 This will discuss a few common algorithms used in ArrayLists.
 
 If we are checking every value in the array for a reason such as finding equivalent values, we can use the following. Say we start with this ArrayList:
 ``` java
ArrayList<String> colors = new ArrayList<String>();
colors.add("Red");
colors.add("Orange");
colors.add("Yellow");
colors.add("Green");
colors.add("Blue");
colors.add("Purple");
 ```

 If any of the colors in the list start with the letter B, we can do this:
``` java
//Print out any colors that start with the letter B
for (String c : colors) {
  if (c.substring(0, 1).equals("B")) {
    System.out.println(c + " starts with a B.");
  }
}
```

There are also algorithms that can be used to modify the ArrayList. When this occurs, using a standard for loop is more useful because it is easier to access the indexes. The following algorithm reverses the elements of the list, by removing them one at a a time, and moving them to the front of the array list.

``` java
 //Reverse the order of the Strings in the list
for (int i = 0; i < colors.size(); i++)
{
  String col = colors.remove(i);
  colors.add(0, col);
}
System.out.println(colors);
```
 