

import java.util.Scanner;



/**
 * rainfall
 */
public  class Rainfall {
   static String [] month = {"jan","feb","mar","Apr", "may","jun", "jul","Aug","sep","oct","nov","Dec"};
   static int [] rainfall = new int[12];
   static Scanner myObjScanner = new Scanner(System.in);

   public static void enterData(){

     
     
    for (int i = 0; i < 12; i ++){

    System.out.println("Enter the amount of rainfall for " + month[i]);
     rainfall[i] = myObjScanner.nextInt();

    }


   }
   //entering data for given 12 months
 public static void showData() {
     System.out.println("Data for this year in mm");
     
     System.out.println("--------------------------------------------------------");
      for(int i = 0; i < 12; i ++ ){
      System.out.println(month[i] +"                                               " + rainfall[i] +"mm");
      
      } 
 } 
 //finding maximum rainfall
 public static void getmax(){
   int maxValue = rainfall[0];
  
 for (int i = 0; i < month.length; i++){
  
      if (rainfall[i] > maxValue){
        maxValue = rainfall[i];
      }
 }
 System.out.println("max value is "+ maxValue +"mm");
 }
 

 //finding minimum rainfall
public static void getMin(){
  int minValue =  rainfall.length;
  for (int i = 0; i < month.length; i++){
  
    if (rainfall[i] < minValue){
      minValue = rainfall[i];
    }
}
System.out.println("min value is "+ minValue + "mm");
}

//total and average amount of rainfall
public static void getAvg(){
  int sum = 0;
  float Avg = 0;
for(int i = 0; i< rainfall.length;i++){
  sum += rainfall[i];
}

Avg = sum / rainfall.length;


System.out.println("Total sum is " + sum + "mm "+" Average is  " + Avg + "mm");

}




    public static void main(final String[] args ) {
        System.out.println("----------------------------------");
        System.out.println("Rainfall data for a given weather station".toUpperCase());
     
        System.out.println("--------------------------------------------------");
          

  
        enterData();

        System.out.println("***************************************************");

        showData();
        System.out.println("***************************************************");
        getmax();
        getMin();
        getAvg();
        System.out.println("***************************************************");
    }

    
}



