/*
  WRITE THIS CODE IN NOTEPAD OR VS CODE
  you have to create a package name com.codewithharry.shape
  this package should have individual classes Rectangle, Square, Circle, Cylinder, Sphere
  these classes should use inheritance to properly manage the code.
  includes methods like volume, surface area, getters & setters for dimensions
 */

class Rectangle01{
    int length;
    int height;
    int width;
    public void setRectangleVolume(int l, int h, int w){
        this.length = l;
        this.height = h;
        this.width = w;
    }
    public int getRectangleVolume(){
        return (length * height * width);
    }
}

public class AV_68_Exercise5{
    public static void main(String[] args){
        Rectangle01 rc = new Rectangle01();
        rc.setRectangleVolume(5,6,7);
        System.out.println("RectangleVolume : " + rc.getRectangleVolume());
    }
}
