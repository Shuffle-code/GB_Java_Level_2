package gb_java_level_2;

public class Human implements Movement {
    private boolean skillRun;
    private boolean skillJump;

    public boolean isSkillRun() {
        return skillRun;
    }

    public boolean isSkillJump() {
        return skillJump;
    }



    public Human(boolean skillRun, boolean skillJump) {
        this.skillRun = skillRun;
        this.skillJump = skillJump;
    }
    @Override
    public boolean run() {
        System.out.println("Human run");
        return true;
    }
    @Override
    public boolean jump() {
        System.out.println("Human jump");
        return true;
    }
}
