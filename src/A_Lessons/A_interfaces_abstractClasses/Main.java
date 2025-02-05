package A_Lessons.A_interfaces_abstractClasses;

public class Main {
    public static void main(String[] args) {
        WaterType gyarados = new WaterType(12, 20, "Gyarados", "Gold");

        FairyType sylveon = new FairyType();
        sylveon.name = "Sylveon";
        sylveon.attack();
        sylveon.specialAbility();

    }
}
