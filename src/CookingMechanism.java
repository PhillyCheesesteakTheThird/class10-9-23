public class CookingMechanism {
    public String name;
    public double volumeInLiters;

    public CookingMechanism(String name, int volumeInLiters){
        this.name = name;
        this.volumeInLiters = volumeInLiters;
    }

    public CookingMechanism(String name){
        this.name = name;
    }

    public void self() {
        System.out.println("Hello I am awesome and cool. My name is "+ name +". I can hold this many liters of liquid: "+ volumeInLiters);
    }
}
