package A_Lessons.A_interfaces_abstractClasses;

public class Main {
    public static void main(String[] args) {
        WaterType gyarados = new WaterType();
        gyarados.name = "Gyarados";
        gyarados.level = 20;
        gyarados.friendShip = 10;
        gyarados.tier = "Gold";
        gyarados.attack();
        gyarados.specialAbility();

    }
}
