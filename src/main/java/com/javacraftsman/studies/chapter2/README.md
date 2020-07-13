Level up Your code style
---
01-Replace magic numbers with constants
02-Favor Enums Over Integer Constants
03-Favor For-Each Over For Loops
04-Simplify Boolean Expressions
05-Avoid Collection Modification During iteration
06-Avoid Compute-Intensive Operations during iteration
07-Group with new Lines
08-Favor Format Over Concatenation
09-Favor JAVA API Over DIY
 

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