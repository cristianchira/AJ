package Basic_Principles_OOP.Aggregation;

/*                                               Aggregation in Java

    If a class have an entity reference, it is known as Aggregation.
    Aggregation is actually a special form of association.This means that it is referred as the relationship between
    two classes like Association. However, it’s a directional association, which means it strictly follows a one-way association.
    Aggregation represents:

        HAS-A relationship.

    The Aggregate class contains a reference to another class and
        is said to HAVE THE OWNERSHIP of that class. Each class that is referenced is considered to be a part of
        the Aggregate class.

    When use Aggregation?

        • Code reuse is also best achieved by aggregation when there is no is-a relationship.
        • Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects
          involved; otherwise, aggregation is the best choice.

    When to use Inheritance and Aggregation?

        • When you want to use some property or behaviour of any class without the requirement of modifying it or adding
              more functionality to it, in such case Aggregation is a better option because in case of Aggregation we are
              just using any external class inside our class as a variable.

        • Whereas when you want to use and modify some property or behaviour of any external class or may be want to add
              more function on top of it, its best to use Inheritance.

*/