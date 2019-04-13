/**
 * HourlyEmployee
 */
public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String first, String last, String ssn, double hourlywage, double hoursWorked) {
        super(first, last, ssn);
        
        if(hourlywage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        if((hoursWorked < 0.0) || (hoursWorked > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        wage = hourlywage;
        hours = hoursWorked;
    }
    /**
     * @param wage the wage to set positive value
     */
    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.wage = wage;
    }
    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }
    /**
     * @param hours the hours to set
     */
    public void setHours(double hours) {
        if((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
            
        this.hours = hours;
    }
    /**
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double earnings(){
        if(getHours() <= 40)//sem hora extra
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
        return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f" ,
         super.toString(),
         "hourly wage", getWage(),
         "hours worked", getHours() );
    }
}