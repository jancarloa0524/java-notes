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

### *Practice:*

#### **Outside, Middle**

``` java
String[] word = {"algorithm", "boolean", "int", "double"};
// Hint: First loop edits String[] word.
for (int i = 0; i < word.length / 2; i++) {
  word[i] = word[word.length - 1 - i];
  word[word.length - 1 - i] = word[i];
}
// Hint: Only outputs the final array.
for (int i = 0; i < word.length; i++) {
  System.out.print(word[i] + " ");
}
```
*Answers Below*
>! `double int int double` is the final answer. 

>! Explanation: During the first loop iteration, the 0th (1st) index is selected, then set equal to (the length of the array - 1 - the selected index value), which for the first iteration ends up being th 3rd (4th) index. The 3rd index is then set to itself, because we already set the selected index to the same value as the 3rd index. Knowing this, we know that the next iteration of the loop will set the middle values to `int int`. On the third iteration, it will also be set to `int int` because we now select the 2nd index and set it equal to the 1st index (4 - 1 - 2 = 0). The final iteration will then set the outer values to `double double`, because again, the 3rd index is just set equal to the 0th index and vice versa (4 - 1 - 3 = -)

---

#### **Remove "ben" words**

``` java
String[] words = {"BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATE","BEREFT", "BEWILDER"};
for (int i = 0; i < words.length; i++)
{
  if (words[i].substring(0, 3).compareTo("BEN") != 0) {
    System.out.print(words[i] + " ");
  }
}
```
There is really no answer for this one because the name gives away what the output would be. Remember that `compareTo()` returns a numerical value giving the lexigraphically greater string, which in this case, if the very beginning of the string is not equal to "BEN" then it is printed out.

---

#### **Which one outputs the *first* biggest string, and which one outputs the *first* smallest string?**

``` java
String[] words = {"BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATED", "BEREFT", "BEWILDER"};
int s = words.length - 1;
for (int i = 0; i < words.length; i++) {
  if (words[s].length() > words[i].length()) {
    s = i;
  }
}
System.out.println(words[s]);
```

``` java
String[] words = {"BEAUTIFY", "BENEVOLENCE", "BENIGN", "BEQUEST", "BERATE", "BEREFT", "BEWILDER"};
int s = 0;
for (int i = 0; i < words.length; i++) {
  if (words[s].length() < words[i].length()) {
    s = i;
  }
}
System.out.println(words[s]);
```

>! The answer is: The first set of code will give the first shortest word, the second set of code will give the first longest word. The reason why is simple. Both go through every string in the array, howver, for the first set of code, if the current shortest word's length is greater than the length of the word we are checking in the array, then that word will become the shortest word. For the second set of code, if the current selected word has a length less then the word we are checking in the array, set the current longest word to that word. 

---

#### **What should be the missing line?**

#### *Example 1:*

*The following code is intended to count how many “hard” spelling words are assigned in a week. A hard spelling word is defined as having more than 5 letters.*
``` java
String[] list = /* initialized to the spelling words */;
int hard = 0;
for (int i = 0; i < list.length; i++) {
  if (/* missing code */) {
    hard++;
  }
}
System.out.println("Hard words: " + hard);
```

>! The answer is `list[i].length() > 5`

>! The reason for this is simple, we are only incrementing the value of `hard` everytime we find a word with a length longer then 5. 


#### *Example 2:*
*A student is having trouble remembering how to spell words that end in –ing. She needs a program to count how many ing words she has each week in her spelling list.*
``` java
String[] list = /* initialized to the spelling words */;
int ing = 0;
for (int i = 0; i < list.length; i++) {
  if (list[i].length() > 3) {
    if (/* missing code */) {
      ing++;
    }
  }
}
 System.out.println("Number of ing words: " + ing);
```

>! The answer is: `list[i].substring(list[i].length() - 3, list[i].length() ).equals("ing")`

>! This answer is quite long, but we can simplify it. Lets call `list[i]`, `word`. So, first the program has to check if the length of the string is greater than 3, so that we don't have to check these words since they obviously don't end in 'ing'. Then, we have to check whether or not the ending of the word actually ends in 'ing'. So, we can get the last three characters of the current word with `.substirng()`, and `.length()`. We would get: `word.substring(word.length() - 3, word.length())`. Lets call that part of the code `ending`. From here, we just use the `.equals()` method to make sure the substring is equal to 'ing'. We would get: `ending.equals("ing")`!

*Just a quick idea, variable masking:*

When writing code, we should make sure to "mask" sections of code under names so that they are easier to understand. We can do this with comments. So, for example:
``` java
word.substring(word.length() - 3, word.length())
```
This line of code would take some time to process, and if we begin using it in conjuction with other methods and variables, things get messy. So, we should type in comments what we want to "mask" our variables as.

``` java
word.substring(word.length() - 3, word.length()).equals("ing")
// word.substring(word.length() - 3, word.length()) = "ending"
// ending.equals("ing");
// Just checks if a word ends in "ing".
```

By putting the previous block of code under a "variable mask", personally, I feel like it's easier to understand the code because it tells me what that block does right away. If we have a huge line of methods and variables being used, this system would allow us to simplify our code and make it more readable without reducing efficency. 