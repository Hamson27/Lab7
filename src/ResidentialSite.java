public class ResidentialSite extends Site{
    private int _units;
    private double _rate;

    public ResidentialSite(){
        super();
        _units = 10;
        _rate = 1.5;
    }


    public double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    public double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }

    public static void main(String[] args) {
        ResidentialSite rs = new ResidentialSite();
        System.out.println(rs.getBillableAmount());
    }
}
