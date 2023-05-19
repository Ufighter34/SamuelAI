public class calculator extends translator{
private int num1;
  private double variableX;
  private double variableY;
  public calculator(int n, String l, String a){
    super(l,a);
    num1=n;
  }
  public double getX(){
    return variableX;
  }
  public void setX(double x){
    System.out.println(variableX);
    variableX=x;
    System.out.println(variableX);
  }
  public double getY(){
    return variableY;
  }
  public void setY(double y){
    variableY=y;
  }
  public void adding(double num1, double num2){
    System.out.println((num1+num2)+"\nAnything else you want me to do?");
  }

  public void subtracting(double num1, double num2){
    System.out.println((num1-num2)+"\nAnything else you want me to do?");
  }

  public void multiplication(double num1, double num2){
    System.out.println((num1*num2)+"\nAnything else you want me to do?");
  }

  public void divide(double num1, double num2){
    System.out.println((num1/num2)+"\nAnything else you want me to do?");;
  }

  public void power(double num, double ex){
    System.out.println(Math.pow(num, ex)+"\nAnything else you want me to do?");
  }

  public void root(double num, int root){
    System.out.println(Math.pow(num, 1/root)+"\nAnything else you want me to do?");
  }

  public void mod(double num, int module){
    System.out.println(num%module+"\nAnything else you want me to do?");
  }
}