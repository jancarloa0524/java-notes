Order.java goes over conditionals and control flow

Reservation.java goes over conditional operands

All possible && combos:
``` java
true && true
// true
false && true
// false
true && false
// false
false && false
// false
```

All possible || combos:
``` java
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

## !!! AP EXAM NOTE !!!
The compiler will not check the other operands in an OR statement as long as the first operand it comes across is true, because it only needs that operand to be true. 

``` java
if (1 > 0 || 2 / 0 == 7) {
  System.out.println("No errors here!");
}
```
So despite the fact that `2 / 0 != 7`, the compiler won't check this statement anyway because `1 > 0`.

NOT _unary_ operator
``` java
!false
// true
!true
// false
```

Conditional Operators can be comined. Try figuring out what these booleans return:
``` java
public class Operators {
  public static void main(String[] args) {
    int a = 6;
    int b = 3;

    boolean ex1 = !(a == 7 && (b >= a || a != a));
    System.out.println(ex1);

    boolean ex2 = a == b || !(b > 3);
    System.out.println(ex2);

    boolean ex3 = !(b <= a && b != a + b);
    System.out.println(ex3); 

  }
}
```