public class TeaAdapter implements CoffeMachine{

    Tea tea;

    public TeaAdapter(Tea tea){
        this.tea = tea;
    }

    @Override
    public void makeCoffee() {
        tea.makeTea();
    }
}
