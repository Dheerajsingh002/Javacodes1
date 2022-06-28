public class Instance {
    int num1;
    static int num2;
  void display(){
      System.out.println(num1);
      num2=20;
      System.out.println(num2);
  }

}
class main{
    public static void main(String[] args) {
            Instance s=new Instance();
            s.display();
    }
}
