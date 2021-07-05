package gb_java_level_2;

public class Robot implements Movement{
    public boolean isSkillRun() {
        return skillRun;
    }

    public boolean isSkillJump() {
        return skillJump;
    }

    private boolean skillRun;
    private boolean skillJump;

    public Robot(boolean skillRun, boolean skillJump) {
        this.skillRun = skillRun;
        this.skillJump = skillJump;
    }
    @Override
    public boolean run() {
        System.out.println("The robot no much run");
        return true;
    }
    @Override
    public boolean jump() {
        System.out.println("The robot can't jump");
        return false;
    }
}
