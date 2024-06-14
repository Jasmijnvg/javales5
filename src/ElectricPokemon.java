import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "electric";
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public List<String> getAttacks() {
        return attacks;
    }

    void thunderPunch(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Thunder Punch on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 55);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }

    void electroBall(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Electro Ball on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 60);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }

    void thunder(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Thunder on " + gymPokemon.getName());
        if (gymPokemon instanceof ElectricPokemon){
            gymPokemon.setHp(gymPokemon.getHp() +50);
        } else {
            gymPokemon.setHp(gymPokemon.getHp() - 100);
            System.out.println(gymPokemon.getName() + " hp: " + gymPokemon.getHp());
        }
    }

    void voltTackle(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Volt Tackle on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 80);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }
}
