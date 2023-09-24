package HW;



public class Main {
    public static void main(String[] args) {
        Creature[] creaturesList = {
                new Human(42000, 1.5F, "Jane", "Female", "French"),
                new Robot(38000, 2.9F, "Asus", "Chaser"),
                new Cat(27000, 3.9F, "Peter", "Siamese"),
                new Human(26000, 1.2F, "Jose", "Male", "Portuguese"),
                new Robot(36000, 5.0F, "Starlink", "AC-130"),
                new Robot(36000, 1.3F, "General Motors", "GM"),
                new Human(16000, 1.0F, "John", "Male", "Brazilian"),
                new Cat(8000, 1.9F, "Grump", "pallas cat")
        };
        Wall[] wallsList = new Wall[10];
        Distance[] distancesList = new Distance[10];

        for (int i = 0; i < 10; i++) {
            wallsList[i] = new Wall(0.0F + i / 10.0F * 3 + 0.5F);
            distancesList[i] = new Distance(i * 5000 + 1000);
        }

        for (int i = 0; i < 10; i++) {
            for (Creature creature : creaturesList) {
                if (creature.getInList()) {
                    creature.running(distancesList[i].getLength());
                }
                if (creature.getInList()) {
                    creature.jumping(wallsList[i].getHeigth());
                }
            }
        }


    }

}
