package Blablacar;
import java.util.LinkedList;
import java.util.regex.*;

public class Simulator implements Runnable {
    Mower blablaMower;
    Lawn blablaLawn;
    boolean blablaBreak=false;
    LinkedList<String> blablaMowerArguments;
    public Simulator(Lawn blablaLawn, Mower blablaMower,LinkedList<String> blablaArguments){
        this.blablaLawn=blablaLawn;
        this.blablaMower=blablaMower;
        this.blablaMowerArguments=blablaArguments;

    }
    /*
    *
    * the initial position of the mower
    * */

    @Override
    public synchronized void run() {

        for(int i=0;i<blablaMowerArguments.size();i++){
           try{
               System.out.println(Thread.currentThread());
              initialMowerPosition(blablaMowerArguments.pop());
              processCommands(blablaMowerArguments.pop());

              break;

        }catch (MowerException e){
               e.printStackTrace();
           }

        }


    }

    public boolean initialMowerPosition(String initialPositionString)throws MowerException {
        Pattern position_pattern = Pattern.compile("([0-9]\\s)+[N,S,W,E]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = position_pattern.matcher(initialPositionString);
        if (matcher.matches()) {
            int x = Integer.parseInt(String.valueOf(initialPositionString.charAt(0)));
            int y = Integer.parseInt(String.valueOf(initialPositionString.charAt(2)));
            Direction direction = new Direction(initialPositionString.charAt(4));
            Position initialPosition = new Position(x, y, direction);
            if (blablaLawn == null) throw new MowerException("lawn is null");
            if (initialPosition == null) throw new MowerException("position is null");
            if (initialPosition.getDirection() == null) throw new MowerException("Direction is null");
            if (!blablaLawn.isValidPosition(initialPosition) || blablaLawn.occupied(initialPosition)) return false;
            blablaMower.setPosition(initialPosition);
            return true;

        }
     return false;
    }
   public void processCommands(String commandParams) throws MowerException{
        commandParams=commandParams.toUpperCase();
        char []parrams=commandParams.toCharArray();

        Pattern command_pattern=Pattern.compile("[L,F,R]*",Pattern.CASE_INSENSITIVE);

        Matcher matcher_command=command_pattern.matcher(commandParams);



        if (matcher_command.matches()){
            for(Character car : parrams){
               switch (car){
                   case 'F':
                       Position nextPosition=blablaMower.getPosition().nextPosition();
                       Position currentPosition=blablaMower.getPosition();
                       if(blablaLawn.isValidPosition(nextPosition) && !blablaLawn.occupied(nextPosition)){
                       blablaMower.move();

                       blablaLawn.setGrid(nextPosition,true);
                       blablaLawn.setGrid(currentPosition,false);}else{
                           System.out.println("command not valid: the thread is: "+Thread.currentThread()+" positions"+nextPosition.getX()+" "+nextPosition.getY());
                       }
                       break;

                   case  'L':blablaMower.rotateLeft();
                               break;
                   case  'R':blablaMower.rotateRight();
                       break;
                   default:
                       /// default action
                       break;
               }


            }

            System.out.println(blablaMowerArguments);
            printOutput();

        }

   }
   public void printOutput(){
       System.out.println(blablaMower.getPosition().getX()+" "+blablaMower.getPosition().getY()+" " +blablaMower.getPosition().getDirection().getDirection());
   }
}
