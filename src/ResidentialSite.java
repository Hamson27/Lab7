public class ResidentialSite extends Site{
    private int _units;
    private double _rate;

    public ResidentialSite(){
        super();
        _units = 10;
        _rate = 1.5;
    }

    public double getBillableAmount(){
        double base = _units * _rate;
        double rate = base * Site.TAX_RATE;
        return base + rate;
    }

    public static void main(String[] args) {
        ResidentialSite rs = new ResidentialSite();
        System.out.println(rs.getBillableAmount());
    }
}
