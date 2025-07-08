
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067586 Grenija Dangol)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String  ExpirationDate;
    private int GracePeriod;
    private boolean isGranted;
//constructor
public CreditCard(int cardID, String clientName, String issuerBank, String bankAccount, int balanceAmount, int CVCnumber,int InterestRate, String ExpirationDate){
super(cardID, bankAccount, issuerBank, balanceAmount);
setclientName(clientName);
this.CVCnumber = CVCnumber;
this.InterestRate = InterestRate;
this.ExpirationDate = ExpirationDate;
this.isGranted = false;
}

public int getCVCnumber(){return CVCnumber;}

public double getInterestRate(){return InterestRate;}

public String getExpirationDate(){return ExpirationDate;}

public double getCreditLimit(){return CreditLimit;}

public int getGracePeriod(){return GracePeriod;}

public boolean getisGranted(){return isGranted;}


public void setCreditLimit(double newCreditLimit, int newGracePeriod){
    if(newCreditLimit <= 2.5 * super.getbalanceAmount()){
        this.CreditLimit = newCreditLimit;
        this.GracePeriod = newGracePeriod;
        this.isGranted = true;
    }
    else{
        System.out.println("Credit cannot be issued");
    }
}

public void cancelCreditCard(){
    this.CVCnumber = 0;
    this.CreditLimit = 0;
    this.GracePeriod = 0;
    System.out.println("Cancelled");
}

public void display(){
    super.display();
    if(isGranted == true){
        System.out.println("Credit Limit:" +CreditLimit);
        System.out.println("Grace Period:" +GracePeriod);
    }
    else{
        System.out.println("CVC Number" +CVCnumber);
        System.out.println("Interest Rate" +InterestRate);
    }
}
}