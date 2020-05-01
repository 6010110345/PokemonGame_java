

public class Pikachu extends Pokemon {
    public Pikachu(String name){
        super(name ,10);
        
    }
    public Pikachu(String name,int maxHp){
        super(name, maxHp);
    }

    public void attrack(Pokemon enemy){
        System.out.println("Pokemon " + name + "attrack" + enemy.getName());
        enemy.damage(10);
    }
}