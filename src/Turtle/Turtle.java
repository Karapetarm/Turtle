package Turtle;

public class Turtle {
    private boolean penDown;
    private int roomLength;
    private int roomWidth;
    private boolean [][] array;
    private Direction direction;
    private int turtleX =0;
    private int turtleY =0;

    Turtle(){
        roomLength=20;
        roomWidth=20;
        setDirection(Direction.N);
        createArray(roomWidth,roomLength);
    }

    Turtle(int roomWidth,int roomLength,Direction direction){
        this.roomLength=roomLength;
        this.roomWidth=roomWidth;
        setDirection(direction);
        createArray(roomWidth,roomLength);
    }
    // 1
    public void penUp(){
        penDown=false;
    }
    // 2
    public void penDown(){
        penDown=true;
        array[turtleY][turtleX]=true;
    }
    // 3
    public void turnRight(){
        direction=direction.nextDirection;
    }
    //4
    public void turnLeft(){
        direction=direction.previousDirection;
    }
    //5
    public void move(int steps){
        int i=0;
        while (i++<steps&&oneStep()){
            if(!array[turtleY][turtleX])
                array[turtleY][turtleX]=penDown;
        }
    }

    private boolean oneStep(){
        int newX= turtleX +direction.getX();
        int newY= turtleY +direction.getY();
        if(-1<newX&&newX<roomLength&&-1<newY&&newY<roomWidth){
            turtleX =newX;
            turtleY =newY;
            return true;
        }
        else{
            System.out.println("Impossible Movement");
            return false;
        }

    }
    //6
    public void display(){
        for(int i=19;i>=0;i--){
            for(int j=0;j<20;j++)
                if(array[i][j])
                    System.out.print("*");
                else System.out.print(".");
            System.out.println();}

    }
    //7
    public void erasePath(){
        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++)
                array[i][j]=false;
    }
    //8
    public void goToStartPoint(){
        turtleX=0;
        turtleY=0;
    }

    private void createArray(int roomWidth,int roomLength) {
        array =new boolean[roomWidth][roomLength];
    }

    private void setDirection(Direction direction) {
        if(direction.nextDirection==null||direction.previousDirection==null)
            for(Direction dir:Direction.values())
                dir.setNextAndPreviousDirections();
        this.direction=direction;
    }

    enum Direction {N(0,1),E(1,0),S(0,-1),W(-1,0);
        private int x;
        private int y;
        public Direction nextDirection;
        public Direction previousDirection;

        Direction(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private void setNextAndPreviousDirections() {
            if (x == 0){
                if (y == 1) {
                    nextDirection = E;
                    previousDirection = W;
                } else {
                    nextDirection = W;
                    previousDirection = E;
                }
            }
            else{
                if (x == 1) {
                    nextDirection = S;
                    previousDirection = N;
                }
                else {
                    nextDirection = N;
                    previousDirection = S;
                }
            }
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
