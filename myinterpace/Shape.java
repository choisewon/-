package myinterpace;


/**
 *   인터페이스 Shape - 여기에 인터페이스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전 번호나 날짜)
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
