package model;

public class Trainer {

    public String trainername;
    public int numberofpotion;
    public Pokemon[] pokemons;
    public int currentlypokemon;
    public int changepokemon;
    public int possiblerevive;

    public Trainer(String trainername, Pokemon[] pokemons) {
        this.trainername = trainername;
        this.numberofpotion = 3;
        this.pokemons = pokemons;
        this.currentlypokemon = 0;
        this.possiblerevive = 1;
    }

    public void potion() {
        if(pokemons[currentlypokemon].current_health == 100)
            System.out.println(this.trainername + " wanted to use the potion on the current pokemon which is in full health");
        else {
            if(pokemons[currentlypokemon].current_health == 0)
                System.out.println(this.trainername + " wanted to use the potion on the current pokemon which is knocked down");
            else{
                if(this.numberofpotion > 0) {
                    pokemons[currentlypokemon].gain_health();
                    this.numberofpotion -= 1;
                    System.out.println(this.trainername +" used the potion on the current pokemon(" + pokemons[currentlypokemon].name+")");
                }
            }
        }
    }


    public void revive(){

        if(pokemons[currentlypokemon].current_health == 0) {
            if (this.possiblerevive > 0) {
                pokemons[currentlypokemon].current_health = 100;
                this.possiblerevive -= 1;
                System.out.println(this.trainername + " bring " + pokemons[currentlypokemon].name + " to life :");
            } else
                System.out.println(this.trainername + " can't revive any more pokemons");
        }
        else
            System.out.println(this.trainername + "wanted to revive his current pokemon ("+pokemons[currentlypokemon].name+ ") who is still alive !");
    }
    public void changepokemon(int changepokemon){
        this.currentlypokemon = changepokemon;
        System.out.println(this.trainername +" change Pokemon to "+pokemons[currentlypokemon].name);
    }

    public void attack_other_trainer(Trainer other_trainer) {
        Pokemon my_pokemon = this.pokemons[currentlypokemon];
        Pokemon their_pokemon = other_trainer.pokemons[other_trainer.currentlypokemon];
        if(this.pokemons[currentlypokemon].current_health > 0) {
            System.out.println( "          " + this.trainername + " attack:");
            System.out.println( my_pokemon.name +" attack " + their_pokemon.name);
            my_pokemon.attack(their_pokemon);
        }
        else
            System.out.println(this.trainername +" wanted to attack "+ other_trainer.trainername + " but his current pokemon is knocked out");
    }
}
