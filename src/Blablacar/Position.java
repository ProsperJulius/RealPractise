package Blablacar;

public class Position {
private int x;
private int y;
private Direction direction;

public Position(Position position){
    this.x=position.getX();
    this.y=position.getY();
    this.direction=position.getDirection();

}
public Position(int x,int y, Direction direction){
    this.x=x;
    this.y=y;
    this.direction=direction;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void changePosition(int x,int y){
       this.x+=x;
       this.y+=y;
    }
    public Position nextPosition() throws MowerException {
    if(this.getDirection()==null)
        throw new MowerException("direction is null");
        //position to validate
        Position newPosition=new Position(this);
        char currentDirection=newPosition.direction.getDirection();
        if (currentDirection=='N'){
            newPosition.changePosition(0,1);

        }else if(currentDirection=='W'){
          newPosition.changePosition(-1,0);
        }else if(currentDirection=='S'){
            newPosition.changePosition(0,-1);
        }else{
            newPosition.changePosition(1,0);
        }
        return newPosition;



    }
}
