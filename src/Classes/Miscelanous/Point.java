package Classes.Miscelanous;


public class Point {
    public static int x;
	public static int y;
	public int useCount;
	int[] metrics;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public static final Point origin = new Point(0, 0);
    int[] w = new int[10]; // w[0] is an array component
 
    
	public static void main(String[] args) {
		
		
	}
    
    static {
    	 
		System.out.println(" Static initialliser " + y);
    	
    }
    
	public int[] populate(int n) {
		int[] pop = new int[n];
		for (int i = 0; i < n; i++) {
			pop[i] = i;
		}

		return pop;
	}

	public int arraySum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}