package HW;

public class Robot extends Creature{



    private String model;

    public Robot(int run, float jump, String name, String model) {
        super(run, jump, name);
        super.isInList = true;
        this.model = model;

        if (run > 100000) {
            super.run = 100000;
        }
        if (jump > 3.0F) {
            super.jump = 3.0F;
        }
    }
    @Override
    void running(int runDistance) {
        if (runDistance < run) {
            System.out.println(name + " succeeded at running distance: " + runDistance + " m ");
        }
        else{
            super.isInList = false;
            System.out.println(name + " failed to run distance ");
        }
    }

    @Override
    void jumping(float jumpHeight) {
        if (jumpHeight < jump) {
            System.out.println(name + " succeeded at jumping height: " + jumpHeight + " m ");
        }
        else{
            super.isInList = false;
            System.out.println(name + " failed to jump height ");
        }
    }
}
