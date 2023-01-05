# ArrayLists

ArrayLists are collections that can store class data types, or objects, so it is similiar to a regular array, except it only stores references to data that it contains. 

ArrayLists are mutable, meaning they can be changed, so it's size is not fixed. So, you can add/remove data without losing any data. 

ArrayLists are also a class, so they come with their own methods that we can use to modify the ArrayList.

## Declaring ArrayLists

To declare an Array List:
1. Import the class: 
    ``` java
    import java.util.ArrayList;
    ```
2. Create an ArrayList using constructors:
    ``` java
    ArrayList<DataType> list = new ArrayList<DataType>();
    ```
    Note: There are no parameters for ArrayList constructors. If you want to create a list with a set number of boxes, insert a number into the parenthesis, `new ArrayList<DataType>(10)`
3. Specify the class
    ``` java
    ArrayList<String> list = new ArrayList<String>();
    ```

## AP EXAM NOTE: 
These are the specific ArrayList methods you MUST know
- list.add(e); *Adds e to the end of the list*
- list.add(i,e); *Adds element e at location i*
- list.set(i,e); *Resets element at i with object e*
- list.get(i); *Returns the element at i*
- list.remove(i); *Removes element at i*
- list.size(); *Returns number of elements in list*

*Add and remove methods will shift the rest of the data either forward or backward in order to prevent data loss/empty boxes.*

ArrayLists index just like regular arrays, starting from 0, ending at length - 1. 

## Wrapping Primitives for ArrayList
Since ArrayLists cannot store primitives, it cannot store values like `int`, so we must use Wrapper Classes. 

``` java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(2);
list.add(5);
list.add(0);
System.out.println(list);

// > [2, 5, 0]
```

