package Turtle;

public class Turtle implements Game {
    private Pen pen;
    private Board board;
    private Direction direction;

    public Turtle(){
      this(20,20,Direction.N);
    }

    public Turtle(int roomWidth,int roomLength,Direction direction){
        board =new Board(roomLength,roomWidth);
        pen= new Pen(false);
        setDirection(direction);
    }
    // 1
    @Override
    public void penUp(){
        pen.setPenDown(false);
    }
    // 2
    @Override
    public void penDown(){
        pen.setPenDown(true);
        board.setPoint(true);
    }
    // 3
    @Override
    public void turnRight(){
        direction=direction.nextDirection;
    }
    //4
    @Override
    public void turnLeft(){
        direction=direction.previousDirection;
    }
    //5
    @Override
    public void move(int steps){
        int i=0;
        while (i++<steps&&oneStep()){
            if(!board.getPoint())
                board.setPoint(pen.isPenDown());
        }
    }

    private boolean oneStep(){
        int newX= board.getBoardX() +direction.getI();
        int newY= board.getBoardY() +direction.getJ();
        if(-1<newX&&newX< board.getBoardLength()&&-1<newY&&newY< board.getBoardWidth()){
            board.setBoardX(newX);
            board.setBoardY(newY);
            return true;
        }
        else{
            System.out.println("Impossible Movement");
            return false;
        }
    }
    //6
    @Override
    public void display(){
        for(int i=19;i>=0;i--){
            for(int j=0;j<20;j++)
                if(board.getBoard()[i][j])
                    System.out.print(" * ");
                else System.out.print(" - ");
            System.out.println();}

    }
    //7
    @Override
    public void erasePath(){
        for(int i=0;i<20;i++)
            for(int j=0;j<20;j++)
                board.getBoard()[i][j]=false;
    }
    //8
    @Override
    public void goToStartPoint(){
        board.setBoardX(0);
        board.setBoardY(0);
    }

    private void setDirection(Direction direction) {
        if(direction.nextDirection==null||direction.previousDirection==null)
            for(Direction dir:Direction.values())
                dir.setNextAndPreviousDirections();
        this.direction=direction;
    }
}
