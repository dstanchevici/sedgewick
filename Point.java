class Point {

    // Data fields
    double x, y;

    // Constructor 1
    Point ()
    {
        x = Math.random(); y = Math.random();
    }

    // Constructor 2
    Point (double x, double y)
    {
        // this. indicates the data fields of this class
        this.x = x; this.y = y;
    }

    double r()
    {
        return Math.sqrt (x*x + y*y);
    }

    double theta()
    {
        return Math.atan2 (y, x);
    }

    double distance (Point p)
    {
        double dx = x - p.x, dy = y - p.y;
        return Math.sqrt (dx*dx + dy*dy);
    }

    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }



}
