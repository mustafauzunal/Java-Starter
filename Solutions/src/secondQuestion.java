import java.util.Scanner;
public class secondQuestion {
    public static void checkWeather(int weather){
        if(weather < 20){
            System.out.println("Weather is cold");
        }else if(weather>=20 && weather<=30){
            System.out.println("Weather is warm");
        }else{
            System.out.println("Weather is hot");
        }
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input air temperature in Celsius:");
        int temperature = in.nextInt();
         checkWeather(temperature);
    }
}
