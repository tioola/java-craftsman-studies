Prepare for Things Going Wrong
---

01 - Fail Fast
02 - Always catch most specific Exception.
03 - Explain Cause in Message.
04 - Avoid Breaking the cause chain.
05 - Expose Cause in Variable.
06 - Always check type before cast.
07 - Always close Resources
08 - Always close Multiple Resources
09 - Explain Empty catch

Quick Notes
---

* Always catch the most expecific exception. Otherwise you might end up hiding a bug of your code. for example when you catch
NullPointerExceptions, those exceptions should not be catched since there is probably one bug that you must fix and therefore your
program should crash instead of silently hide a bug.

* If you catch Throwable you will even catch exceptions thrown by the virtual machine like "OutOfMemoryException"
so never chatch throwable. 

* Explain the cause in the message otherwise it will be hard to debug. try to follow the following template

```
[EXPECTED], but got [ACTUAL-VALUE] in [CONTEXT]
```

One example in java code would be something similar to the code below

```java
throw new IllegalArgumentException(String.format("Expected number , but got %s in %s", value1, value2))
```


* Explain empty cache. There are some situation where you need to leave a catch empty. In those cases please leave a comment
so the next developer can understand why that code is like that and the reason.