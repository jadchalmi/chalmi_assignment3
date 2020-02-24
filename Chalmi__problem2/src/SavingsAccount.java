
class SavingsAccount {
  private static float annualInterestRate;
  private float savingsBalance;
  public static void main(String[] args) {
   
   
  }
  public void modifyInterestRate(float newRate){
    annualInterestRate = newRate;
  }
 
  public float calulateMontlyIntrest()
  {
    float interest = (annualInterestRate * savingsBalance)/12;
    savingsBalance = interest + savingsBalance;
    return interest;
   
  }
 
  public void setSavingBalance(float newSavingsBalance){
    this.savingsBalance = newSavingsBalance;
   
  }
 
  public float getSavingBalance(){
   
    return savingsBalance;
  }
 
 
 
}