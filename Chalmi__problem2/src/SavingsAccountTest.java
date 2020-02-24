class SavingsAccountTest {
  public static void main(String[] args) {
    SavingsAccount svOne = new SavingsAccount();
    SavingsAccount svTwo = new SavingsAccount();
   
    svOne.modifyInterestRate(0.04f);
    svOne.setSavingBalance(2000);
   
    svTwo.modifyInterestRate(0.04f);
    svTwo.setSavingBalance(3000);
   
    for (int i = 1; i < 13; i++) {
      svOne.calulateMontlyIntrest();
      System.out.print("Savings account one on month " + i + " is " + svOne.getSavingBalance() + " ") ;
     
      svTwo.calulateMontlyIntrest();
      System.out.println("Savings account two on month " + i + " is " + svTwo.getSavingBalance()) ;

    }
   
   
    svOne.modifyInterestRate(0.05f);
    svOne.setSavingBalance(2000);
   
    svTwo.modifyInterestRate(0.05f);
    svTwo.setSavingBalance(3000);
   
      svOne.calulateMontlyIntrest();
      System.out.println("SavingsAccountOne's next month interest is " + svOne.getSavingBalance()) ;
      svTwo.calulateMontlyIntrest();
      System.out.println("SavingsAccountTwo's next month interest is " + svTwo.getSavingBalance()) ;
  }
}