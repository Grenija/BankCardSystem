
/**
 * Write a description of class BankCard here.
 *
 * @author (22067586 Grenija Dangol)
 * @version (1.0.0)
 */
public class BankCard
{ 
   //attribute
   private int cardID;
   private String clientName;
   private String issuerBank;
   private String bankAccount;
   public int balanceAmount;
   
   //constructor
   public BankCard(int cardID, String issuerBank, String bankAccount,int balanceAmount  ){
       this.clientName = "";
       this.balanceAmount = balanceAmount;
       this.cardID = cardID;
       this.bankAccount = bankAccount;
       this.issuerBank = issuerBank;
}
           //accessor methods
           public int getcardID(){ return cardID;}
           
           public String getclientName(){return clientName; }
           
           public   String getissuerBank(){return issuerBank ;}
           
           public   String getbankAccount(){return   bankAccount;}
           
           public   int getbalanceAmount(){return balanceAmount  ;}
           
           
           
           //new methods
           public void setclientName(String newclientName){
                  this. clientName = newclientName;
            }
            
             public void setbalanceAmount(int newbalanceAmount){
                  this. balanceAmount = newbalanceAmount;  
                }
           
                
   //displaymethod
   public void display(){
       if (clientName.isEmpty()){
       System.out.println("Client name is not assigned");
    }
    else{
        System.out.println("Card ID:" + cardID);
        System.out.println("Client Name:" + clientName);
        System.out.println("Issuer Bank:" + issuerBank ); 
        System.out.println("Bank Account:" + bankAccount);
        System.out.println("Balance Amount:" + balanceAmount);
        
    }
}
}
