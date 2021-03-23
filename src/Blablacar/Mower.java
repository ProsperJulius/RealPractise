package Blablacar;

public class Mower {

   private Position position;

   public  Mower(){

   }
    public Mower(int x,int y,char d){
        Direction direction=new Direction(d);
        this.position=new Position(x,y,direction);

    }

    public Mower(Position position){

        this.position=position;

    }


    public Position getPosition() {
        return position;
    }

    public boolean setPosition(Position position) {
        if(position==null)return false;
        this.position = position;
        return true;
    }
    public boolean rotateLeft(){
        if(this.position==null)return false;
        this.position.getDirection().changeDirection('L');
        return true;
    }
    public boolean rotateRight(){
        if(this.position==null)return false;
        this.position.getDirection().changeDirection('R');
        return true;
    }
    public boolean move()throws MowerException{
        return move(this.getPosition().nextPosition());
    }
    public boolean move(Position newposition){
        if(position==null)return false;

        this.position=newposition;
        return true;
    }
}
