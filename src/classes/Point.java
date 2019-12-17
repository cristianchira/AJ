package classes;


public class Point {
    public static int x;
	public static int y;
	public int useCount;
	int[] metrics;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public static final Point origin = new Point(0, 0);
    
	public static void main(String[] args) {
		
		
	}
    
    static {
    	 
		System.out.println(" Static initialliser " + y);
    	
    }
}