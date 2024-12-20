public class Customer {
    private String name;
    private String id;
    private BankAccount account;
    public Customer(String name, String id, BankAccount account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public BankAccount getAccount() {
        return account;
    }
    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public String toString() {
        return "Customer [name=" + name + ", id=" + id + ", account=" + account + "]";
    }
}
