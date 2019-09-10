package main;
import base.Circle;

/**
 * MyApp 클래스
 * 
 * @author (2018315059 이와사키 메구미) 
 * @version (2019.09.11)
 */
public class MyApp
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2,3,5);
        Circle c2 = new Circle(2,4,10);
        System.out.println("원1 : " + c1);
        System.out.println("원2 : " + c2);
        if(c1.equals(c2))
        {
            System.out.println("같은 원");
        }
        else
        {
            System.out.println("서로 다른 원");
        }
    }
}
