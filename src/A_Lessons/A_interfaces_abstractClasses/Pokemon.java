package A_Lessons.A_interfaces_abstractClasses;

//Classe geral, todos os pokemonTypes vão herdar disso aqui
public abstract class Pokemon implements Abilities{
    String name;
    int level;
    int friendShip;
    String tier;

    public Pokemon() {
    }

    public Pokemon(int friendShip, int level, String name, String tier) {
        this.friendShip = friendShip;
        this.level = level;
        this.name = name;
        this.tier = tier;
    }

    public void attack(){
        System.out.println("Vai " + name);
    }

    @Override
    public void specialAbility(){
        System.out.println("Essa é minha habilidade");
    }
}
