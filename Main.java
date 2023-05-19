//fix translating sentence method
import java.util.Scanner;
class Main {
  public static void main(String[] args) throws InterruptedException{
    Scanner input = new Scanner(System.in);
    System.out.println("Hello. My name is Samuel. How may I be of service to you today?");
    String response="";
    while(!(response.toUpperCase().indexOf("TURN OFF")!=-1)){
    response = input.nextLine(); 
    AI Samuel = new AI(response, "Spanish", 4, "Health");
      //translator
    if(response.toUpperCase().indexOf("TRANSLATE")!=-1){
      System.out.println("What would you like me to translate?");
      response=input.nextLine();
      System.out.println("In what language? I can do Spanish, Italian, and French.");
        String language = input.next();
      String choice="";
      if(Samuel.isSentence(response)==true){
        choice="sentence";
      }
      else{
        choice="word";
      }
      System.out.println(Samuel.translate(language, response, choice));
    }
      //calculator
      //add
      else if(response.toUpperCase().indexOf("MATH")!=-1||response.toUpperCase().indexOf("CALCULATE")!=-1){
        System.out.println("What operation would you like me to perform?");
          response=input.nextLine();
        if(response.toUpperCase().indexOf("ADDITION")!=-1||response.toUpperCase().indexOf("ADD")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      double num = input.nextDouble();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.adding(Samuel.getX(), num);
      }
      else{
        Samuel.adding(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What numbers would you like to add?");
          double num1=input.nextDouble();
          double num2=input.nextDouble();
          Samuel.adding(num1, num2);
        }
        }
          //subtract
        else if(response.toUpperCase().indexOf("SUBTRACTION")!=-1||response.toUpperCase().indexOf("SUBTRACT")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      double num = input.nextDouble();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.subtracting(Samuel.getX(), num);
      }
      else{
        Samuel.subtracting(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What numbers would you like me to subtract?");
         double num1=input.nextDouble();
          double num2=input.nextDouble();
          Samuel.subtracting(num1, num2);
        }
        }
          //multiply
        else if(response.toUpperCase().indexOf("MULTIPLY")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      double num = input.nextDouble();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.multiplication(Samuel.getX(), num);
      }
      else{
        Samuel.multiplication(Samuel.getY(), num);
      }
    }
          else{
        System.out.println("What numbers would you like to multiply?");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        Samuel.multiplication(num1, num2);
      }
        }
          //divide
        else if(response.toUpperCase().indexOf("DIVIDE")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      double num = input.nextDouble();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.divide(Samuel.getX(), num);
      }
      else{
        Samuel.divide(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What numbers would you like to divide?");
          double num1=input.nextDouble();
          double num2 = input.nextDouble();
          Samuel.divide(num1, num2);
        }
        }

        //powers
        else if(response.toUpperCase().indexOf("POWER OF")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      double num = input.nextDouble();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.power(Samuel.getX(), num);
      }
      else{
        Samuel.power(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What is the base?");
          double num1=input.nextDouble();
          System.out.println("What is the exponent?");
          double num2=input.nextDouble();
          Samuel.power(num1, num2);
        }
        }

        //root
        else if(response.toUpperCase().indexOf("ROOT")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      int num = input.nextInt();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.root(Samuel.getX(), num);
      }
      else{
        Samuel.root(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What is the base?");
          double num1=input.nextDouble();
          System.out.println("What is the index?");
          int num2=input.nextInt();
          Samuel.root(num1, num2);
        }
        }

          //modulus
        else if(response.toUpperCase().indexOf("MODULUS")!=-1){
          System.out.println("Would you like to use variable x or y?");
    String answer = input.next();
    if(answer.toUpperCase().equals("YES")){
      System.out.println("What other number would you like to use?");
      int num = input.nextInt();
      System.out.println("Which variable would you like to use?");
      if(answer.toUpperCase().equals("X")){
        Samuel.mod(Samuel.getX(), num);
      }
      else{
        Samuel.mod(Samuel.getY(), num);
      }
      
    }
          else{
          System.out.println("What is the first number?");
          double num1=input.nextDouble();
          System.out.println("What is the second number?");
          int num2 = input.nextInt();
          Samuel.mod(num1, num2);
        }
        }

        //setting variables
        else if(response.toUpperCase().indexOf("SET A VARIABLE")!=-1){
          System.out.println("Would you like to set x or y?");
          String choice = input.next();
            System.out.println("Enter your value here: ");
            double num  = input.nextDouble();
          if(choice.equals("x")){
            Samuel.setX(num);
            System.out.println("Your variable has been set.\nAnything else you want me to do?");
          }
          else{
            Samuel.setY(num);
            System.out.println("Your variable has been set.\nAnything else you want me to do?");
          }
        }

        else if(response.toUpperCase().indexOf("GET A VARIABLE")!=-1){
          System.out.println("Which variable would you like? X or Y?");
          String choice = input.next();
          if(choice.toUpperCase().equals("X")){
            System.out.println(Samuel.getX());
          }
          else{
          System.out.println(Samuel.getY());
          }
        }
      }
        //timer
      else if(response.toUpperCase().indexOf("TIMER")!=-1){
      System.out.println("How long would you like the timer set for?");
      int num = input.nextInt();
        System.out.println("Is that in minutes or hours?");
        String choice = input.next();
        if(choice.equals("minutes")){
          Samuel.Timer(num*60);
        }
        else if(choice.equals("hours")){
          Samuel.Timer(num*3600);
        }
        else{
         Samuel.Timer(num); 
        }
    }
        //getting date/time
      else if(response.toUpperCase().indexOf("TIME")!=-1||response.toUpperCase().indexOf("DATE")!=-1){
        Samuel.Date();
      }
      //background info
      else if(response.toUpperCase().indexOf("YOU DO")!=-1){
        Samuel.background();
      }

      //recommdations
      else if(response.toUpperCase().indexOf("RECOMMEND")!=-1){
        System.out.println(Samuel.recommendations(response));
      }
    }
  }
}