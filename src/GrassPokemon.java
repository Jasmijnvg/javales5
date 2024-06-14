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
        gymPokemon.setHp(gymPokemon.getHp() - 50);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }

    void solarBeam(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used solar beam on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 80);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }

    void leechSeed(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used leech seed on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 30);
        pokemon.setHp(gymPokemon.getHp() +30);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }

    void leaveBlade(Pokemon gymPokemon, Pokemon pokemon){
        System.out.println(super.getName() + " used leave blade on " + gymPokemon.getName());
        gymPokemon.setHp(gymPokemon.getHp() - 20);
        System.out.println(gymPokemon.getName()+" hp: "+gymPokemon.getHp());
    }
}
