import java.util.Scanner;

class Number{
  boolean isActive;
  int value;

  public Number(int value){
    this.isActive = true;
    this.value = value;
  }

  public void setisActive(int i){
    if(i == 1)
      this.isActive = true;
    else
      this.isActive = false;
  }
}

class driver{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    Number num1 = new Number(25);
    while(true){
      colorprint.print(num1);
      int i=sc.nextInt();
      num1.setisActive(i);
      System.out.println("------------------------");
    }

  }
}
