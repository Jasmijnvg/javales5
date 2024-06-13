import java.util.List;

public class PokemonTrainer extends PokemonGymOwner {
    private String name;
    private String pokemons;

    public PokemonTrainer(String name, String town, List<Pokemon> pokemons, String name1, String pokemons1) {
        super(name, town, pokemons);
        this.name = name1;
        this.pokemons = pokemons1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPokemons() {
        return pokemons;
    }

    public void setPokemons(String pokemons) {
        this.pokemons = pokemons;
    }
}
