//vii. If a child class fails to provide implementation for all the abstract methods in parent class, the child class should 
//also be made as abstract.

abstract class Bank {
    abstract void printInterestRate();
    abstract void printIFSC();
    abstract void printBranchName();
}

abstract class CanaraBank extends Bank {
    void  printInterestRate() { 
        System.out.println("Canara Interest Rate is 8%"); 
    }
}
class CanaraBank_Surampalem extends CanaraBank {
    void printInterestRate() {
        System.out.println(7.6);
    }
    void printIFSC() {
        System.out.println("CANB8974420");
    }
    void printBranchName() {
        System.out.println("Surampalem");
    }
}
public class O_AbstractionExample2 {
    public static void main(String[] args) {
        Bank b1 = new CanaraBank_Surampalem();
        b1.printInterestRate();
        b1.printIFSC();
        b1.printBranchName();
    }
}
