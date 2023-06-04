import java.util.Scanner;
public class calculator extends translator{
private int num1;
  private String[] operations = new String[]{"addition", "subtraction", "division", "multiplication", "calculate powers", "calculate roots of numbers", "modulus", "find slope", "find the reciprocal", "calculate the factorial of a number", "do combined gas law", "do ideal gas law", "calculate averages"};
Scanner input = new Scanner(System.in);
  public calculator(int n, String l, String a){
    super(l,a);
    num1=n;
  }

  public void displayOperations(){
    System.out.println("I can ");
    for(int i=0; i<operations.length; i++){
      System.out.println(operations[i]);
    }
    System.out.println("What would you like me to do?");
  }
  
  public void adding(double num1, double num2){
    System.out.println("Your answer is "+(num1+num2)+"\nAnything else you want me to do?");
  }

  public void subtracting(double num1, double num2){
    System.out.println("Your answer is "+(num1-num2)+"\nAnything else you want me to do?");
  }

  public void multiplication(double num1, double num2){
    System.out.println("Your answer is "+(num1*num2)+"\nAnything else you want me to do?");
  }

  public void divide(double num1, double num2){
    System.out.println("Your answer is "+(num1/num2)+"\nAnything else you want me to do?");;
  }

  public void power(double num, double ex){
    System.out.println("Your answer is "+Math.pow(num, ex)+"\nAnything else you want me to do?");
  }

  public void root(double num, double root){
    System.out.println("Your answer is "+Math.pow(num, 1/root)+"\nAnything else you want me to do?");
  }

  public void mod(double num, int module){
    System.out.println("Your answer is "+num%module+"\nAnything else you want me to do?");
  }

  public void slope(double y2, double x2, double y1, double x1){
    double numerator = y2-y1;
    double denominator = x2-x1;
    System.out.println("The slope of your equation is "+numerator/denominator+"\nAnything else you want me to do?");
  }

  public double reciprocal(double num){
    return -(1/num);
  }

  public double factorial(double num){
    if(num==1){
      return num;
    }
    else{
      return num*factorial(num-1);
    }
  }
public double variableSetter(String word, double variable){
  System.out.println("What is the "+word);
  variable = input.nextDouble();
  return variable;
}
  public void combinedGasLaw(){
    System.out.println("What are you looking for?");
    String response = input.next();
    double p1 = 0;
    double p2 = 0;
    double v1 = 0;
    double v2 = 0;
    double t1 = 0;
    double t2 = 0;
if(response.toUpperCase().equals("V")||response.toUpperCase().equals("VOLUME")){
      p1 = variableSetter("initial pressure", p1);
  p2 = variableSetter("final pressure", p2);
  t1 = variableSetter("initial temperature", t1);
  t2 = variableSetter("final temperature", t2);
  System.out.println("Do we have the initial volume or final volume");
  response = input.next();
  if(response.toUpperCase().equals("FINAL")){
v2 = variableSetter("final volume", v2);
    System.out.println("Your answer is "+(((p2*v2)/t2)*t1)/p1+" liters");
  }
  else{
    v1 = variableSetter("initial volume", v1);
    System.out.println("Your answer is "+(((p1*v1)/t1)*t2)/p2+" liters");
  }
    }
    else if(response.toUpperCase().equals("P")||response.toUpperCase().equals("PRESSURE")){
      v1 = variableSetter("initial volume", v1);
      v2 = variableSetter("final volume", v2);
      t1 = variableSetter("initial temperature", t1);
      t2 = variableSetter("final temperature", t2);
      System.out.println("Do we have the final pressure or the initial?");
      response = input.next();
      if(response.toUpperCase().equals("FINAL")){
        p2 = variableSetter("final pressure", p2);
        System.out.println("Your answer is "+(((p2*v2)/t2)*t1)/v1+" atm");
      }
      else{
        p1 = variableSetter("initial pressure", p1);
        System.out.println("Your answer is "+(((p1*v1)/t1)*t2)/v2);
      }
    }
    else{
      p1 = variableSetter("initial pressure", p1);
      p2 = variableSetter("final pressure", p2);
      v1 = variableSetter("initial volume", v1);
      v2 = variableSetter("final volume", v2);
      System.out.println("Do we have the final temperature or the initial?");
      response = input.next();
      if(response.toUpperCase().equals("FINAL")){
        t2 = variableSetter("final temperature", t2);
        System.out.println("Your answer is "+(p1*v1)/(((p2*v2)/t2))+" kelvin");
      }
      else{
        t1 = variableSetter("initial temperature", t1);
        System.out.println("Your answer is "+(p2*v2)/((p1*v1)/t1)+" kelvin");
      }
    }
    System.out.println("Anything else you want me to do?");
  }

  public void idealGasLaw(){
    double R = 0.08206;
    double t = 0;
    double p = 0;
    double v = 0;
    double n = 0;
    System.out.println("What are we looking for?");
    String response = input.next();
    if(response.toUpperCase().equals("T")||response.toUpperCase().equals("TEMPERATURE")){
      v = variableSetter("temperature", v);
      p = variableSetter("pressure", p);
      n = variableSetter("moles", n);
      System.out.println("Your answer is "+(p*v)/(n*R)+" kelvin");
    }
    else if(response.toUpperCase().equals("V")||response.toUpperCase().equals("VOLUME")){
      p = variableSetter("pressure", p);
      n = variableSetter("moles", n);
      t = variableSetter("temperature", t);
      System.out.println("Your answer is "+((n*R*t)/p)+" liters");
    }
    else if(response.toUpperCase().equals("P")||response.toUpperCase().equals("PRESSURE")){
      v = variableSetter("volume", v);
      n = variableSetter("moles", n);
      t = variableSetter("temperature", t);
      System.out.println("Your answer is "+((n*R*t)/v)+" atm");
    }
    else{
      v = variableSetter("volume", v);
      p = variableSetter("pressure", p);
      t = variableSetter("temperature", t);
      System.out.println("Your answer is "+(p*v)/(R*t)+" moles");
    }
    System.out.println("Anything else you want me to do?");
  }
  public void average(int numOfNums){
    double average = 0;
    System.out.println("Type in the numbers below");
    for(int i=0; i<numOfNums; i++){
      double number = input.nextDouble();
      average+=number;
    }
    System.out.println("Your average is "+ average/numOfNums);
  }
}