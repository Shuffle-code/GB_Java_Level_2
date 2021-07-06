package gb_java_level_2;

public class Cat implements Movement {


    private boolean skillRun;
    private boolean skillJump;

    public Cat(int maxDist, int maxHeight) {
        this.maxDist = maxDist;
        this.maxHeight = maxHeight;
    }

    private int maxDist;
    private int maxHeight;

    public int getMaxDist() {
        return maxDist;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean isSkillJump() {
        return skillJump;
    }
    public boolean isSkillRun() {
        return skillRun;
    }

    public Cat(boolean skillRun, boolean skillJump) {
        this.skillRun = skillRun;
        this.skillJump = skillJump;
    }

    public boolean run(){
        System.out.println("Cat run");
        return true;
    }

    public boolean jump(){
        System.out.println("Cat jump");
        return  true;
    }
}