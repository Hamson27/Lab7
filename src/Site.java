public abstract class Site {
    protected static final double TAX_RATE = 0.13;

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }
}
