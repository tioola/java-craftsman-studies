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

* Avoid switch fallthrough (do not forget the break or prefer if statements)
```java
public void swtichFallthrough(Money money){
    
 switch (money){
    case REAL:
        addReal(money)// here the execution won't stop, this will cause a big bug
    case EURO:
        addEuro(money);
        break;
    case DOLAR:
        addDolar(money);
        break;
    }
}

```

* Always use braces and avoid unreadable code that seems to be executed in the same condition but aren't
```java

 if(condition)//Without curly braces they seems to be executed in the same condition but are not
    execute1();
    execute2();

```

 * Ensure Code Symmetry: Sometimes a space or even better a private method can ensure symetry and improve your code example
 
 ```java

  public void doWithdraw(){
    UserTYpe type =user.checkType;
    if(type = AUDITED){
        reportOperation();
    }  
   callFirstWithdrawRequiredmethod();
   callFirstWithdrawRequiredmethod();
   callFirstWithdrawRequiredmethod();
}

```

The code above is together but has semantically 2 parts, one to check audit and another to do an withdraw operation. having
them together is really hard to read

To solve this issue we could simply add an space and keep our code symetric (or even create private methods to separate them). 


 
 ```java

  public void doWithdraw(){

    UserTYpe type =user.checkType;
    if(type = AUDITED){
        reportOperation();
    }
  
   callFirstWithdrawRequiredmethod();
   callFirstWithdrawRequiredmethod();
   callFirstWithdrawRequiredmethod();
}

```
