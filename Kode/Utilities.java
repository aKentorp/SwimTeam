import java.util.*;
import java.io.*;
public class Utilities extends FileManager{

      //Her laver vi en metode der laver et objekt om til en string og returnere det
   public String swimmerToString(Swimmer swimmer){
   
            //Her laver vi en String og putter alle getterne ind i den.
            //Så alle variablerne i swimmer, bliver lavet om til en String
      String swimmerString = swimmer.getID() + " "+ 
                             swimmer.getFirstName() + " " + 
                             swimmer.getLastName() + " " +
                             swimmer.getAge() + " " + 
                             swimmer.getActive() + " " +
                             swimmer.getCompetitive() + " " +
                             swimmer.getArrears();
      
      return swimmerString;   
   }

   public String compSwimmerToString(Swimmer swimmer){
   
      int adult = 1;
      if(swimmer.getAge()> 17){
      adult = 2;
      }
      String compSwimmerString = swimmer.getID() + " " +
                                 adult + " " + 
                                 swimmer.getBreast() + " " +
                                 swimmer.getBreastTime() + " " +
                                 swimmer.getCrawl() + " " + 
                                 swimmer.getCrawlTime() + " " + 
                                 swimmer.getFly() + " " + 
                                 swimmer.getFlyTime() + " "+
                                 swimmer.getBreastDate() + " " +
                                 swimmer.getCrawlDate() + " " +
                                 swimmer.getFlyDate(); 
      return compSwimmerString;
   
   }
   

      //Her laver jeg en metoder der returnere det højeste ID nr. 
   public int highestID()throws Exception{
      
            //
      String nextLine = "";
      int highestID = 0;
      int currentID = 0;
            //Vi Scanner fra filen "Members"
      Scanner scan = new Scanner(new File("Members.txt"));
      
            //Loopet kører så længe Scanneren har en ny linje
      while(scan.hasNextLine()){
            //Vi ved at det første i hver linje er ID'nummeret
            //Så vi sætter CurrentID til den næste Int
      currentID = scan.nextInt();
         if(currentID > highestID){
         highestID = currentID;
         
         }
            
         nextLine = scan.nextLine();
      }
      
      return highestID;
   }

      public Swimmer swimmerStringToObject(String swimmerString){
         
         Scanner scan = new Scanner(swimmerString);
         Swimmer swimmer = new Swimmer();
         
            swimmer.setID(scan.nextInt());
            swimmer.setFirstName(scan.next());
            swimmer.setLastName(scan.next());
            swimmer.setAge(scan.nextInt());
            swimmer.setActive(scan.nextBoolean());
            swimmer.setCompetitive(scan.nextBoolean());
            swimmer.setArrears(scan.nextInt());

         return swimmer;
      }

      
}