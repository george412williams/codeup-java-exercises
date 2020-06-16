package abstractLecture.pokemon;

public class Charizard extends Pokemon {

    public Charizard(int hp, String name, String trainer){
        super(hp, name, trainer);
    }


    //@Override
    public void flameWheel(){
        System.out.println("Charizard uses flame wheel!");
    }

    @Override
    public void attack() {
        System.out.println("char attacks...");
    }


}
