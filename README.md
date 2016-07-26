# Java 8 Functional Interfaces
A short demo of the java 8 functional interfaces and syntax. 
Specifically focussed on functialan interfaces, lambdas and the stream API.

___

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

For an example of how functional interfaces are implemented, refer to [the formulas package](/src/formulas).
There are also some built in functional interfaces:
* Predicates
* Functions
* Comparators
* Consumers
* etc.
