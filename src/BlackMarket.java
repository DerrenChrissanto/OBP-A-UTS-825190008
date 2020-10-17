public class BlackMarket extends Pokemon{
    private double Price;



    public BlackMarket(String PokemonName, String PokemonGender, int Price) {
        super(PokemonName, PokemonGender);
        this.Price = Price;
    }

    public double getPrice() {
        return Price;
    }

    int pikachuM = 250000;
    int pikachuF = 300000;
    int money = 1000000;

    public int change = money - pikachuM;
    public int change1 = money - pikachuF;
    }
