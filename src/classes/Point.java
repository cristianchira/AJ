package classes;


public class Point {
    public final int X =55;;
	public static int y;
	public int useCount;
//    public Point(int x, int y) { this.x = x; this.y = y; }
   // public static final Point origin = new Point(0, 0);
    
    static {
    	 
		System.out.println(" Static initialliser" + y);
    	
    }
}