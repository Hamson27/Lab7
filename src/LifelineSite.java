public class LifelineSite extends Site{
    private int _units;
    private double _rate;

    public LifelineSite(){
        super();
        _units = 10;
        _rate = 2.5;
    }

    public double getBillableAmount(){
        double base = getBaseAmount();
        double rate = base * Site.TAX_RATE * 0.2;
        return base + rate;
    }

    @Override
    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    public static void main(String[] args) {
        LifelineSite ls = new LifelineSite();
        System.out.println(ls.getBillableAmount());
    }
}
