package org.example.task1.Point;

public class Point implements Movable{
    private int coordinate_X;
    private int coordinate_Y;

public void setCoordinate_X (int coordinate_X) {
    this.coordinate_X = coordinate_X;
}
public void setCoordinate_Y (int coordinate_Y) {
    this.coordinate_Y = coordinate_Y;
}

    @Override
    public void moveUp() {
        int y1 = coordinate_Y+1;
        System.out.print("координаты Y: " + "(" + y1);
    }

    @Override
    public void moveDown() {
    int y2 = coordinate_Y-1;
        System.out.println(", "  + y2 + ")");
    }

    @Override
    public void moveLeft() {
        System.out.print("координаты X: " + "(" + (coordinate_X-1));
    }

    @Override
    public void moveRight() {
        System.out.println(", "  + (coordinate_X+1) + ")");
    }
}
