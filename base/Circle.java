package base;


/**
 * 여기에 Circle 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Circle
{
    private int x,y,radius;
    
    public Circle(int x, int y, int radius)
    {
        this.x = x;
    }
    public void draw()
    {
        System.out.println("반지름이 "+this.x+"인 원입니다.");
    }
    public double getArea()
    {
        return this.x * this.x *  radius ;
    }
}
