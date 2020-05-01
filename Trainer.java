import java.util.*;

public class Trainer{
    private ArrayList<Pokemon> bag;
    private Scanner sc;

    public Trainer(){
         bag = new ArrayList<Pokemon>();
         bag.add(new Pikachu("Pikachu of Satochi "));
         sc = new Scanner(System.in);        
    }
    public void play(){
        String cmd = "";
        
        do{
            System.out.print("\n\nEnter cmd: ");
            cmd = sc.nextLine();

            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag:");
                printPokemon(bag);
            }
            else if(cmd.equals("catch")){
                catchPokemon();
            }
        }while(!cmd.equals("quit"));

    }
    public void catchPokemon(){
        System.out.println("Catch pokemons");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemons(5);
        
        System.out.println("\n\nPokemon around you");
        int no = 0;
        printPokemon(pokemons);
       
        System.out.print("\n\nSelect pokemon number or run(-1) : ");
        no = sc.nextInt();
        if(no < 0){
            sc.nextLine();
            return;
        }

        Pokemon wildPokemon = pokemons.get(no);

        System.out.println("\n\nPokemon in bag : ");
        printPokemon(bag);
        System.out.print("Select Pokemon in bag : ");

        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;
        do{
            myPokemon.attrack(wildPokemon);
            if(wildPokemon.getHp() == 0){   
                    isWin = true;
                    break;
        }
           
                wildPokemon.attrack(myPokemon);
                if(myPokemon.getHp() == 0){
                    isWin = false;
                    break;
                
            }

        }while(true);

        if(isWin){
            System.out.println("You catch: ");
            bag.add(wildPokemon);
        }
        else{
            System.out.println(wildPokemon.getName() + " win" );
        }

       
        sc.nextLine();

       
    }
    public void printPokemon(ArrayList<Pokemon> pokemons){
        int number = 0;
        for(Pokemon p: pokemons){
            System.out.println("" + number + " " + p + " HP: " + p.getHp());
            number++;
        }
    }
}

