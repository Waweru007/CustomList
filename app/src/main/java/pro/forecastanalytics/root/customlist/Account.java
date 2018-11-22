package pro.forecastanalytics.root.customlist;

public class Account {
    private String accnumber;
    private String name;
    private double balance;
    private String type;


    public Account(String accnumber, String name, double balance, String type) {
        this.accnumber = accnumber;
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public String getAccnumber() {
        return accnumber;
    }

    public void setAccnumber(String accnumber) {
        this.accnumber = accnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
