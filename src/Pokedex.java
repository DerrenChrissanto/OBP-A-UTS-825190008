public class Pokedex extends Pokemon{
    private int dexnum;
    private String PokemonType;
    private String height;
    private String weight;
    private String region;

    public Pokedex(String PokemonName, String PokemonGender, int dexnum, String PokemonType, String height, String weight, String region) {
        super(PokemonName, PokemonGender);
        this.dexnum = dexnum;
        this.PokemonType = PokemonType;
        this.height = height;
        this.weight = weight;
        this.region = region;
    }

    public int getDexnum() {
        return dexnum;
    }

    public void setDexnum(int dexnum) {
        this.dexnum = dexnum;
    }

    public String getPokemonType() {
        return PokemonType;
    }

    public void setPokemonType(String pokemonType) {
        PokemonType = pokemonType;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
