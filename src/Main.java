public class Main {
    public static void main(String[] args) {
        BankAccount cuentaDeJuan = new BankAccount();

        cuentaDeJuan.accountHolder = "Juan Roman";
        cuentaDeJuan.accountType = "nomina";
        cuentaDeJuan.balance = 2000.56;

        System.out.println("Saldo " + cuentaDeJuan.balance);

        // Step by reference
        int var1 = 23;
        int var2 = var1;

        System.out.println("Var 1 " + var1 + " Var 2 " + var2);

        var2 = 78;

        System.out.println("Var 1 " + var1 + " Var 2 " + var2);

        BankAccount cuentaDeAna = new BankAccount();
        cuentaDeAna.balance = 100.50;

        BankAccount cuentaDeJohn =  cuentaDeAna; // Assignment of reference variables, point to the same object
        cuentaDeJohn.balance = 300.50;

        System.out.println("Saldo Ana " +cuentaDeAna.balance + " Saldo de John " + cuentaDeJohn.balance);

        // Usando métodos de cuenta
        cuentaDeJuan.getMoney(500);
        System.out.println("Ahora tiene " + cuentaDeJuan.balance);

        cuentaDeJuan.setMoney(100);
        System.out.println("Despues tenemos " + cuentaDeJuan.balance);

        cuentaDeJuan.changeTypeAccount("ahorro");
        System.out.println("Tipo de cuenta " + cuentaDeJuan.accountType);

        System.out.println("-------------------------------------------");
        double balanceJuan = cuentaDeJuan.balanceAccount();
        System.out.println("Saldo "+ balanceJuan);
        cuentaDeJuan.getMoney(-500);
        System.out.println("Saldo al ingresar valor negativo " + cuentaDeJuan.balanceAccount());
        Calculator calculator = new Calculator();
        double radio = 4.0;
        double area = calculator.calculateAreaOfCircle(radio);
        System.out.println("Area "+ area);

        System.out.println("El volumen de un prisma 5,4,8 es "+ calculator.calculateRectangularPrismVolume(5,4,8));
        double result = calculator.calculateMean(2.6,2.8,2.9,100);
        System.out.println("Resultado " +result);

        BankAccount cuentaPaul = new BankAccount("Paul Ramon","Ahorro",100000);
        BankAccount cuentaJulio = new BankAccount("Julio Ramon", BankAccount.TIPO_AHORRO,100000);

        System.out.println(" Saldo " + cuentaPaul.balance);
        System.out.println(" Saldo " + cuentaJulio.balance);

    }}
