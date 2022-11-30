# Classes and Objects

## U5 L2 Activity 4
This is a fun little activity, I really liked the challenging math component. Personally, it feels like it begins to delve into how mathematical programming can get.


## Notes from ProjectSTEM

### Methods

**Public** means that other classes can access the indicated method/class/variable.

**Static** is a bit of a tougher topic explained later in these notes.

**Void Methods:** methods that do not have a return statement. *Methods are declared outside the main statement, and called within it.* 

You can call methods from within the same class without a reference
``` java
// Calling a method outside a class requires a reference
Circle c = new Circle();
c.setRadius(10);

// Calling a method from within the class it is defined
// Just use the name of the method
public static void main(String[] args) {
  doStuff(); //Notice we don't need a dot operator or reference
}
```

Void Methods can also have **parameters**. These are local variables in the method headers that holds data sent to the method. Parameters are variables. Parameters in the void method header are called *formal parameters*, meanwhile the data sent in a method are called *actual parameters*, *arguments*, or *actual values*. 

When it comes to parameters...
- Use as many as you need!
- Use an combination of data types.
- Values are sent in from main, or the method that the other methods.
- Values being sent in are *arguments*.

**Return Methods:** methods that do have a return statement, but will always return a specific varialbe, or return type. 

Return methods are useful if you compute something that will be used later in the program. If the method performs a task that has no other impact on the code, use a void method.

Remember, that when a return statement is declared within a conditional in a loop, the loop will end once the conditional is found to be true, becuase it doesn't need to loop the conditional anymore to return anything more. 

``` java
  public static boolean hasDuplicates(String word) {
    for (int i = 0; i < word.length(); i++) {
      for (int j = i + 1; j < word.length(); j++) {
        if (word.substring(i, i + 1).equals(word.substring(j, j+1))) {
          return true;
        }
      }
    }
    return false;
  } // has Duplicates
```
#### **You can also call a method without catching return values,**
instead only using the method for it's side effects such as printing information.

#### **Return by Value**
When data is returned from a method, what is being returned is actually a copy of the value in the return statement. As a result, objects are returned as copies of memory addresses. 

#### **Overloading Methods**
You can overload methods as long as the parameters are different, however you cannot overload methods with two different return types. This is because the storing of data returned from a method doesn't happen until run-time. 

#### **Method Decomposition**
When we create methods to solve smaller problems of a bigger problem, this is called Method Decomposition. 

### Primitives vs. Class

Changes made to primitives ina  void method are not preserved, due to primitives being saved in memory directly. 

``` java
public static void addOne(int c) {
  c++;
  System.out.println(c);
}

public static void main(String[] args) {
  int x = 9; 
  addOne(x);
  System.out.println(x);
}
// The primitive is declared as having a value of 9. When passed into the method, only a copy of the value is sent into the method. So, while it prints out 10, it didn't acutally change the value of x, because x inside of the method becomes c, which is a copy of x.
```

Since class data types are stored as references in memory, when they are passed into a method, the values of the object can be changed and preserved. 

``` java
// c is a copy of object s, however, they are references, pointing to the same object
public static void addOneRadius(Circle c) 
{
  c.setRadius(c.getRadius() + 1);
  System.out.println(c);
}

public static void main(String[] args) 
{
  Circle s = new Circle(5.0); 
  addOneRadius(s);
  System.out.println(s);
}

// circle with radius 6.0
// circle with radius 6.0
```




