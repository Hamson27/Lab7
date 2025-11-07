public class LifelineSite extends Site{
    private static final int _units = 10;
    private static final double _rate = 2.5;

    public LifelineSite(){
        super();
    }

    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    public double getBaseAmount() {
        return _units * _rate * 0.5;
    }

    public static void main(String[] args) {
        LifelineSite ls = new LifelineSite();
        System.out.println(ls.getBillableAmount());
    }
}
