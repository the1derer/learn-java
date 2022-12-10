# Initializer Block (In-It block)

* In-It block is always executed before every constructor.
* You can have >1 In-It block in single class. And they are executed in the order in which they are defined in a class

## RULES

* In case of No constructor chaining ---> complete code of 'IN-IT' block is inserted in every constructor as a first line by the compiler.
* In case of Constructor chaining ---> complete code of 'IN-IT' block is inserted in that constructor as 1st line in which there is no `this()` as a 1st line.

Note: If you want a common task in every constructor put the  task in 'IN-IT' block.
