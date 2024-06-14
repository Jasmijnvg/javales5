import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "water";
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
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

    void surf(Pokemon gymPokemon, Pokemon pokemon) {
        System.out.println(super.getName() + " used surf on " + gymPokemon.getName());
    }
    void hydroPump(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used hydro pump on " + gymPokemon.getName());
    }

    void hydroCanon(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used hydro canon on " + gymPokemon.getName());
    }

    void rainDance(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used rain dance on " + gymPokemon.getName());
    }
}
