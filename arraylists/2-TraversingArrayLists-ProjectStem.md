# Traversing Array Lists

We can travel through arrays with both `for` loops and enhanced `for` loops. The following is an example:

``` java
ArrayList<String> breeds = new ArrayList<String>();
breeds.add("Boxer");
breeds.add("Bulldog");
breeds.add("Poodle");

for (int i = 0; i < breeds.size(); i++) {
  System.out.println(breeds.get(i));
}

// Other option

for (String s: breeds) {
  System.out.println(s);
}

// Both will output all values in the ArrayList
```

## Be Careful Modifying ArrayLists with Loops!

If we were to remove values of an ArrayList with a `for` loop, take caution to not accidentally mess up the array. 

``` java
for (int i = 0; i < breeds.size(); i++) {
  breeds.remove(i);
} 
```

On the surface, while this might work, logically it will not due to what happens after an item is removed. The item ahead of it, if any, will then be moved to the position that was just removed, as well as every item after it. So, when we move ahead in the array, we will always skip a string. An easy fix for this is to move backwards, instead.

``` java
for (int i = breeds.size() - 1; i >= 0; i--) {
  breeds.remove(i);
} 
```

This will start from the end, and essentially decrease the size of the array everytime we decrement `i`.

*Personal Note: A while loop works fine, too. Easier to understand as well.*
``` java
while (list.size() > 0) list.remove(list.size() - 1);
// While the size of the array is greater than 0, remove the current last value in the array
```

Inserting items in the array also requires caution, and is best done backwards.

``` java 
for(int i = breeds.size() - 1; i >= 0; i--){
  breeds.add(i, b); // Rememmber, when you insert a value, it will shift the values after that point forward, meaning whatever value i is, and before it, won't change. So, traversing backwards works best. 
}
```

## Traversing Multiple ArrayLists

When traversing multiple array lists, a standard for loop is better. Example: Checking if there is any difference between two ArrayLists.

``` java
ArrayList<String> breeds = new ArrayList<String>();
breeds.add("Boxer");
breeds.add("Bulldog");
breeds.add("Poodle");
ArrayList<String> breeds2 = new ArrayList<String>();
breeds2.add("Beagle");
breeds2.add("Bulldog");
breeds2.add("Schnauzer");

for (int i = 0; i < breeds2.size(); i++) {
    if (!breeds2.get(i).equals(breeds.get(i))) {
        System.out.println("We found a spot where these lists have different breeds:");
        System.out.println("Breeds 1 contains: " + breeds.get(i));
        System.out.println("Breeds 2 contains: " + breeds2.get(i));
    }
}
```