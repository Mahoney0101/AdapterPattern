public class Driver {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Strong");
        Tea tea = new Tea("Lyons");
        TeaAdapter teaAdapter = new TeaAdapter(tea);

        coffee.makeCoffee();
        teaAdapter.makeCoffee();
    }
}
