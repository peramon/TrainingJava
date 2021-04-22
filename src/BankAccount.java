public class BankAccount {
    String accountHolder;
    String accountType;
    double balance;
    public static final String TIPO_AHORRO = "Ahorro";
    public static final String TIPO_NOMINA = "Nómina";
    static final double COMISION = 1.2;

    BankAccount(String t, String tipo, double sal){
        accountHolder = t;
        accountType = tipo;
        balance = sal;
    }

    BankAccount(){
        accountType = TIPO_AHORRO;
    }
    BankAccount(String t, double sal){
        accountHolder = t;
        accountType = TIPO_AHORRO;
        balance = sal;
    }


    void getMoney(double amount){
        if(amount < 0) return;
        balance -= amount;
    }

    void setMoney(double amount){
        balance += amount;
    }

    void changeTypeAccount(String newType){
        accountType = newType;
    }

    double balanceAccount(){
        return balance;
    }





}
