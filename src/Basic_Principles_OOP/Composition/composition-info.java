package Basic_Principles_OOP.Composition;

/*                                                    Composition in Java

    Composition is a more restricted form of Aggregation. Composition can be described as when one class which includes
    another class, is dependent on it in such a way that it cannot functionally exist without the class which is included.
    For example a class Car cannot exist without Engine, as it won't be functional anymore.

    The Composition is a way to design or implement the "has-a" relationship. Composition and Inheritance both are
        design techniques.
    The Inheritance is used to implement the "is-a" relationship.
        The "has-a" relationship is used to ensure the code reusability in our program. In Composition, we use an instance
        variable that refers to another object.
    In a simple way, we can say it is a technique through which we can describe the reference between two or more classes.
    And for that, we use the instance variable, which should be created before it is used.

    Key Points

        � The Composition represents a part-of relationship.
        � Both entities are related to each other in the Composition.
        � The Composition between two entities is done when an object contains a composed object, and the composed object
              cannot exist without another entity. For example, if a university HAS-ATest.A college-lists, then a college is
              a whole, and college-lists are parts of that university.
        � Favor Composition over Inheritance.
        � If a university is deleted, then all corresponding colleges for that university should be deleted.

 */