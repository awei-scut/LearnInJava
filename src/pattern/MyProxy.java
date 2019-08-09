package pattern;


public class MyProxy implements Ibuy {

    private Ibuy ibuy;

    public MyProxy(Ibuy ibuy){
        this.ibuy = ibuy;
    }
    @Override
    public void buy(String name) {
        ibuy.buy(name);
    }
    public static void main(String[] args) {
        Ibuy awei = new Awei();
        Ibuy proxy = new MyProxy(awei);
        proxy.buy("买");
    }
}
