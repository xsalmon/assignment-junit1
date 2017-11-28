package circles;


public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

/* 
 * @see circles.Circle#intersects(circles.Circle)
 * 
 * ERROR FOUND: if radius is different but the center is the same will return true
 * Test case that found error was intersectSameCenterDifferentRadius
 */
public boolean intersects(Circle other)
{
   if (Math.abs(center.x - other.center.x) < radius &&
       Math.abs(center.y - other.center.y) < radius &&
       (Math.abs(center.x - other.center.x) > 0 ||
       Math.abs(center.y - other.center.y) > 0))
      return true;
   return false;
}

}

