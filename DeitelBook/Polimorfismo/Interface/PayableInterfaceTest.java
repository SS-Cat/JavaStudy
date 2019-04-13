/**
 * PayableInterfaceTest
 */
public class PayableInterfaceTest {

    public static void main(String[] args) {
        
        Payable[] payablesObjects = new Payable[4];
        
        payablesObjects[0] = new Invoice("01234", "seat", 2, 375);
        payablesObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        //payablesObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
    }
}