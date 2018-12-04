public class Swimmer {

      //Her laver vi attributterne
	private String firstName;
	private String lastName;
	private int age;
	private boolean active;
	private boolean competitive;
	private int arrears;
   private int ID;
   


      //Her laver vi en en constructor, med klassen som parameter
   public Swimmer(Swimmer swimmer){
      setFirstName(swimmer.getFirstName());
      setLastName(swimmer.getLastName());
      setAge(swimmer.getAge());
      setActive(swimmer.getActive());
      setCompetitive(swimmer.getCompetitive());
      setArrears(swimmer.getArrears());
      setID(swimmer.getID());
   }
   
      //Tom constructor
   public Swimmer(){
   }

      //Her kommer alle Gettere og Settere
	public String getFirstName() {
		return this.firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public boolean getActive() {
		return this.active;
	}

	
	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getCompetitive() {
		return this.competitive;
	}

	
	public void setCompetitive(boolean competitive) {
		this.competitive = competitive;
	}

	public int getArrears() {
		return this.arrears;
	}

	
	public void setArrears(int arrears) {
		this.arrears = arrears;
	}

   public int getID(){
      return this.ID;
   }
   
   public void setID(int ID){
      this.ID = ID;
   }
   
   public void setBreast(boolean i){}
   public void setBreastTime(double i){}
   public void setCrawl(boolean o){}
   public void setCrawlTime(double o){}
   public void setFly(boolean p){}
   public void setFlyTime(double p){}
   
   public boolean getBreast(){
   throw new UnsupportedOperationException();
   } 
    public boolean getCrawl(){
   throw new UnsupportedOperationException();
   } 
    public boolean getFly(){
   throw new UnsupportedOperationException();
   } 
    public double getBreastTime(){
   throw new UnsupportedOperationException();
   } 
    public double getCrawlTime(){
   throw new UnsupportedOperationException();
   } 
    public double getFlyTime(){
   throw new UnsupportedOperationException();
   } 
   
   public void setBreastDate(int i){}
   public void setCrawlDate(int i){}
   public void setFlyDate(int i){}
   
     public int getBreastDate(){
   throw new UnsupportedOperationException();
   }
     public int getCrawlDate(){
   throw new UnsupportedOperationException();
   } 
     public int getFlyDate(){
   throw new UnsupportedOperationException();
   }
}