public class Raichu extends Pikachu {
    public Raichu(String name){
        super(name, 500);
        
    }
    public void attrack(Pokemon enemy){
        System.out.println("Pokemon " + name + "attrack" + enemy.getName());
        enemy.damage(100);
    }
}