package JavaObject;

class Point {
    int x, y;
    Point() { System.out.println("default"); }
    Point(int x, int y) { this.x = x; this.y = y; }

    /* A Point instance is explicitly created at 
       class initialization time: */
    static Point origin = new Point(0,0);

    /* A String can be implicitly created 
       by a + operator: */
    public String toString() { return "(" + x + "," + y + ")"; }
}