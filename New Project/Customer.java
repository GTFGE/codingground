public class Customer
{
    String name;
    double total, newMoney;
    public Customer(String customerName, double amount)
    {
        name = customerName;
        total = amount;
    }
    public String getName()
    {
        return name;
    }   
    public double getAmount()
    {
        return total;
    }
    public void setNewAmount(double newAmount)
    {
        newMoney = newAmount;
        total = total + newMoney;
    }
}
    
        