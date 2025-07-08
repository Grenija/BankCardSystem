
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067586 Grenija Dangol)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
     private int pinNumber;
     private int  WithdrawalAmount;
     private String dateOfWithdrawal;
     private boolean hasWithdrawn;
     
     public DebitCard(int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber){
     //make a call to the superclass constructure
     //pass in the same order
     //setter methode call
     //set PIN number
     
     super(cardID, bankAccount, issuerBank, balanceAmount);
     setclientName(clientName);
     this. pinNumber = pinNumber;
     this. hasWithdrawn = false;
    }
    
    
    public int getpinNumber(){return pinNumber;}
    
    public int getWithdrawalAmount(){return WithdrawalAmount;}
    
    public String getdateOfWithdrawal(){return dateOfWithdrawal;}
    
    public boolean gethasWithdrawn(){return hasWithdrawn;}
    
    
    public void setWithdrawalAmount(int WithdrawalAmount)
    {
        this.WithdrawalAmount = WithdrawalAmount;
    }
    
    
    public void withdraw( int WithdrawalAmount, String dateOfWithdrawal, int pinNumber){
        //check if the PIN is correct
        if (pinNumber == this.pinNumber && WithdrawalAmount <= this.balanceAmount){
            this.balanceAmount = balanceAmount;
            this.WithdrawalAmount = WithdrawalAmount;
            this.dateOfWithdrawal = dateOfWithdrawal;
            this.hasWithdrawn = true;
        }
        else{
            System.out.println("The transaction cannot be performed.");
        }
        
    } 
    
    //BALANCE IS SUFFICIENT WITHDRAW
    //Set the new balance
    //display()
    public void display(){
        super.display();
         System.out.println("PIN:"+pinNumber);
         if (hasWithdrawn = true){
            System.out.println("Withdrawal Amount:" + WithdrawalAmount);
            System.out.println("Date Of Withdrawal:" + dateOfWithdrawal);
         }
         else{
             System.out.println("Balance Amount:" + balanceAmount);
         }
    }
}
