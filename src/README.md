***Java 8***

**Functional Interface**

*What is the type of a lambda expression?*

A lambda expression is a Functional Interface.

A *Functional Interface* is an interface with only one *abstract* method.

*Can a lambda be put in a variable?*

Yes. Consequences: a lambda can be taken as a method parameter, and can be returned by a method.

*Is a lambda expression an object?*

The answer is complex, but no. It is a object of a new kind.
A lambda is an object without an identity. A lambda expression should not be used as a regular object. A lambda expression should be seen as a piece of code that can be moved around, that can be used in many places, but absolutely as an object that can be called methods on or that you can use to synchronize a piece of code.  
