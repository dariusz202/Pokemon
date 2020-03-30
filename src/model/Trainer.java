package model;

public class Trainer {

    public String trainername;
    public int numberofpotion;
    public Pokemon[] pokemons;
    public int currentlypokemon;
    public int changepokemon;
    public int possiblerevive;

    public Trainer(String trainername,Pokemon[] pokemons){
        this.trainername = trainername;
        this.numberofpotion = 3;
        this.pokemons = pokemons;
        this.currentlypokemon = 0;
        this.possiblerevive = 1;
    }
    public void potion(){
        if(this.numberofpotion > 0){
            pokemons[currentlypokemon].gain_health();
            this.numberofpotion -= 1;
            System.out.println("You use potion on your current Pokemon "+pokemons[currentlypokemon].name);
        }
        else
            System.out.println("You don't have more potion");
    }
    public void revive(){
        if(this.possiblerevive > 0){
            pokemons[currentlypokemon].revive();
            this.possiblerevive -= 1;
            System.out.println("You bring "+pokemons[currentlypokemon].name +" to life :");
        }
        else
            System.out.println("You don't have more potion");
    }
    public void changepokemon(int changepokemon){
        this.currentlypokemon = changepokemon;
        System.out.println("You change Pokemon to "+pokemons[currentlypokemon].name);
    }

    public void attack_other_trainer(Trainer other_trainer) {
        Pokemon my_pokemon = this.pokemons[currentlypokemon];
        Pokemon their_pokemon = other_trainer.pokemons[other_trainer.currentlypokemon];
        System.out.println("You attack " + their_pokemon.name);
        my_pokemon.attack(their_pokemon);
    }
}
