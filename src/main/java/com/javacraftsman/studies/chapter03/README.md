Use Comments Wisely
---

01-Remove Superfluous Comments
02-Remove Commented-Out Code
03-Replace Comments with Constants
04-Replace Comments with Utility Methods
05-Document Implementation Decisions
06-Document Using Examples
07-Structure Javadoc of Packages
08-Structure Javadoc of Classes and interfaces
09-Structure Javadoc of Methods
10-Structure Javadoc of constructors.


Quick Notes
---

* Do not leave commented code. You have github to do it.
--- 
* The best kind of comment is comments that explain decisions that you took in your code for example you can use the template below

```
    In the context of {USE CASE}
    facing [CONCERN]
    we decided for [OPTION]
    to achieve [QUALITY]
    accepting [DOWNSIDE]
```

One practical example is

```java
/*
 * In the context of checking availability of supplies by name,
 * facing severe performance issues with > 1000 supplied 
 * we decided to use the binary search algorithm
 * to achieve item retrieval within 1 second,
 * accepting that we must keep the supplies sorted
/*

return Collections.binarySearch(list, new Supply(name)) != -1
```
---
* You should create javadoc for your packages but ALWAYS describe the general purpose of the package instead of listing the classes
or doing something that will get obsolete easily. take the Example below as an example to comment your packages.

```java

/*Classes for managing the certificates of a municipality
 * 
 *<p>
 *The core class is the CitizenCertificate {@link certificates.CitzenCertificates} that lets you
 * create any type of certificate for a citizen. 
 * </p>  
 
*<p>
*Example
*CitzenCertificate.birthCertificateFor(citizen);
*...
*...
*...
*more code of demonstration
*<p> */


package certicates;
``` 

----

* Structure the javadoc of your classes and interfaces always try to structure the comments having a summary and below a more detailed description of it. 
Do not create the summary only to repeat the name of the interface/class below you can see a bad example:

```java

/**
*
* This class represents a citizen certificate.  
**/


interface CitizenCertificate{}

```
a correct example would be


```java


/**
* A citizen certificate contains the birth. death or marriage information of the citzen/ (this is the summary)

<p> (this is the detail)
 The citzen data is loaded from the government database and enriched with application information which is populated
by our local database. (more info) 
</p>   
**/

interface CitizenCertificate{}

```