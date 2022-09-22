/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Human a = new Human("cflin",177.0,48.0);
        Human b = new Human();
        System.out.println("YAYA!!"+a.getName());
        a.setName("Bill");
        System.out.println("YAYA!!"+a.getName());
        a.hello();
        b.hello();
        System.out.printf("%.2f\n",a.calcBMI()); 
         
        System.out.println(a.myHeath());
        a.setHeight(-88);
        System.out.println(a.getHeight());
    }
}