public class Account {
    private String number;
    private double balance;
    private String cutomerName;
    private String customerEmail;
    private String customerPhone;

    public void depositeFunds(double depositeAmount){
          balance += depositeAmount;
        System.out.println("Deposite of $ " + depositeAmount + "made. new balance is $" + balance);

      }
   public  void withdrawalFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("insuficient Funds only have $" + balance + " in your account");
        } else {
            balance -= withdrawalAmount;
            System.out.println("withdrawal of $" + withdrawalAmount + " processed, Remaining balance = $" + balance );
        }
   }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCutomerName() {
        return cutomerName;
    }

    public void setCutomerName(String cutomerName) {
        this.cutomerName = cutomerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
