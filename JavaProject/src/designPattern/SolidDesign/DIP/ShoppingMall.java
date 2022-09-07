package designPattern.SolidDesign.DIP;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
	
//    private DebitCard DebitCard;
//
//    public ShoppingMall(DebitCard DebitCard) {
//        this.DebitCard = DebitCard;
//    }
//
//    public void doPurchaseSomething(long amount){
//    	DebitCard.doTransaction(amount);
//    }

    public static void main(String[] args) {
//        DebitCard debitCard=new DebitCard();
////        CreditCard creditCard=new CreditCard();
//        
//        ShoppingMall shoppingMall=new ShoppingMall(debitCard);
//        shoppingMall.doPurchaseSomething(5000);

//        BankCard bankCard=new debitCard();
//        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
//        shoppingMall.doPurchaseSomething(5000);
    }
}






