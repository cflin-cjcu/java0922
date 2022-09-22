public class Human {
    private String n;
    private double h;
    private double w;
    private double bmi;

    public Human(String name, double height, double weight) {
        n = name;
        h = height;
        w = weight;
        bmi = w / ((h/100.0)*(h/100.0));
    }
    public double getHeight() {
        return h;
    }
    public void setHeight(double height) {
        if(height<0){
            System.out.println("請設定大於0的值!!");;
        } else {
             h = height;
        }
    }
    public double getWeight() {
        return w;
    }    
    public void setWeight(double weight) {
        w = weight;
    }    
    public String getName() {
        return n;
    }
    public void setName(String name) {
        n = name;
    }
    public Human() {
        n = "Guest";
        h = 180.0;
        w = 80.0;
        bmi = w / ((h/100.0)*(h/100.0));
    }

    public void hello() {
        System.out.println("hello!!, My name is "+ n);
    }
    public double calcBMI() {
        return bmi;
    }
    public String myHeath() {
        String msg = "";
        if(bmi<24.5) {
            msg = "你太輕了!!多吃一點";
        } else if(bmi>25) {
            msg = "你太重了!!少吃一點多運動";
        } else {
            msg = "很好唷!!請多保持!";
        }
        return msg;
    }



}
