``` java
// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();
 
// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();
```

``` java
array.add("Example");
```

``` java
array.size();
```

``` java
array.get(0); // This gets the value of the 0th index
```

``` java
array.set(1, "New Value"); // This sets the new value of the 1st index
```

``` java
array.remove(0);
array.remove("Example Name");
// You can remove via the index, or value of an index
// However, when using the value, it will only remove the first found value in the array.
```

``` java
array.indexOf("Example Name"); // Returns the index of matching index.
```

The following will show how to add different types of values to an array.

It's important to note that, for example, you CANNOT add an int value to a String array.

However, when you do not specifiy a value type during initialization, you can add different valeues.

These values will be stored as Objects.

They won't have access to certain methods without doing some fancy casting.

This is allowed, but it is preffered to use an actual array type.

``` java
ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(true); // reference to Car
// assortment holds ["Hello", 12, true]
```