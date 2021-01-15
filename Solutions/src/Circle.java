public class Circle {double radius;
    String color;

    public Circle(){
        this.radius = 1;
        this.color = "Renk henüz girilmedi";
    }
    public double getRadius(){

        return this.radius;
    }
    public void setRadius(double x)
    {

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
        double alan = PI * yarıcap * yarıcap;
        double yarıcap2 = Math.sqrt(alan / PI);
        System.out.println("Dairenin Yarıçapı: " + yarıcap2);
        System.out.println("Dairenin Alanı: " + alan);
    }
}
