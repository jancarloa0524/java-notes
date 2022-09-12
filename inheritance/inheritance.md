To basically explain **Inheritance**, it allows one class to obtain fields and methods from another class. For example, we create a class called "Shapes", but then also create a class called "Triangle". Recreating a bunch of the same fields and methods from "Shapes" would be annoying, but inheritance allows you to simply grab from "Shapes"

* _Parent class_, _superclass_, and _base class_ refer to the class that another class inherits from (like Shape).
* _Child class_, _subclass_, and _derived class_     refer to a class that inherits from another class (like Triangle).

Check `Spaghetti.java` for an explanation on `extends` and `super()`

Check `Noodle.java` for an explanation on `protected` and `final`

To basically explain **Polymorphism**, it allows for child classes to inherit info and behaviour from it's parent classes, while also creating it's own functionality. This is especially useful when creating Java packages for other devs to use. One thing to note is that the "Orange()" class can be used as a "Fruit()", but not the other way around. 

Check `Spaghetti.java` for an explanation of `@Override`, which overrides a method that may be used in the parent class.

Check `Noodle.java` and `Pho.java` for an explanation on "Using a child class as it's parent class. Look for `***` indicators

Check `Noodle.java` to see how to use sub-classes, in arrays, and iterate throught them. 

Finally, check `Order.java` to learn about how to use sub-classes as parameters. 