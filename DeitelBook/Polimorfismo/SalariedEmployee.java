/**
 * SalariedEmployee
 */
public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
            weeklySalary = salary;
    }
    /**
     * @param weeklySalary the weeklySalary to set
     */
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        
            this.weeklySalary = weeklySalary;
    }
    /**
     * @return the weeklySalary
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    @Override 
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), 
        "weekly salary", getWeeklySalary());
    }

    
}