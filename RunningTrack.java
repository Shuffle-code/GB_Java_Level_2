package gb_java_level_2;

public class RunningTrack implements Obstacles{
    private int dist;

    public RunningTrack(int dist) {
        this.dist = dist;
    }

    public RunningTrack() {
    }

    @Override
    public void overcome(Movement movement){
        if(movement.run() == true){
            System.out.println("Runs perfectly ");
        }else System.out.println("Couldn't run ");

    }





    public int getDist() {
        return dist;
    }

    public void runningTrack(boolean skill){
        if(skill == true){
            System.out.println("Runs perfectly ");
        }else System.out.println("Couldn't run ");
    }
//    public void jumpWall(boolean skill){
//
//    };
    public void running(int l){
        if (dist <= l ){
            System.out.println("Runs perfectly!" );
        }else System.out.println("Bad, very bad!");

        }


}
