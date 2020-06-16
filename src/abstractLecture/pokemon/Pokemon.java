package abstractLecture.pokemon;

abstract class Pokemon {
    int hp;
    String name;
    String trainer;
    //now lets make a specific pokemon

    public Pokemon(){

    }
    public Pokemon(int hp, String name, String trainer){
        this.hp = hp;
        this.name = name;
        this.trainer = name;

    }

    //for all pokemon to implement
    public abstract void attack();
}
