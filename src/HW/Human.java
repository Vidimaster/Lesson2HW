package HW;

public class Human extends Creature{
   private String sex;
    private String nationality;

    public Human(int run, float jump, String name, String sex, String nationality) {
        super(run, jump, name);
        super.isInList = true;
        this.sex = sex;
        this.nationality = nationality;

        if (run > 50000) {
            super.run = 50000;
        }
        if (jump > 2.0F) {
            super.jump = 2.0F;
        }
    }


    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " succeeded at running distance: " + runDistance + " m ");
        }
        else{
            System.out.println(name + " failed to run distance ");
            super.isInList = false;
        }
    }

    @Override
    void jumping(float jumpHeight) {
        if (jumpHeight < jump) {
            System.out.println(name + " succeeded at jumping height: " + jumpHeight + " m ");
        }
        else{
            System.out.println(name + " failed to jump height ");
            super.isInList = false;
        }
    }
}
