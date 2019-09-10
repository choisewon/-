package base;
import myInterface.Shape;

/**
 * Circle 클래스
 * 
 * @author (2018315059 이와사키 메구미) 
 * @version (2019.09.11)
 */
public class Circle implements Shape
{
    private int x,y,radius;
    
    public Circle(int x, int y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw()
    {
        System.out.println("반지름이 "+this.x+"인 원입니다.");
    }
    public double getArea()
    {
        return radius * radius * PI ;
    }
    public boolean equals(Object obj)
    {
        Circle c =(Circle)obj;
        if(x==c.x && y==c.y)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
