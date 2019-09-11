package base;
import myInterface.Shape;

/**
 * 원의 반지름과 두개의 원의 중심이 같은지 구별해주는 클래스
 * 
 * @author (2018315059 이와사키 메구미, 2018315003 최세원, 2017315056 이토 아야카) 
 * @version (2019.09.10)
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
        if(this.x==c.x && this.y==c.y)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
