package gb_java_level_2;

public class Wall implements Obstacles{
    private int height;
    public Wall(int height) {
        this.height = height;
    }

    public Wall() {
    }

    public void overcome(Movement movement){
        if(movement.jump() == true){
            System.out.println("Jump perfectly ");
        }else System.out.println("Couldn't jump ");
    }


    public int getHeight() {
        return height;
    }

    public void jumpWall(boolean skill){
        if(skill == true){
            System.out.println("Jump perfectly ");
        }else System.out.println("Couldn't jump ");

    }
//    public void runningTrack(boolean skill){
//        if(skill == true){
//            System.out.println("Jump perfectly ");
//        }else System.out.println("Couldn't jump ");
//    };

}
