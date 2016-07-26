# Java 8 Functional Interfaces
A short demo of the java 8 functional interfaces and the syntax to use them.  
Specifically focussed on functialan interfaces, lambdas and the stream API.

___

## Questions before we start

Q: What is a function?  
A: In the simplest of terms, it is simply a collection of instructions to be performed on a given input (also simply known as a block of code)

Q: What is functional programming?  
A: It is a programming paradigm where functions are the main focus of operation. In most cases functions can be passed to other functions as parameters where they can be called later. The ultimate goal of a functional programmer is to try to code functions that do not have side effects (i.e. the output for a given set of input parameters do not change with time.

Q: What are some advantages of functional programming?  
A: 
* Because functional programming is related to mathematical functions, they are often easier to reason and think about
* Often less code is required to perform the same requirements
* Almost trivial to implement parallel processes which intern may give a performance boost

Q: What are some disadvantages of functional programming?  
A:
* Requires a paradigm shift in your reasoning about code
* Especially in the beginning, the syntax seems confusing

___

## Functional Interfaces

The @FunctionalInterface annotation is how java-8 identifies classes that are eligable for being called as a function. The only requirement for a class to be used as a function is that it may only contain one public method.
For an example of how functional interfaces are implemented, refer to [the formulas package](/src/formulas).
There are also some built in functional interfaces which you can do further study on:
* Predicates
* Functions
* Comparators
* Consumers
* etc.

## Lambda syntax

A lambda function is simply an anonomous implementation of a class that implements a functional interface. 
For an example of what the syntax looks like, refer to [the Lambdas class](/src/formulas/Lambdas.java) in [the formulas package](/src/formulas) and the [lambdasexample package](/src/lambdaexample).

## Method referencing functions

If all you need is to call a single method of a particular class, you can use the method referencing syntax as a shorthand for wrapping it into a function. Refer to [the References class](/src/formulas/References.java) to see what the syntax looks like.

___

## Stream API / Modals

Q: What is a stream / modal?  
A: A java stream (also called a modal in other programming languages) is a way of describing the operations to be performed on a collection of objects. Usually each step or operation is applied to each of the objects in the collection individually.

There are two major types of operations that can be applied to a stream:
* Intermediate
* Terminal

**Intermediate operations** can be chained together so that multiple operations can be applied to the same stream. How this is achieved is that each intermediate method returns a new stream containing the items where that specific operation has been applied.

**Terminal operations** are the final link in the operations chain. They will return either void or whichever return type is required depending on the specific operation.

For some examples of how to access the stream API and some of the operations that are available refer to [the StreamsDemo class](/src/streams/StreamsDemo.java).
