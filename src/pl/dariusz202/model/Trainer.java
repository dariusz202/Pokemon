// made by Wąsik Dariusz(github.com/dariusz202)
package pl.dariusz202.model;

public class Trainer {

    public static final int PLAYER_1_INDEX = 0;
    public static final int PLAYER_2_INDEX = 1;

    private int index;
    public String trainername;
    public int numberofpotion;
    public Pokemon[] pokemons;
    public int currentlypokemon;
    public int possiblerevive;

    public Trainer(int index, String trainername, Pokemon[] pokemons) {
        this.index = index;
        this.trainername = trainername;
        this.numberofpotion = 3;
        this.pokemons = pokemons;
        this.currentlypokemon = 0;
        this.possiblerevive = 1;
    }

    public void potion() {
        pokemons[currentlypokemon].gain_health();
        this.numberofpotion -= 1;
        System.out.println(this.trainername +" used the potion on the current pokemon(" + pokemons[currentlypokemon].name+")");

    }


    public void revive(){

        pokemons[currentlypokemon].current_health = 100;
        this.possiblerevive -= 1;
        System.out.println(this.trainername + " bring " + pokemons[currentlypokemon].name + " to life :");

    }
    public void changepokemon(int changepokemon){
        this.currentlypokemon = changepokemon;
        System.out.println(this.trainername +" change Pokemon to "+pokemons[currentlypokemon].name);
    }

    public void attackOtherTrainer(Trainer otherTrainer) {
        Pokemon my_pokemon = this.pokemons[currentlypokemon];
        Pokemon their_pokemon = otherTrainer.pokemons[otherTrainer.currentlypokemon];
        if(this.pokemons[currentlypokemon].current_health > 0) {
            System.out.println( "          " + this.trainername + " attack:");
            System.out.println( my_pokemon.name +" attack " + their_pokemon.name);
            my_pokemon.attack(their_pokemon);
        }
        else
            System.out.println(this.trainername +" wanted to attack "+ otherTrainer.trainername + " but his current pokemon is knocked out");
    }

    public int getIndex() {
        return index;
    }
}
