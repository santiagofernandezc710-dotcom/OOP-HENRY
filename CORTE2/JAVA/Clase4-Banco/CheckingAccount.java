public class CheckingAccount 
{
    //Atributos
    private String name;
    private int balance;
    private String id;
    
    //Metodo constructor  
    public CheckingAccount(String inputName,int inputBalance,String inputId)
    {
        //Objetos
        name=inputName;
        balance=inputBalance;
        id=inputId;
    }

    //Getters y Setters
    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int newBalance)
    {
        balance=newBalance;
    }
}
