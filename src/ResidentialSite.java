public class ResidentialSite extends Site{
    private static final int _units = 10;
    private static final double _rate = 1.5;

    public ResidentialSite(){
        super();
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
