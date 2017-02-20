package Turtle;


public class Pen {
    boolean penDown;
    Pen(boolean penPosition){
        this.penDown =penPosition;
    }

    public boolean isPenDown() {
        return penDown;
    }

    public Pen setPenDown(boolean penDown) {
        this.penDown = penDown;
        return this;
    }
}
