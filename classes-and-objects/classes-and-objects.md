# Classes and Objects

## U5 L2 Activity 4
This is a fun little activity, I really liked the challenging math component. Personally, it feels like it begins to delve into how mathematical programming can get.


## Notes from ProjectSTEM

### *Methods*

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

### *Primitives vs. Class*

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

### *Classes*
Classes have two features, **variables** and **methods** (fields and behaviours).

`public static void main(String[] args) {}` is always necessary for a class. 

When we begin writing classes, we need to declare our variables for the project. We need to use the keyword `private` to make sure other classes do not interfere with these variables. These variables basically make up the "characteristics" of a class.

``` java
public class Car {
  private String model;
  private String make;
  private int year;
  private int mph;
}
```

We can then use these variables to create **constructors**. Constructors are used to create the objects within our programs. They are declared like a method is, but without the return type and the name must be the same as the class. Constructors can also have their own parameters, so they can also be overloaded, and are identified based on the parameters passed in. 

``` java
public class Car {
  // private var's here
  public Car() {
    // create the car like this!
  }

  public Car(String carModel, int yearMade) {
    // create car like that!
  }

  public Car(String carMake, int yearMade, int mph) {
    // Or create it like this!
  }
}
```

#### **Validating Data**
When we are creating our constructors, we also want to make sure the user doesn't send in data that wouldn't give the intended results. For example, what if we don't want the user to enter a year less than 1885?

``` java
public class Car {
  public int year;

  public Car(int yearMade) {
    if (yearMade < 1885) {
      year = 2000;
    } else {
      year = yearMade;
    }
  }
}
```

This, however, might not always make sure our data remains valid. Notice, we declared `year` as a public instead of private variable. If a user were to enter the following:

``` java
Car c1 = new Car(2000);
c1.year = 1885;
```

They would have been able to force the year the car was made to be 1885, despite our data validation. However, if we had set `year` to private, the user would end up with an error!

`Error: year has private access in Car.`

But, what if we did want to allow users to modify objects?

#### *Accessors and Mutators*

In order to allow users to *see* data, we can create an **accessor** method. 

``` java
public String getCarModel() {
  return model;
}
```

In order to allow users to *modify* data, we create a *mutator* method.

``` java
public void setYearMade(int yearMade) {
  year = yearMade;
}
```

### **toString**
If we try to print an object to the console, more often than not we just end up with a string of numbers and letters, this is the memory address. 

We can adjust this with the *toString* method. 

``` java
public String toString() {
  return "A " + model + " " + make + " from " + year + ", with " +  mph + "mph.";
}
```

### **"this"**

The "this" keyword is a pretty useful keyword, this is how you use it :> (don't really have a good explanation for it yet): 

``` java
public class Car {
  private String model;
  private String make;
  private int year;
  private int mph;

  public Car() {
    this.model = "unknown";
    this.make = "unkonwn";
    this.year = 2000;
    this.mph = 0;
  }
}
```

