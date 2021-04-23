public class BankAccount {
    String accountHolder;
    public TypeAccount accountType;
    double balance;
    /*public static final String SAVING_RATE = "Rate";
    public static final String TYPE_PAYROLL = "Payroll";*/
    static final double COMMISSION = 1.2;
    // Constructors
    BankAccount(String accountHolder, TypeAccount tipo, double balance){
        this.accountHolder = accountHolder;
        this.accountType = tipo;
        this.balance = balance;
    }

    BankAccount(){
        this("",TypeAccount.RATE,0);
    }

    BankAccount(String accountHolder, double balance){
        this(accountHolder, TypeAccount.RATE, balance);
    }

    // Methods
    void getMoney(double amount){
        if(amount < 0) return;
        double commission = 0.0;
        if(this.accountType.equals(TypeAccount.RATE)) commission = COMMISSION;
        this.balance -= amount;
        this.balance -= commission;
    }

    void setMoney(double amount){
        this.balance += amount;
    }

    void changeTypeAccount(TypeAccount newType){
        this.accountType = newType;
    }

    double balanceAccount(){
        return this.balance;
    }





}
