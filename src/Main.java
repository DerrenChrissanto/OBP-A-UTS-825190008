import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        System.out.println("============================================");
        System.out.println("UTS OBP");
        System.out.println("Nama  : Derren Chrissanto");
        System.out.println("NIM   : 825190008");
        System.out.println("Kelas : A");
        System.out.println("============================================");
        System.out.println();
        System.out.println("PROGRAM POKEMON");
        System.out.println();
        System.out.println("============================================");

        Pokedex a = new Pokedex("Bulbasar", "Male/Female", 001, "Grass & Poison", "0.7 m",
                "6.9 kg", "Kanto");
        Pokedex b = new Pokedex("Charizard", "Male/Female", 006, "Fire & Flying", "1.7 m",
                "90.5 kg", "Kanto");
        Pokedex c = new Pokedex("Pikachu", "Male/Female",025, "Electric","0.4 m",
                "6.0 kg","Kanto");
        Pokedex d = new Pokedex("Slowking", "Male/Female",199, "Water & Physic","2.0 m",
                "79.5 kg","Johto");
        Pokedex e = new Pokedex("Gligar", "Male/Female",207, "Ground & Flying","1.1 m",
                "64.8 kg","Johto");
        Pokedex f = new Pokedex("Celebi", "Genderless",251, "Grass & Physic","0.6 m",
                "5.0 kg","Johto");
        Pokedex g = new Pokedex("Kirlia", "Male/Female",281, "Fairy & Physic","0.8 m",
                "20.2 kg","Hoenn");
        Pokedex h = new Pokedex("Metagross", "Genderless",376   , "Steel & Physic","1.6 m",
                "550.0 kg","Hoenn");
        Pokedex i = new Pokedex("Rayquaza", "Genderless",384   , "Dragon & Flying","7.0 m",
                "206.5 kg","Hoenn");
        Pokedex j = new Pokedex("Luxray", "Male/Female",405   , "Electric","1.4 m",
                "42.0 kg","Sinnoh");
        Pokedex k = new Pokedex("Lucario", "Male/Female",448   , "Steel & Fighting","1.2 m",
                "54.0 kg","Sinnoh");
        Pokedex l = new Pokedex("Giratina", "Genderless",487   , "Ghost & Dragon","4.5 m",
                "750.0 kg","Sinnoh");
        Pokedex m = new Pokedex("Zoroark", "Male/Female",571   , "Dark","1.6 m",
                "81.1 kg","Unova");
        Pokedex n = new Pokedex("Golett", "Genderless",622   , "Ground & Ghost","1.0 m",
                "92.0 kg","Unova");
        Pokedex o = new Pokedex("Meloetta", "Genderless",648   , "Normal & Physic","0.6 m",
                "6.5 kg","Unova");
        Pokedex p = new Pokedex("Flabébé", "Female",669   , "Fairy","0.1 m",
                "0.1 kg","Kalos");
        Pokedex q = new Pokedex("Meowstic", "Male/Female",678   , "Physic","0.6 m",
                "8.5 kg","Kalos");
        Pokedex r = new Pokedex("Diancie", "Genderless",719   , "Rock & Fairy","0.7 m",
                "8.8 kg","Kalos");
        Pokedex s = new Pokedex("Incineroar", "Male/Female",727   , "Fire & Dark","1.8 m",
                "8.3 kg","Alola");
        Pokedex t = new Pokedex("Lurantis", "Male/Female",754   , "Grass","0.9 m",
                "18.5 kg","Alola");
        Pokedex u = new Pokedex("Zeraora", "Genderless",807   , "Electric","1.5 m",
                "44.5 kg","Alola");
        Pokedex v = new Pokedex("Toxel", "Male/Female",848   , "Electric & Poison","0.4 m",
                "11.0 kg","Galar");
        Pokedex w = new Pokedex("Dracozolt", "Genderless",880   , "Electric & Dragon","1.8 m",
                "19.0 kg","Galar");
        Pokedex x = new Pokedex("Zarude", "Genderless",893   , "Dark & Grass","1.8 m",
                "70.0 kg","Galar");

        BlackMarket aa = new BlackMarket("Pikachu","Male", 250000);
        BlackMarket bb = new BlackMarket("Pikachu","Female", 300000);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("1.MiniDex Data Entries");
        System.out.println("2.Pokemon BlackMarket");
        System.out.println("3.Exit");
        System.out.println();
        System.out.print("Choose The Menu That You Want : ");
        int choose = sc.nextInt();


        switch (choose) {
            case 1:
                System.out.println("1. Bulbasaur");
                System.out.println("2. Charizard");
                System.out.println("3. Pikachu");
                System.out.println("4. Slowking");
                System.out.println("5. Gligar");
                System.out.println("6. Celebi");
                System.out.println("7. Kirlia");
                System.out.println("8. Metagross");
                System.out.println("9. Rayquaza");
                System.out.println("10. Luxray");
                System.out.println("11. Lucario");
                System.out.println("12. Giratina");
                System.out.println("13. Zoroark");
                System.out.println("14. Golett");
                System.out.println("15. Meloetta");
                System.out.println("16. Flabébé");
                System.out.println("17. Meowstic");
                System.out.println("18. Diancie");
                System.out.println("19. Incineroar");
                System.out.println("20. Lurantis");
                System.out.println("21. Zeraora");
                System.out.println("22. Toxel");
                System.out.println("23. Dracozolt");
                System.out.println("24. Zarude");
                System.out.println("25. Exit MiniDex");
                System.out.println();
                System.out.print("Input Number That You Want To See : ");
                int pilihan = sc.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Pokedex Numbers : " + a.getDexnum());
                    System.out.println("Pokemon Names   : " + a.getPokemonName());
                    System.out.println("Pokemon Types   : " + a.getPokemonType());
                    System.out.println("Pokemon Gender  : " + a.getPokemonGender());
                    System.out.println("Pokemon Region  : " + a.getRegion());
                    System.out.println("Pokemon Weight  : " + a.getWeight());
                    System.out.println("Pokemon Height  : " + a.getHeight());
                    break;
                case 2:
                    System.out.println("Pokedex Numbers : " + b.getDexnum());
                    System.out.println("Pokemon Names   : " + b.getPokemonName());
                    System.out.println("Pokemon Types   : " + b.getPokemonType());
                    System.out.println("Pokemon Gender  : " + b.getPokemonGender());
                    System.out.println("Pokemon Region  : " + b.getRegion());
                    System.out.println("Pokemon Weight  : " + b.getWeight());
                    System.out.println("Pokemon Height  : " + b.getHeight());
                    break;
                case 3:
                    System.out.println("Pokedex Numbers : " + c.getDexnum());
                    System.out.println("Pokemon Names   : " + c.getPokemonName());
                    System.out.println("Pokemon Types   : " + c.getPokemonType());
                    System.out.println("Pokemon Gender  : " + c.getPokemonGender());
                    System.out.println("Pokemon Region  : " + c.getRegion());
                    System.out.println("Pokemon Weight  : " + c.getWeight());
                    System.out.println("Pokemon Height  : " + c.getHeight());
                    break;
                case 4:
                    System.out.println("Pokedex Numbers : " + d.getDexnum());
                    System.out.println("Pokemon Names   : " + d.getPokemonName());
                    System.out.println("Pokemon Types   : " + d.getPokemonType());
                    System.out.println("Pokemon Gender  : " + d.getPokemonGender());
                    System.out.println("Pokemon Region  : " + d.getRegion());
                    System.out.println("Pokemon Weight  : " + d.getWeight());
                    System.out.println("Pokemon Height  : " + d.getHeight());
                    break;
                case 5:
                    System.out.println("Pokedex Numbers : " + e.getDexnum());
                    System.out.println("Pokemon Names   : " + e.getPokemonName());
                    System.out.println("Pokemon Types   : " + e.getPokemonType());
                    System.out.println("Pokemon Gender  : " + e.getPokemonGender());
                    System.out.println("Pokemon Region  : " + e.getRegion());
                    System.out.println("Pokemon Weight  : " + e.getWeight());
                    System.out.println("Pokemon Height  : " + e.getHeight());
                    break;
                case 6:
                    System.out.println("Pokedex Numbers : " + f.getDexnum());
                    System.out.println("Pokemon Names   : " + f.getPokemonName());
                    System.out.println("Pokemon Types   : " + f.getPokemonType());
                    System.out.println("Pokemon Gender  : " + f.getPokemonGender());
                    System.out.println("Pokemon Region  : " + f.getRegion());
                    System.out.println("Pokemon Weight  : " + f.getWeight());
                    System.out.println("Pokemon Height  : " + f.getHeight());
                    break;
                case 7:
                    System.out.println("Pokedex Numbers : " + g.getDexnum());
                    System.out.println("Pokemon Names   : " + g.getPokemonName());
                    System.out.println("Pokemon Types   : " + g.getPokemonType());
                    System.out.println("Pokemon Gender  : " + g.getPokemonGender());
                    System.out.println("Pokemon Region  : " + g.getRegion());
                    System.out.println("Pokemon Weight  : " + g.getWeight());
                    System.out.println("Pokemon Height  : " + g.getHeight());
                    break;
                case 8:
                    System.out.println("Pokedex Numbers : " + h.getDexnum());
                    System.out.println("Pokemon Names   : " + h.getPokemonName());
                    System.out.println("Pokemon Types   : " + h.getPokemonType());
                    System.out.println("Pokemon Gender  : " + h.getPokemonGender());
                    System.out.println("Pokemon Region  : " + h.getRegion());
                    System.out.println("Pokemon Weight  : " + h.getWeight());
                    System.out.println("Pokemon Height  : " + h.getHeight());
                    break;
                case 9:
                    System.out.println("Pokedex Numbers : " + i.getDexnum());
                    System.out.println("Pokemon Names   : " + i.getPokemonName());
                    System.out.println("Pokemon Types   : " + i.getPokemonType());
                    System.out.println("Pokemon Gender  : " + i.getPokemonGender());
                    System.out.println("Pokemon Region  : " + i.getRegion());
                    System.out.println("Pokemon Weight  : " + i.getWeight());
                    System.out.println("Pokemon Height  : " + i.getHeight());
                    break;
                case 10:
                    System.out.println("Pokedex Numbers : " + j.getDexnum());
                    System.out.println("Pokemon Names   : " + j.getPokemonName());
                    System.out.println("Pokemon Types   : " + j.getPokemonType());
                    System.out.println("Pokemon Gender  : " + j.getPokemonGender());
                    System.out.println("Pokemon Region  : " + j.getRegion());
                    System.out.println("Pokemon Weight  : " + j.getWeight());
                    System.out.println("Pokemon Height  : " + j.getHeight());
                    break;
                case 11:
                    System.out.println("Pokedex Numbers : " + k.getDexnum());
                    System.out.println("Pokemon Names   : " + k.getPokemonName());
                    System.out.println("Pokemon Types   : " + k.getPokemonType());
                    System.out.println("Pokemon Gender  : " + k.getPokemonGender());
                    System.out.println("Pokemon Region  : " + k.getRegion());
                    System.out.println("Pokemon Weight  : " + k.getWeight());
                    System.out.println("Pokemon Height  : " + k.getHeight());
                    break;
                case 12:
                    System.out.println("Pokedex Numbers : " + l.getDexnum());
                    System.out.println("Pokemon Names   : " + l.getPokemonName());
                    System.out.println("Pokemon Types   : " + l.getPokemonType());
                    System.out.println("Pokemon Gender  : " + l.getPokemonGender());
                    System.out.println("Pokemon Region  : " + l.getRegion());
                    System.out.println("Pokemon Weight  : " + l.getWeight());
                    System.out.println("Pokemon Height  : " + l.getHeight());
                    break;
                case 13:
                    System.out.println("Pokedex Numbers : " + m.getDexnum());
                    System.out.println("Pokemon Names   : " + m.getPokemonName());
                    System.out.println("Pokemon Types   : " + m.getPokemonType());
                    System.out.println("Pokemon Gender  : " + m.getPokemonGender());
                    System.out.println("Pokemon Region  : " + m.getRegion());
                    System.out.println("Pokemon Weight  : " + m.getWeight());
                    System.out.println("Pokemon Height  : " + m.getHeight());
                    break;
                case 14:
                    System.out.println("Pokedex Numbers : " + n.getDexnum());
                    System.out.println("Pokemon Names   : " + n.getPokemonName());
                    System.out.println("Pokemon Types   : " + n.getPokemonType());
                    System.out.println("Pokemon Gender  : " + n.getPokemonGender());
                    System.out.println("Pokemon Region  : " + n.getRegion());
                    System.out.println("Pokemon Weight  : " + n.getWeight());
                    System.out.println("Pokemon Height  : " + n.getHeight());
                    break;
                case 15:
                    System.out.println("Pokedex Numbers : " + o.getDexnum());
                    System.out.println("Pokemon Names   : " + o.getPokemonName());
                    System.out.println("Pokemon Types   : " + o.getPokemonType());
                    System.out.println("Pokemon Gender  : " + o.getPokemonGender());
                    System.out.println("Pokemon Region  : " + o.getRegion());
                    System.out.println("Pokemon Weight  : " + o.getWeight());
                    System.out.println("Pokemon Height  : " + o.getHeight());
                    break;
                case 16:
                    System.out.println("Pokedex Numbers : " + p.getDexnum());
                    System.out.println("Pokemon Names   : " + p.getPokemonName());
                    System.out.println("Pokemon Types   : " + p.getPokemonType());
                    System.out.println("Pokemon Gender  : " + p.getPokemonGender());
                    System.out.println("Pokemon Region  : " + p.getRegion());
                    System.out.println("Pokemon Weight  : " + p.getWeight());
                    System.out.println("Pokemon Height  : " + p.getHeight());
                    break;
                case 17:
                    System.out.println("Pokedex Numbers : " + q.getDexnum());
                    System.out.println("Pokemon Names   : " + q.getPokemonName());
                    System.out.println("Pokemon Types   : " + q.getPokemonType());
                    System.out.println("Pokemon Gender  : " + q.getPokemonGender());
                    System.out.println("Pokemon Region  : " + q.getRegion());
                    System.out.println("Pokemon Weight  : " + q.getWeight());
                    System.out.println("Pokemon Height  : " + q.getHeight());
                    break;
                case 18:
                    System.out.println("Pokedex Numbers : " + r.getDexnum());
                    System.out.println("Pokemon Names   : " + r.getPokemonName());
                    System.out.println("Pokemon Types   : " + r.getPokemonType());
                    System.out.println("Pokemon Gender  : " + r.getPokemonGender());
                    System.out.println("Pokemon Region  : " + r.getRegion());
                    System.out.println("Pokemon Weight  : " + r.getWeight());
                    System.out.println("Pokemon Height  : " + r.getHeight());
                    break;
                case 19:
                    System.out.println("Pokedex Numbers : " + s.getDexnum());
                    System.out.println("Pokemon Names   : " + s.getPokemonName());
                    System.out.println("Pokemon Types   : " + s.getPokemonType());
                    System.out.println("Pokemon Gender  : " + s.getPokemonGender());
                    System.out.println("Pokemon Region  : " + s.getRegion());
                    System.out.println("Pokemon Weight  : " + s.getWeight());
                    System.out.println("Pokemon Height  : " + s.getHeight());
                    break;
                case 20:
                    System.out.println("Pokedex Numbers : " + t.getDexnum());
                    System.out.println("Pokemon Names   : " + t.getPokemonName());
                    System.out.println("Pokemon Types   : " + t.getPokemonType());
                    System.out.println("Pokemon Gender  : " + t.getPokemonGender());
                    System.out.println("Pokemon Region  : " + t.getRegion());
                    System.out.println("Pokemon Weight  : " + t.getWeight());
                    System.out.println("Pokemon Height  : " + t.getHeight());
                    break;
                case 21:
                    System.out.println("Pokedex Numbers : " + u.getDexnum());
                    System.out.println("Pokemon Names   : " + u.getPokemonName());
                    System.out.println("Pokemon Types   : " + u.getPokemonType());
                    System.out.println("Pokemon Gender  : " + u.getPokemonGender());
                    System.out.println("Pokemon Region  : " + u.getRegion());
                    System.out.println("Pokemon Weight  : " + u.getWeight());
                    System.out.println("Pokemon Height  : " + u.getHeight());
                    break;
                case 22:
                    System.out.println("Pokedex Numbers : " + v.getDexnum());
                    System.out.println("Pokemon Names   : " + v.getPokemonName());
                    System.out.println("Pokemon Types   : " + v.getPokemonType());
                    System.out.println("Pokemon Gender  : " + v.getPokemonGender());
                    System.out.println("Pokemon Region  : " + v.getRegion());
                    System.out.println("Pokemon Weight  : " + v.getWeight());
                    System.out.println("Pokemon Height  : " + v.getHeight());
                    break;
                case 23:
                    System.out.println("Pokedex Numbers : " + w.getDexnum());
                    System.out.println("Pokemon Names   : " + w.getPokemonName());
                    System.out.println("Pokemon Types   : " + w.getPokemonType());
                    System.out.println("Pokemon Gender  : " + w.getPokemonGender());
                    System.out.println("Pokemon Region  : " + w.getRegion());
                    System.out.println("Pokemon Weight  : " + w.getWeight());
                    System.out.println("Pokemon Height  : " + w.getHeight());
                    break;
                case 24:
                    System.out.println("Pokedex Numbers : " + x.getDexnum());
                    System.out.println("Pokemon Names   : " + x.getPokemonName());
                    System.out.println("Pokemon Types   : " + x.getPokemonType());
                    System.out.println("Pokemon Gender  : " + x.getPokemonGender());
                    System.out.println("Pokemon Region  : " + x.getRegion());
                    System.out.println("Pokemon Weight  : " + x.getWeight());
                    System.out.println("Pokemon Height  : " + x.getHeight());
                    break;

                case 25:
                    System.out.println("Thankyou For Using This Minidex");
                    break;
                default:
                    System.out.println("ERROR ERROR ERROR ERROR ERROR");
                    break;
            }   System.out.println();
                System.out.println("Thankyou For Using This Minidex");
                return;
            case 2:
                System.out.println("Available Now");
                System.out.println("1.Pikachu Male");
                System.out.println("2.Pikachu Female");
                System.out.println("================");
                System.out.println("1 Monster/Customer!");
                System.out.print("Choose : ");
                int Pemilihan = sc.nextInt();

                switch (Pemilihan){
                    case 1:
                        System.out.println("Pokemon Names   : " + aa.getPokemonName());
                        System.out.println("Pokemon Gender  : " + aa.getPokemonGender());
                        System.out.println("Pokemon Price   : " + aa.getPrice());
                        System.out.println("============================");
                        System.out.println("Your Money In This Account " + aa.money);

                        System.out.print("Your Changes : ");
                        System.out.println(aa.change);
                        System.out.println("Thankyou For Buying!");
                        break;
                    case 2:
                        System.out.println("Pokemon Names   : " + bb.getPokemonName());
                        System.out.println("Pokemon Gender  : " + bb.getPokemonGender());
                        System.out.println("Pokemon Price   : " + bb.getPrice());
                        System.out.println("============================");
                        System.out.println("Your Money In This Account " + bb.money);
                        System.out.print("Your Changes : ");
                        System.out.println(bb.change1);
                        System.out.println("Thankyou For Buying!");
                        break;
                }

            case 3:
                System.out.println("Thankyou For Using This Minidex");
                break;
            default:
                System.out.println("ERROR ERROR ERROR ERROR ERROR");
                break;
            }
        }
    }