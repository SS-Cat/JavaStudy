/**
 * CommissionEmployee extends Employee
 */
public class CommissionEmployee extends Employee {

    private double grossSales;
    private double comissionRate;

    public CommissionEmployee(String first, String last, String ssn, 
    double grossSales, double comissionRate) {
        super(first, last, ssn);

        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if(comissionRate <= 0.0 || comissionRate >= 1.0)
           throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

           this.grossSales = grossSales;
           this.comissionRate = comissionRate;
    }

    /**
     * @param comissionRate the comissionRate to set
     */
    public void setComissionRate(double comissionRate){
        if(comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.comissionRate = comissionRate;
    }

    /**
     * @return the comissionRate
     */
    public double getComissionRate() {
        return comissionRate;
    }

    /**
     * @param grossSales the grossSales to set
     */
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException(
           "Gross sales must be >= 0.0");
        
        this.grossSales = grossSales;
    }

    /**
     * @return the grossSales
     */
    public double getGrossSales() {
        return grossSales;
    }

    @Override
    public double earnings(){
        return getComissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s %.2f", 
        "commission employee", super.toString(),
         "gross sales", getGrossSales(),
         "commission rate", getComissionRate() );
    }
}