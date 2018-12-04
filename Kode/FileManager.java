import java.util.*;
import java.io.*;
public class FileManager{

         //Her laver vi en metode af objektet Swimmer, og den har (int ID) som parameter
   public Swimmer swimmerObject(int ID)throws FileNotFoundException{ 
         //Her laver vi en ny "fil" der hedder member og den læser fra filen "Members.txt"
      File members = new File("Members.txt");
         //Her laver vi en skanner der skanner fra members
      Scanner scan = new Scanner(members);
         //Her opretter vi et nyt objekt af Swimmer
      Swimmer swimmer = new Swimmer();
         //Her laver vi en int og giver den værdien 0
      int found = 0; 
      
         //Så længe found ikke har samme værdi som ID
      while(found != ID){
         //Så bliver found sat til næste int
         found = scan.nextInt();
            //Hvis found og ID har samme værdi 
         if (found == ID){
         
               //Her buger vi en setter til at sætte swimmers ID til Parameteret
            swimmer.setID(ID);
               //Her bruger vi en sætter til at det næste der bliver skannet på sat som firstName
            swimmer.setFirstName(scan.next());
            swimmer.setLastName(scan.next());
               //Her sætter vi den næste int til Age
            swimmer.setAge(scan.nextInt());
               //Her sætter vi active til true eller false
            swimmer.setActive(scan.nextBoolean());
               //Her sætter vi competitive til true eller flase
            swimmer.setCompetitive(scan.nextBoolean());
               //her sætter vi Arrears til næste int
            swimmer.setArrears(scan.nextInt());
         
         }  //Hvis found != ID, scan en ny linge
         if(found != ID){
            scan.nextLine();
         }
      }  
         //Her returnere vi alt det i while loopet 
      return swimmer;
   }
   
            //Her laver jeg en metode
      public ArrayList<String> swimmersList()throws FileNotFoundException{
      
         File members = new File("Members.txt");
         Scanner scan = new Scanner(members);
         ArrayList<String> membersArray = new ArrayList<String>();
         
               //loppet kører så længe der er en ny linje i scanneren 
         while(scan.hasNextLine()){
               //Her tilføjer vi den næste linje i scanneren
            membersArray.add(scan.nextLine());
         }
         
         return membersArray;
         
      }
      public ArrayList<String> compList()throws FileNotFoundException{
      
         File compMembers = new File("CompMember.txt");
         Scanner scan = new Scanner(compMembers);
         ArrayList<String> compMembersArray = new ArrayList<String>();
         
               //loppet kører så længe der er en ny linje i scanneren 
         while(scan.hasNextLine()){
               //Her tilføjer vi den næste linje i scanneren
            compMembersArray.add(scan.nextLine());
         }
         
         return compMembersArray;
         
      }


}