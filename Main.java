package gb_java_level_2;

public class Main {
    public static void main(String[] args){
//        Robot robot = new Robot(true, false);
//        Human human = new Human(false, false);
//        Cat cat = new Cat(true, true);
//        robot.jump();
//        robot.run();
//        cat.jump();
//        cat.run();
//        human.jump();
//        human.run();
//






        Movement[] movements = {
                new Cat(false, false),
                new Human(false, true),
                new Robot(false, false),
                new Cat(false, false)
        };

        Obstacles[] obstacles = {
                new RunningTrack(500),
                new Wall(2)
        };


//        Cat cat1 = new Cat(400, 1);

        go(movements, obstacles);

//        RunningTrack runningTrack = new RunningTrack();
//        Wall wall = new Wall();

//        wall.jumpWall(robot.isSkillJump());
//        wall.jumpWall(human.isSkillJump());
//        wall.jumpWall(cat.isSkillJump());
//
//        runningTrack.runningTrack(robot.isSkillRun());
//        runningTrack.runningTrack(human.isSkillRun());
//        runningTrack.runningTrack(cat.isSkillRun());
//
//        runningTrack.running(cat1.getMaxDist());
    }

    static void go(Movement[] movements, Obstacles[] j){
        for (Obstacles obstacles : j) {
            for (int i = 0; i < movements.length; i++) {
                obstacles.overcome(movements[i]);

//                movement.jump();
//                movement.run();

            }


        }
    }
    }


