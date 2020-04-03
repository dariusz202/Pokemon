// made by Wąsik Dariusz(github.com/dariusz202)
package pl.dariusz202.model;
import java.util.concurrent.ThreadLocalRandom;

public class Pokemon{
    public String name;
    public int level;
    public String type;
    public int max_health;
    public int current_health;
    public int damage;
    public int heal;

    public Pokemon(String name,int level, String type){
        this.name = name;
        this.level = level;
        this.type = type;
        this.max_health = 100;
        this.current_health = 100;

    }

    public void lose_health(int damage){
        this.current_health = current_health - damage;
        if(this.current_health <=0) {
            this.current_health = 0;
            System.out.println("Pokemon "+ this.name +" is knocked out");
        }
        else {
            System.out.println(this.name + " now has " + this.current_health + " health");
        }

    }
    public void gain_health(){
        this.current_health -=  damage;
        heal = ThreadLocalRandom.current().nextInt(5, 11);
        this.current_health += heal;
        if(this.current_health > 100)
            this.current_health = 100;
        System.out.println(this.name + " now has " + this.current_health + " health");
    }

    public void attack(Pokemon other_pokemon){
        if(this.type == other_pokemon.type ) {
            damage = 2 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Fire" && other_pokemon.type == "Grass") {
            damage = 4 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Grass" && other_pokemon.type == "Fire"){
            damage = 1 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Fire" && other_pokemon.type == "Water"){
            damage = 1 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Water" && other_pokemon.type == "Fire"){
            damage = 4 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Water" && other_pokemon.type == "Grass"){
            damage = 1 * this.level;
            other_pokemon.lose_health(damage);
        }
        if(this.type == "Grass" && other_pokemon.type == "Water"){
            damage = 4 * this.level;
            other_pokemon.lose_health(damage);
        }
    }




}













