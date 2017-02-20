package Turtle;

enum Direction {N(0,1),E(1,0),S(0,-1),W(-1,0);
    private int i;
    private int j;
    public Direction nextDirection;
    public Direction previousDirection;

    Direction(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void setNextAndPreviousDirections() {
        if (i == 0){
            if (j == 1) {
                nextDirection = E;
                previousDirection = W;
            } else {
                nextDirection = W;
                previousDirection = E;
            }
        }
        else{
            if (i == 1) {
                nextDirection = S;
                previousDirection = N;
            }
            else {
                nextDirection = N;
                previousDirection = S;
            }
        }
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
