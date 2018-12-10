import java.util.*;
public class Menu{
   
   MemberFunctions mf = new MemberFunctions();

   public void menuMethod(){
   Scanner scan = new Scanner(System.in);
   int answer = 0;
   
   System.out.println("\t\tMENU\n");
   
   System.out.println("1:.. Create New Member");
   
   System.out.println("2:.. Subscribtion Payment");
   
   System.out.println("3:.. Check Arrears");
   
   System.out.println("4:.. Register Results");
   
   System.out.println("5:.. Results Overview");
   
   System.out.println("9:.. Logout");
   
   System.out.print("Choose an option: \n");
   try {
   answer = scan.nextInt();
   if(answer == 1){
      mf.createSwimmer();
      System.out.println("");
   }
   else if(answer == 2){
      mf.pay();
      System.out.println("");
   }
    else if(answer == 3){
      mf.checkArrears();
      System.out.println("");
   }
    else if(answer == 4 || answer == 5){
    System.out.println("Coming Soon!!\n");
   }
    else if(answer == 9){
    return;
   }
   menuMethod();   
   
   }catch(Exception e){}
   
   
    
   }
}