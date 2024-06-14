import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "fire";
    List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
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

    void fireLash(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used fire Lash on " + gymPokemon.getName());
    }

    void flameThrower(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used flame thrower on " + gymPokemon.getName());
    }

    void pyroBall(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used pyro ball on " + gymPokemon.getName());
    }

    void inferno(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used inferno on " + gymPokemon.getName());
    }
}
