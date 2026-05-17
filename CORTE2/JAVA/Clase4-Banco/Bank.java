public class Bank
{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank()
  {
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args)
  {
    Bank bankOfGods = new Bank();//crea el objeto
    System.out.println(bankOfGods.accountOne.getBalance());//imprime el balance de la primera cuenta
    bankOfGods.accountOne.setBalance(5000);//cambia el balance de la primera cuenta
    System.out.println(bankOfGods.accountOne.getBalance());//imprime de nuevo el balance de la primera cuenta
  }
}