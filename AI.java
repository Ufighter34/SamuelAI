import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Thread;
public class AI extends calculator{
  private String response;

private String[] functions = new String[]{"Translate from English to other languages", "Do math", "Tell you the current date and time", "Set a timer", "Give recomendations", "Flip a coin", "Roll a dice"};
  public AI(String r, String l, int n, String a){
    super(n, l,a);
    response=r;
  }
  public void Date(){
    java.util.Date todaysDate = new java.util.Date();
    System.out.println(todaysDate);
    System.out.println("Anything else you want me to do?");
  }

  public void Timer(int maxTime) throws InterruptedException{
    System.out.println("Starting timer now.");
    while(maxTime>0){
      maxTime-=0.01;
      Thread.sleep(1000);
      System.out.println(maxTime);
    }
    System.out.println("Your timer is over.");
    System.out.println("Anything else you want me to do?");
  }

  public void background(){
    System.out.print("I am an AI designed for a Computer Science A project. My purpose is to help users with a variety of tasks. As of now, my functions are");
  for(int i=0; i<functions.length; i++){
    System.out.println(functions[i]);
  }
  System.out.println("What would you like me to do?");
  }

  public void flipCoin(){
    int coinFlip = (int)((Math.random()+1.5));
    System.out.print("It landed on ");
    if(coinFlip==1){
      System.out.println("heads");
    }
    else{
    System.out.println("tails");
  }
    System.out.println("Anything else you want me to do?");
  }
  public void diceRoll(){
    int roll = (int)((Math.random()*6+1));
    System.out.println("Your number is "+roll+"\nAnything else you want me to do?");
  }
}