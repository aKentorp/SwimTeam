import java.util.*;
import java.io.*;
public class MemberFunctions{

   Utilities util = new Utilities();

   public void createSwimmer()throws Exception{
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Will you be a Competitive Swimmer: Y / N??");
      String input;
   
      input = scan.next();
      do{
         if(input.equalsIgnoreCase("y")){
            createCompMember();
         }else if(input.equalsIgnoreCase("n")){
            createMember();
         }else{System.out.println("Enter Y / N:...");
            input = scan.next();
         } 
      }while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));
   }


      //Her laver vi en metode der opretter et nyt medlem.
   public void createMember()throws Exception{
   
      //Her laver vi en nyt objekt af klassen Swimmer
      Swimmer swimmer = new Swimmer();
      //Objekt af klassen Utilities
      Utilities util = new Utilities();
      //Opretter en scanner
      Scanner input = new Scanner(System.in);
      //Her laver vi en attribut af typen String
      String comp = null;
      swimmer.setID(util.highestID()+1);
      ArrayList<String> memberList = util.swimmersList();   //Her laver vi en ArrayList der bruger metoden swimmerslist
      PrintStream output = new PrintStream(new File("Members.txt")); //Her laver vi en printstream der skriver til "Members.txt"
   
      //Her sætter vi at når der laves et nyt medlem.
      //Så er de automatisk et aktivt medlem, og de skylder ikke nogle penge
      swimmer.setActive(true);
      swimmer.setArrears(0); 
   
      //Her bruger vi en Setter til at give det nye medlem et ID nr.
      //ID laves ved hjælp af metoden highestID(), som er lavet defineret i klassen Utilities
    
   
      //Her bruger vi en Setter vi det der bliver skrevet i Scanneren.
      System.out.println("Type in the first Name: ");
      swimmer.setFirstName(input.next());
   
      System.out.println("Type in the last Name: ");
      swimmer.setLastName(input.next());
   
      System.out.println("Type in Age: ");
      swimmer.setAge(input.nextInt());
   
   
     /* System.out.println("Will the memeber be competing in competitions: Y/ N");
      //her sætter vi comp = det der bliver skrevet i scanneren
      comp = input.next();
      do{
         if(comp.equalsIgnoreCase("y")){
            swimmer.setCompetitive(true);
         }else if(comp.equalsIgnoreCase("n")){
            swimmer.setCompetitive(false);
         }else{System.out.println("Enter Y or N: ");
            comp = input.next();
         }
      }while(!comp.equalsIgnoreCase("y") && !comp.equalsIgnoreCase("n"));*/
     
     
    
            //Så lang som members list er kører forloppet
      for(String s : memberList){
            //Her skriver den dem ned 
         output.println(s);
      
      }
            //De ting der blever skrevet i scanneren navn osv. bliver printet ind i dokumentet
      output.print(util.swimmerToString(swimmer));    
     
   
   }



   public void createCompMember() throws Exception{
      
      Swimmer swimmer = new CompSwimmer();
      //Swimmer swimmer = new Swimmer();
      Utilities util = new Utilities();
      Scanner input = new Scanner(System.in);
      String in = "";
      swimmer.setID(util.highestID()+1);
      swimmer.setCompetitive(true);
      swimmer.setActive(true);
      swimmer.setArrears(0);
      swimmer.setBreastTime(0);
      swimmer.setCrawlTime(0);
      swimmer.setFlyTime(0);
      swimmer.setBreastDate(000000);
      swimmer.setCrawlDate(000000);
      swimmer.setFlyDate(000000);
      ArrayList<String> memberList = util.swimmersList();
      ArrayList<String> compMemberList = util.compList();
      PrintStream output = new PrintStream("Members.txt");
      PrintStream output2 = new PrintStream("CompMember.txt");
      
     
      System.out.println("Type in the first Name: ");
      swimmer.setFirstName(input.next());
   
      System.out.println("Type in the last Name: ");
      swimmer.setLastName(input.next());
   
      System.out.println("Type in Age: ");
      swimmer.setAge(input.nextInt());
      
      for(String s : memberList){ 
         output.println(s);
      }
      output.print(util.swimmerToString(swimmer)); 
      
      
      
      System.out.println("Will your disipline be breast:.. Y/ N?");
      in = input.next();
      do{
         if(in.equalsIgnoreCase("y")){
            swimmer.setBreast(true);
         }else if(in.equalsIgnoreCase("n")){
            swimmer.setBreast(false);
         }else{System.out.println("Enter Y / N");
            in = input.next();
         } 
      }while(!in.equalsIgnoreCase("y") && !in.equalsIgnoreCase("n"));
         
      System.out.println("Will your disipline be crawl:.. Y/ N?");
      in = input.next();
      do{
         if(in.equalsIgnoreCase("y")){
            swimmer.setCrawl(true);
         }else if(in.equalsIgnoreCase("n")){
            swimmer.setCrawl(false);
         }else{System.out.println("Enter Y / N");
            in = input.next();
         }
      }while(!in.equalsIgnoreCase("y") && !in.equalsIgnoreCase("n"));
      
      System.out.println("Will your disipline be breast:.. Y/ N?");
      in = input.next();
      do{
         if(in.equalsIgnoreCase("y")){
            swimmer.setFly(true);
         }else if(in.equalsIgnoreCase("n")){
            swimmer.setFly(false);
         }else{System.out.println("Enter Y / N");
            in = input.next();
         }
      }while(!in.equalsIgnoreCase("y") && !in.equalsIgnoreCase("n"));
      
        
      String temp = util.compSwimmerToString(swimmer);
      
      
      for(String d : compMemberList){
         output2.println(d);
      }
      
      output2.print(temp);
     
   }




         //Ikke i opgavebeskrivelen - Laves måske
   public void pay()throws Exception{
   
   int memberID = 0;
   int toPay = 0;
   Scanner input = new Scanner(System.in);
   int tempArrears = 0;
   ArrayList<String> swimmerList = util.swimmersList(); 
   int tempID = 0;
   int arrayPosition = 0;
   
   System.out.println("Enter ID:.. ");
   memberID = input.nextInt();
   Swimmer swimmer = new Swimmer(util.swimmerObject(memberID));
   
   System.out.println("You have Arrears of:.. " + swimmer.getArrears());
   
   System.out.println("How much do you want to pay:..");
   toPay = input.nextInt();
   tempArrears = swimmer.getArrears();
   swimmer.setArrears(swimmer.getArrears() - toPay);
   
      if(swimmer.getArrears() < 0){
         System.out.println("You dont have any Arrears of that amound, and can not pay!");
         swimmer.setArrears(tempArrears);
         pay();
   }      
   String swimmerString = util.swimmerToString(swimmer);
   
      for(String e : swimmerList){
      Scanner scan = new Scanner(e);
      tempID = scan.nextInt();
         if(tempID == memberID){
            swimmerList.set(arrayPosition, swimmerString);
            
         }
      arrayPosition++;
      scan.close();
      }
   
      
      
      PrintStream output = new PrintStream(new File("Members.txt"));
      for(String s : swimmerList){
      output.println(s);
      }
      output.close();
      
      System.out.println("You have now Arrears of:.. " + swimmer.getArrears());
      
   }

   public void checkArrears()throws FileNotFoundException{
   
      
      Scanner scan = new Scanner(new File("Members.txt"));
      Utilities util = new Utilities();
      ArrayList<String> swimmersList = util.swimmersList();
      
      for(String s : swimmersList){
      
         Swimmer swimmer = util.swimmerStringToObject(s);
      
         if(swimmer.getArrears() > 0){
            System.out.println("This is the  people that need to pay!\n" + "ID nr: " + swimmer.getID() + " Owes: " + swimmer.getArrears());
         }
      }
      
   
   }
   
}