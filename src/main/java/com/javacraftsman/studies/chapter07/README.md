Design your objects 

---

01-Split Method with Boolean Parameters
02-Split Method with Optional Parameter
03-Favor abstract over Concrete Types
04-Favor Immutable Over Mutable State
05-Combine State and Behavior
06-Avoid Leaking Reference
07-Avoid returning null
08-What have your learned


---

Quick Notes

---

* If you have a method that uses a boolean as parameter to split the logic like below

```java
public void writeMessage(String message, boolean sendToBoss){}
```

It is way better to split it in two methods with two different names. This will give your methods way more meaning like


```java
public void writeMessageToBoss(String message){}

public void writeMessageToEmployees(String message){}
```

Now your code gets way more readable...

----

* Another case similar to the example above is when you use null as an indicator to do something. A common example is when
you have a method to read the entries and if the client pass null then you return all entries. This is not interesting. 
Instead you should have two separated method like;


```java

public void readEntries(LocalDate entryDate){
    requiresNonNull(entryDate)
    // Logic
}

public void readAllEntries() {}

```

The read All entries should be the method responsible.


---

* Always favor Immutable object (please check my other study project for more details)
---

* Avoid returning null.

To not cause any problems you should return a null object pattern which is a object that represents the null object
like **empy string** or **empty list** or even returning an optional.