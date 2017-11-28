package circles;


public class Circle2 extends Circle
{

/**
 * @param x
 * @param y
 * @param radius
 * ERROR FOUND: the x and y variables got swapped 
 */
public Circle2(double x, double y, double radius)
{
   super(x,y,radius);
}

/* 
 * @see circles.Circle#intersects(circles.Circle)
 * 
 * ERRORS FOUND: if user accidentally enters negative number nothing caught it and fixed it. 
 *   Also there is nothing to handle if the circles have the same center
 * Test cases that found these errors were by accident and intersectSameCenterDifferentRadius
 */
public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   if (d < Math.abs(radius) && d>0)
      return true;           
   else
      return false;
}

}

