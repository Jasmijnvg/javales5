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
    }

    void electroBall(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Electro Ball on " + gymPokemon.getName());
    }

    void thunder(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Thunder on " + gymPokemon.getName());
    }

    void voltTackle(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used Volt Tackle on " + gymPokemon.getName());
    }
}
