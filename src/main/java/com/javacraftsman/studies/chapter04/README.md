Name Things Right
---

01-Use Java Naming Conventions
02-Follow Getters and Setters
03-Avoid Single-Letter Names
04-Avoid Abbreviations 
05-Avoid Meaningless Terms
06-Use Domain Terminology
07-What Have you Learned?

Quick Notes
---

I won't get into too much details in this topic since there are really basic topics but some interesthing points to consider

* JavaBeans is actually described in an official specification ( I tought it was only EJB spec) which states that a javabeans must have
     *private properties
     *public no argument constructor
     *implements serializable
     
* Avoid meaningless terms to describe a nmethod like 
"Main", "Manager", "Data", "INfo" or "Flag"

A bad class name would be for example 

```java
class MainSpaceShipManager{

}
```

as you can see we are using 2 bad words "Main" and "Manager". A better name would be for example

```java
class SpaceShip {

}
```

in case of method you can take bad names as

"Invoke,"call" or "do"


---

*Use Domain Terminology- Do not try to invent names which doesn't have any links with the domain terminology. The closest you are with the business the better.



