package myInterface;


/**
 *추상클래스가 들어있는 인터페이스
 *
 * @author (2018315059 이와사키 메구미, 2018315003 최세원, 2017315056 이토 아야카)
 * @version (2019.09.10)
 */
public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("___ 다시 그립니다. ");
        draw();
    }
}
