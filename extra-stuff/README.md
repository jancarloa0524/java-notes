# Extra Stuff
In this folder, you'll find just some extra stuff, but nonethless very useful notes to have.

### Notes:

*From CodingBat Java Warmup-1 > sleepIn*
- You do not have to use `var == true` or `var == false` when checking the value of booleans. You could just as easily just use `var` or `!var`. 
- When writing `if/else` statements with return statements, you don't actually have to have an else statement afterwards, because if the if statement is agreed with, all other code afterward is ignored. 
``` java
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (!weekday || vacation) {
    return true;
  }
```

*From CodingBat Java Warmup-1 > nearHundred*
- Sometimes, you don't even have to use `if/else` statements. If you are returning a boolean by comparing values in the `if` statement, you can just put it into a return statement. 
``` java
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}
```