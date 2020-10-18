public class Coffee implements CoffeMachine{
    String coffeeMake = "Costa";

    public Coffee(String coffeeMake){
        this.coffeeMake  = coffeeMake;
    }


    public void makeCoffee(){
        System.out.println("Making "+ coffeeMake+ " coffee... Enjoy");
    }
}
