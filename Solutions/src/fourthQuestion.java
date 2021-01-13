public class fourthQuestion {
    public static void minMaxFinder(int arr[]){
     int min = arr[0];
     int max = arr[0];

     for(int i = 0; i<arr.length; i++){
         if(arr[i] > max) max = arr[i];
         if(arr[i] < min) min = arr[i];
     }
     System.out.println("Max element of array is: " + max + " Min element of array is: " + min);

    }
    public static void main(String [] args){
        int [] firstArray = {15,1,24};
        int [] secondtArray = {100,2000,300,22,46,55,1427};
        int [] thirdArray = {155,-1,47 ,74, 86,92};
        int [] fourthArray = {17,24,38,2,4,62};
        minMaxFinder(firstArray);
        minMaxFinder(secondtArray);
        minMaxFinder(thirdArray);
        minMaxFinder(fourthArray);
    }
}
