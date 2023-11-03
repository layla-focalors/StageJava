package hw02;

import java.security.PublicKey;

class Point {
    private int x;
    private int y;
    void setX(int x_pos){
        if(x_pos <  0)
            return;
        else
            this.x = x_pos;
        return;
    }
    void setY(int y_pos){
        if(y_pos <  0)
            return;
        else
            this.y = y_pos;
        return;
    }

    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
}
public class hw02 {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();

        p1.setX(10); p1.setY(10);
        p2.setX(20); p2.setY(20);

        System.out.println("설정된 좌표 : (" + p1.getX() + ", " + p1.getY() + ") / (" + p2.getX() + ", " + p2.getY() + ")");
        return;
    }
}
