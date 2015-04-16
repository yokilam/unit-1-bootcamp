#Conditionals

###Resources
[If-then/If-then-else](https://github.com/accesscode-2-1/unit-0/blob/master/lessons/week-0/2015-03-05_input-if.md#if-then-statement)

[Complex conditionals/combining boolean expressions](https://github.com/accesscode-2-1/unit-0/blob/master/lessons/week-1/2015-03-08%20boolean%20and%20while.md#complex-conditionals)

###Exercises

> 1. Write a method `isOdd` that takes in an `int` n. Returns a `true` if n is odd, and `false` otherwise.
> 2. Write a method `isMultipleOfThree` that takes in an `int` n. Returns `true` if n is a multiple of three, and `false` otherwise.
> 3. Write a method `isOddAndIsMultipleOfThree` that takes in an `int` n. Returns `true` if n is both odd and a multiple of three, and false otherwise.
> 4. Write a method `isOddAndIsMultipleOfThree2` - if you used `isOdd` and `isMultipleofThree` in your last solution, don't use it this time. If you did not, write this method building on your last methods.
> 5. Write a method `fizzMultipleofThree` that takes in an `int` n and prints "Fizz" if n is a multiple of three, and prints n otherwise.

Look at [Person.java](https://github.com/accesscode-2-1/unit-0-assessment/blob/master/src/nyc/c4q/Person.java) from the assessment.

> 5. Write a method that takes in a `Person` and returns `true` if the person is from London, and `false` otherwise.
> 6. Write a method that takes in a `Person` and prints the name if the person has a name longer than 5 characters, and otherwise prints "Name is too short."

###Exercises++

####1. Cigar Party

When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Write a method called `cigarParty` that takes an `int` (the number of cigars) and `boolean` (whether or not it is the weekend) as parameters, and returns `true` if the party with the given values is successful, or `false` otherwise.

####2. Lottery Ticket

You have a green lottery ticket, with `int`s a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10. Write a method that takes 3 `int`s as parameters and returns the correct result.

