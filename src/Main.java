public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", 5000.0);
        BankAccount account2 = new BankAccount("987654321", 3000.0);
        Customer customer1 = new Customer("Aldiyar","SE-2425", account1);
        Customer customer2 = new Customer("Ayadil","SE-2425", account2);
        Bank bank = new Bank("Kaspi Bank", "Astana, Kazakhstan");
        System.out.println(bank);
        System.out.println(customer1);
        System.out.println(customer2);
        account1.deposit(1000);
        account2.withdraw(500);
        System.out.println("\nAfter operations");
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println("\ncompare balances:");
        if (account1.getBalance() > account2.getBalance()) {
            System.out.println("Aldiyar's balance is greater");
        }
        else if (account1.getBalance() < account2.getBalance()) {
            System.out.println("Ayadil's balance is greater");
        }
        else {
            System.out.println("Balances are equal");
        }
    }
}
