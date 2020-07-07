Start Cleaning up
---
01-Avoid Unnecessary comparisons
02-Avoid Negations
03-Return Boolean Expressions Directly
04-Simplify Boolean Expressions
05-Avoid NullPointerException in Conditionals
06-Avoid switch Fallthough
07-Always use Braces
08-Ensure code Symmetry
09-What have you Learned 

Quick Notes
--- 

* Always replace magic number for constants. BUT if you have constants that can be grouped into a enum ALWAYS prefer enums. They can even help you to no forget
adding a value in case you have a new item for an specific group for example below. if you need a new speed type you won't forget to add the numeric value.

```java
public enum Speed{
    
    STOPPED(0),
    CRUISE_SPEED(110),
    MAXIMUM_SPEED(220);

}
``` 


* **DO NOT** modify collections when iterating over them.
* Group code with new lines

```java
//THIS IS BAD 
static final double MILE_IN_KILOMETERS = 1.60934;
static final int IDENTITY = 1;
static final double KILOMETER_IN_MILES = 1;

//THIS IS BETTER GROUPED
static final int IDENTITY = 1;
                                //This empty line separate them by concearns and keep the code more readable.
static final double MILE_IN_KILOMETERS = 1.60934;
static final double KILOMETER_IN_MILES = 1;


```

* Use StringFormat instead of concatenation, concatenation will make your code really hard to read