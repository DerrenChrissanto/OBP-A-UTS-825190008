public class Pokemon {
    private String PokemonName;
    private String PokemonGender;

    public Pokemon(String PokemonName, String PokemonGender) {
        this.PokemonName = PokemonName;
        this.PokemonGender = PokemonGender;
    }

    public String getPokemonName() {
        return PokemonName;
    }

    public void setPokemonName(String pokemonName) {
        PokemonName = pokemonName;
    }

    public String getPokemonGender() {
        return PokemonGender;
    }

    public void setPokemonGender(String pokemonGender) {
        PokemonGender = pokemonGender;
    }
}
