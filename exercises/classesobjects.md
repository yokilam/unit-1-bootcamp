#Classes & Objects

###Resources

* [Video - Classes and Objects](https://www.udemy.com/java-tutorial/#/lecture/137826)
* [Unit 0 - Classes pt. I](https://github.com/accesscode-2-1/unit-0/blob/master/lessons/week-2/2015-03-17_classes-part-1.md)
* [Unit 0 - Classes pt. II](https://github.com/accesscode-2-1/unit-0/blob/master/lessons/week-2/2015-03-19_classes-part-2.md)
* [Unit 0 - Classes pt. III](https://github.com/accesscode-2-1/unit-0/blob/master/lessons/week-2/2015-03-21_classes-part-3.md)
* [Java Tutorial - Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
* [Java Tutorial - Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html)

###Exercises

Complete these exercises in `ClassesAndObjects.java`. Please use the `Cat.java` class to complete these exercises.

####1. Cool cats

1. Create 3 cats named `Garfield`, `Pink Panther`, and `Catwoman`.
2. Assign each of them a favorite food (Garfield's favorite food should be `Lasagna`).
3. Assign each of them an age.

####2. isOlder

Write a method called `isOlder` that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.

```
ex: // if Garfield is 9 years old and Catwoman is 10 years old
    isOlder(garfield, catwoman) returns false
```

####3. Best Friends

Write a method called `makeBestFriends` that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.

*Hint: this method does not return anything!*

####4. Kitten

Write a method called `makeKitten` that takes 2 Cats as parameters and returns a new Cat with a name that is the combination of the 2 parent Cats' names. The age of the new Cat should be `0`.

```
ex: makeKitten(garfield, catwoman) returns a Cat named "GarfieldCatwoman" with age 0
```

