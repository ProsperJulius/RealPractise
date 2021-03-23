package Blablacar;

import java.io.PipedOutputStream;

public class Lawn {
    private int columns;
    private int rows;
    public boolean grid[][];
    public Lawn(int rows,int columns){
        this.columns=columns;
        this.rows=rows;
        grid=new boolean[rows][columns];

    }
    public boolean isValidPosition(Position position){

        return !(rows<=position.getX()||position.getX()<0|| columns<=position.getY()|| position.getY()<0);
    }
    public boolean occupied(Position position){
        if (!isValidPosition(position)) return false;
        //System.out.println(position.getX()+"  Occupied "+position.getY());
        return grid[position.getX()][position.getY()];

    }
    public synchronized void setGrid(Position position,boolean value){
     //   System.out.println(position.getX()+" setGrid  "+position.getY());
        this.grid[position.getX()][position.getY()]=value;

    }

}
