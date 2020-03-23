package model;

public class Trainer {

    public String trainername;
    public int numberofpotion;
    public Pokemon[] pokemons;
    public int currentlypokemon;

    public Trainer(String trainername,Pokemon[] pokemons){
        this.trainername = trainername;
        this.numberofpotion = 3;
        this.pokemons = pokemons;
        this.currentlypokemon = 0;
    }
    public void potion(){
        if(this.numberofpotion > 0){
            pokemons[currentlypokemon].gain_health();
            this.numberofpotion -= 1;
            System.out.println("You use potion on you current Pokemon "+pokemons[currentlypokemon].name);
        }
        else
            System.out.println("You don't have more potion");
    }

    public void attack_other_trainer(Trainer other_trainer) {
        Pokemon my_pokemon = this.pokemons[currentlypokemon];
        Pokemon their_pokemon = other_trainer.pokemons[other_trainer.currentlypokemon];
        System.out.println("You attack " + their_pokemon.name);
        my_pokemon.attack(their_pokemon);
    }
}
