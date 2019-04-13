/**
 * BasePlusCommmissionEmployee
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, 
    double sales,double rate, double salary) {
        super(first, last, ssn, sales, rate);

        if(salary < 0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        baseSalary = salary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        
        this.baseSalary = baseSalary;
    }

    /**
     * @return the baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings() ;
    }

    @Override
    public String toString(){
        return String.format( "%s %s; %s: $%,.2f",
        "base-salaried", super.toString(),
        "base salary", getBaseSalary() );
    }

}