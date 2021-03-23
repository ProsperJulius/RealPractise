package Blablacar;

public class Direction {
    private char direction;

    public Direction(char direction) {
        this.direction = direction;
    }
    public boolean setDirection(Direction direction){
        if(direction==null)return false;
        this.direction=direction.getDirection();
        return true;

    }

    public boolean changeDirection(char direction) {
        if (direction == 'L') {
            if (getDirection() == 'N') {
                this.direction = 'W';
            } else if (getDirection() == 'S') {
                this.direction = 'E';

            } else if (getDirection() == 'W') {
                this.direction = 'S';

            } else {
                this.direction = 'N';

            }
        }else{
            if(getDirection()=='N'){
                this.direction='E';

            }else if(getDirection()=='S'){
                this.direction='W';

            }else if(getDirection()=='W'){
                this.direction='N';

            }else{
                this.direction='S';
            }
        }
      return true;

    }
    public char getDirection(){
        return direction;
    }
}
