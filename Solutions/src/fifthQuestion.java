public class fifthQuestion {
    public static void main(String [] args){
    Circle object1 = new Circle();
    object1.setRadius(5);
    object1.calcRadiusAndField(object1.getRadius());
    }
}
class Circle{
    double radius;
    String color;

    public Circle(){
        this.radius = 1;
        this.color = "Renk henüz girilmedi";
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double x){
        this.radius = x ;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String y){
        this.color = y;
    }
    public void calcRadiusAndField(double yarıcap){
    double PI = 3.14;
    double cevre = 2 * PI * yarıcap;
    double alan = PI * yarıcap * yarıcap;
    System.out.println("Dairenin Yarıçapı: " + yarıcap);
    System.out.println("Dairenin Çevresi : " + cevre);
    System.out.println("Dairenin Alanı: " + alan);
    }
}
