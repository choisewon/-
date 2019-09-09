package myInterface;


/**
 * Write a description of interface Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Shape
{
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("___ 다시 그립니다. ");
        draw();
    }
}
