package model;
import java.util.concurrent.ThreadLocalRandom;

public class Pokemon{
    public String name;
    public int level;
    public String type;
    public int max_health;
    public int current_health;
    public boolean knocked_out;
    public int damage;
    public int heal;

    public Pokemon(String name,int level, String type){
        this.name = name;
        this.level = level;
        this.type = type;
        this.max_health = 100;
        this.current_health = 100;
        this.knocked_out = false;
    }
    public void knock_out(){
        this.knocked_out = true;
    }
    public void revive(){
        this.knocked_out = false;
    }
    public void lose_health(int damage){
        this.current_health = current_health - damage;
        if(this.current_health <=0) {
            this.knock_out();
            System.out.println("Your Pokemon is knocked out");
        }
        else
            System.out.println(this.name+" now has "+this.current_health+" health");

    }
    public void gain_health(){
        this.current_health -=  damage;
        if(this.current_health <=0)
            System.out.println("Your Pokemon is knocked out");
        else {
            heal = ThreadLocalRandom.current().nextInt(5, 16);
            this.current_health += heal;
            if(this.current_health > 100)
                this.current_health = 100;
            System.out.println(this.name + " now has " + this.current_health + " health");
        }

    }





    public void attack(Pokemon pokemon){
        if(this.type == "Fire" && pokemon.type == "Water") {
        }
    }
    public static void main(String[] args)
    {
        Pokemon a = new Pokemon("baybe",3,"Fire");
        a.lose_health(20);
        a.gain_health();

    }




}













