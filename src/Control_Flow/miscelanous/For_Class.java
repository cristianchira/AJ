package Control_Flow.miscelanous;

public class For_Class {
	public static void main(String[] args) {
//		for (int i = 1; i < 11; i++) {
//			System.out.println("Count is: " + i);
//		}

		//Any	of	3	parts	in	a	for	loop	can	be	empty.
//		for (;;)	{
//			System.out.print("I	will	be	looping	for	ever..");
//		}

		//Result:
		//Infinite	loop	=>	Loop	executes	until	the	program	is	terminated.


		for (int j	=	0;	j	<	2;	j++)	{
			for (int k	=	0;	k	< 10;	k++)	{
				System.out.print(j	+	"" +	k);
				if (k	==	5)	{
					break; //Takes out of inner loop using k
				}
			}
		}
//		Program	Output
//		000102030405101112131415

	    // Each time the value	of	k is 5	the	break statement	is	executed.
		//Labels are used when we want to exit from outer loop
		System.out.println ();
		outer:
		for (int l	=	0;	l	<	2;	l++)	{
			for (int k	=	0;	k	<	10;	k++)	{
				System.out.print(l	+	"" +	k);
				if (k	==	5)	{
					break outer;//Takes	out	of outer loop
				}
			}
		}

//		Program	Output
//		000102030405



	}
}
