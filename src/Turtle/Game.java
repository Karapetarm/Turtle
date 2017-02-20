package Turtle;


public interface Game {

    public void penUp();

    public void penDown();

    public void turnRight();

    public void turnLeft();

    public void move(int steps);

    public void display();

    public void erasePath();

    public void goToStartPoint();
}
