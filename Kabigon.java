
public class Kabigon extends Pokemon {
    public Kabigon(String name){
        super(name, 1000);
       
    }
    public void attrack(Pokemon enemy){
        System.out.println("Pokemon " + name + "attrack" + enemy.getName());
        enemy.damage(5);
    }
}