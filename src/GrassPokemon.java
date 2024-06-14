import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private final String type = "grass";
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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


    void leafStorm(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used leaf storm on " + gymPokemon.getName());
    }
    void solarBeam(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used solar beam on " + gymPokemon.getName());
    }

    void leechSeed(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used leech seed on " + gymPokemon.getName());
    }

    void leaveBlade(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used leave blade on " + gymPokemon.getName());
    }
}
