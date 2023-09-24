package HW;

public class Cat extends Creature {


    private String breed;

    public Cat(int run, float jump, String name, String breed) {
        super(run, jump, name);
        super.isInList = true;
        this.breed = breed;


        if (run > 40000) {
            super.run = 40000;
        }
        if (jump > 2.5F) {
            super.jump = 2.5F;
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
