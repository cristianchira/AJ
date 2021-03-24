package Recursion_In_Java;
/*

                                                     Recursion

    In Java, the function-call mechanism supports the possibility of having a method call itself. This functionality is
    known as recursion.

    There are two main requirements of a recursive function:

        ATest.A Stop Condition
            � the function returns a value when a certain condition is satisfied, without a further recursive call
        The Recursive Call
            � the function calls itself with an input which is a step closer to the stop condition

        For example, suppose we want to sum the integers from 0 to some value n:

            public int sum(int n) {
                if (n >= 1) {
                    return sum(n - 1) + n;
                 }
                 return n;
             }

                                             Tail Recursion Versus Head Recursion

    We refer to a recursive function as tail-recursion when the recursive call is the last thing that function executes.
    Otherwise, it's known as head-recursion.

                                                   Recursion Versus Iteration

    Recursion can help to simplify the implementation of some complicated problems by making the code clearer and more readable.

    But as we've already seen the recursive approach often requires more memory as the stack memory required increases
       with each recursive call.
    As an alternative, if we can solve a problem with recursion, we can also solve it by iteration.


    In comparison to recursion, the iterative approach could potentially give better performance. That being said,
    iteration will be more complicated and harder to understand compared to recursion,
    for example: traversing a binary tree.

     Making the right choice between head recursion, tail recursion and an iterative approach all depend on the specific
         problem and situation.

*/