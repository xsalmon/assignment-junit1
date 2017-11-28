package circles;


/***
* Example JUnit testing class for Circle2 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle2Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;
   private Circle2 circle2Neg;
   private boolean isIntersected;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle2 = new Circle2(1,2,3);
   circle2Neg = new Circle2(-1,-2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle2.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle2.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}

//
//Test a simple scale up
//
@Test
public void simpleScaleUp()
{
   double r;
   System.out.println("Running test simpleMoveNeg.");
   r = circle2.scale(2);
   Assert.assertTrue(r==6);
}

//
//Test a simple scale down
//
@Test
public void simpleScaleDown()
{
   double r;
   System.out.println("Running test simpleMoveNeg.");
   r = circle2.scale(.5);
   Assert.assertTrue(r==1.5);
}
//
// Test to make sure that the x and y coordinates are in the
// correct order by printing them out
//
@Test
public void correctCoordinates()
{
   Point p;
   System.out.println("Running test correctCoordinates.");
   p = circle2.moveBy(0,0);
   System.out.println(p.x+" "+p.y);
   Assert.assertTrue(p.x == 1 && p.y == 2);
}

//
// Test to make sure the intersect method is working for true and not a border case
//
@Test
public void intersectTrue()
{
   Circle2 circleOverLap= new Circle2(1,1,2);
   System.out.println("Running test intersectTrue.");
   isIntersected= circle2.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==true);
}

//
// Test to make sure the intersect method is working for false and not a border case
//
@Test
public void intersectFalse()
{
   Circle2 circleOverLap= new Circle2(4,4,1);
   System.out.println("Running test intersectFalse.");
   isIntersected= circle2.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for a border case
//
@Test
public void intersectSameSize()
{
   Circle2 circleOverLap= new Circle2(1,2,3);
   System.out.println("Running test intersectSameSize.");
   isIntersected= circle2.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for a border case
//
@Test
public void intersectSameCenterDifferentRadius()
{
   Circle2 circleOverLap= new Circle2(1,2,2);
   System.out.println("Running test intersectSameSize.");
   isIntersected= circle2.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for a border case
//
@Test
public void intersectSidesTouching()
{
   Circle2 circleOverLap= new Circle2(6,2,3);
   System.out.println("Running test intersectTrue.");
   isIntersected= circle2.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for true for
// negative numbers and not a border case
//
@Test
public void intersectTrueNeg()
{
   Circle2 circleOverLap= new Circle2(-1,-1,2);
   System.out.println("Running test intersectTrueNeg.");
   isIntersected= circle2Neg.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==true);
}

//
// Test to make sure the intersect method is working for false for
// negative numbers and  and not a border case
//
@Test
public void intersectFalseNeg()
{
   Circle2 circleOverLap= new Circle2(-4,-4,1);
   System.out.println("Running test intersectFalseNeg.");
   isIntersected= circle2Neg.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for true for
// negative numbers and  a border case
//
@Test
public void intersectSameSizeNeg()
{
   Circle2 circleOverLap= new Circle2(-1,-2,3);
   System.out.println("Running test intersectSameSizeNeg.");
   isIntersected= circle2Neg.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}

//
// Test to make sure the intersect method is working for true for
// negative numbers and  a border case
//
@Test
public void intersectSidesTouchingNeg()
{
   Circle2 circleOverLap= new Circle2(-6,-2,3);
   System.out.println("Running test intersectTrueNeg.");
   isIntersected= circle2Neg.intersects(circleOverLap);
   Assert.assertTrue(isIntersected==false);
}



/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle2Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

