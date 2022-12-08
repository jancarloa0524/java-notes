# Arrays of Strings

## Class Data Types in Arrays

Arrays can hold class data types, stored the same way as primitives. 
``` java
String[] superhero = new String[5];
```
Then, in order to set the values of each element, we set them one by one or use a loop
``` java
superhero[0] = "Batman";
```
The other four boxes are currently `null`. 

**Quick Tip**
You can also use user input for arrays!
``` java
for (int i = 0; i < superhero.length; i++) {
    System.out.println("Enter a superhero: ");
    superhero[i] = scan.nextLine();
}
```

## Calling Methods on Objects in Arrays.

We can call methods on objects, and so we can call them on objects in arrays as well. 
``` java
superhero[o].length(); // will return length of string "Batman"
```

We again can use a *for loop* to repeat commands through a set of objects. 
``` java
for (int i = 0; i < superhero.length; i++) {
    int len = superhero[i].length();
    String fn = superhero[i].substring(0,1); // First char
    String ln = superhero[i].substring(len - 1); // Last char
    System.out.println(fn + ln);
}
```

### Practice: