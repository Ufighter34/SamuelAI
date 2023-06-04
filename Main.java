import java.util.Scanner;
class Main {
  public static void main(String[] args) throws InterruptedException{
    Scanner input = new Scanner(System.in);
    System.out.println("\u001b[32;1mHello. My name is Samuel. How may I be of service to you today?");
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

      //displaying functions/background
      else if(response.toUpperCase().indexOf("WHAT CAN YOU RECOMMEND")!=-1){
          Samuel.displayRecs();
        }
      else if(response.toUpperCase().indexOf("DISPLAY YOUR OPERATIONS")!=-1||response.toUpperCase().indexOf("WHAT CAN YOU CALCULATE")!=-1){
        Samuel.displayOperations();
      }
      else if(response.toUpperCase().indexOf("YOU DO")!=-1){
        Samuel.background();
      }
      //calculator
      //add
      else if(response.toUpperCase().indexOf("MATH")!=-1||response.toUpperCase().indexOf("CALCULATE")!=-1){
        System.out.println("What operation would you like me to perform?");
          response=input.nextLine();
        if(response.toUpperCase().indexOf("ADDITION")!=-1||response.toUpperCase().indexOf("ADD")!=-1){
          System.out.println("What numbers would you like to add?");
          double num1=input.nextDouble();
          double num2=input.nextDouble();
          Samuel.adding(num1, num2);
        }
          //subtract
        else if(response.toUpperCase().indexOf("SUBTRACTION")!=-1||response.toUpperCase().indexOf("SUBTRACT")!=-1){
          System.out.println("What numbers would you like me to subtract?");
         double num1=input.nextDouble();
          double num2=input.nextDouble();
          Samuel.subtracting(num1, num2);
        }
        
          //multiply
        else if(response.toUpperCase().indexOf("MULTIPLY")!=-1){
        System.out.println("What numbers would you like to multiply?");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        Samuel.multiplication(num1, num2);
        }
          //divide
        else if(response.toUpperCase().indexOf("DIVIDE")!=-1){
          System.out.println("What numbers would you like to divide?");
          double num1=input.nextDouble();
          double num2 = input.nextDouble();
          Samuel.divide(num1, num2);
        
        }

        //powers
        else if(response.toUpperCase().indexOf("POWER OF")!=-1){
          System.out.println("What is the base?");
          double num1=input.nextDouble();
          System.out.println("What is the exponent?");
          double num2=input.nextDouble();
          Samuel.power(num1, num2);
        }

        //root
        else if(response.toUpperCase().indexOf("ROOT")!=-1){
          System.out.println("What is the base?");
          double num1=input.nextDouble();
          System.out.println("What is the index?");
          double num2=input.nextDouble();
          Samuel.root(num1, num2);
        }
        

          //modulus
        else if(response.toUpperCase().indexOf("MODULUS")!=-1){
          System.out.println("What is the first number?");
          double num1=input.nextDouble();
          System.out.println("What is the second number?");
          int num2 = input.nextInt();
          Samuel.mod(num1, num2);
        }
//finding slope
        else if(response.toUpperCase().indexOf("SLOPE")!=-1){
          System.out.println("Input the first y and x values. First y, and then x:");
          double y2 = input.nextDouble();
          double x2 = input.nextDouble();
          System.out.println("Input the second y and x values. Same order as before: ");
          double y1 = input.nextDouble();
          double x1 = input.nextDouble();
           Samuel.slope(y2, x2, y1, x1);
        }

          //getting reciprocal
        else if(response.toUpperCase().indexOf("RECIPROCAL")!=-1){
          System.out.println("What do you want to find the reciprocal of?");
          double num = input.nextDouble();
          System.out.println("The reciprocal of "+num+" is "+Samuel.reciprocal(num)+"\n Anything else you want me to do?");
        }

        //factorial
        else if(response.toUpperCase().indexOf("FACTORIAL")!=-1){
        System.out.println("What would you like the factorial of?");
        double number = input.nextDouble();
        System.out.println("The factorial of "+number+" is "+Samuel.factorial(number));
        }

        //combined gas law
        else if(response.toUpperCase().indexOf("COMBINED GAS LAW")!=-1){
        Samuel.combinedGasLaw();
        }
          //ideal gas law
        else if(response.toUpperCase().indexOf("IDEAL GAS LAW")!=-1){
          Samuel.idealGasLaw();
        }

        //average
        else if(response.toUpperCase().indexOf("AVERAGE")!=-1){
        System.out.println("How many numbers are there?");
        int num = input.nextInt();;
        Samuel.average(num);
        }
      }
        //timer
      else if(response.toUpperCase().indexOf("TIMER")!=-1){
      System.out.println("How long would you like the timer set for?");
      int num = input.nextInt();
        System.out.println("Is that in minutes, seconds, or hours?");
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
      else if(response.toUpperCase().indexOf("DATE")!=-1){
        Samuel.Date();
      }
      //recommendations
        
      else if(response.toUpperCase().indexOf("RECOMMEND")!=-1){
        System.out.println(Samuel.recommendations(response));
      }

        //flipping coin
      else if(response.toUpperCase().indexOf("COIN FLIP")!=-1||response.toUpperCase().indexOf("FLIP A COIN")!=-1){
       Samuel.flipCoin();
      }
      else if(response.toUpperCase().indexOf("DICE ROLL")!=-1){
        Samuel.diceRoll();
      }
    }
    System.out.println("System shutting down...");
  }
}