
public class CompSwimmer extends Swimmer{

   private boolean breast; 
   private boolean crawl;
   private boolean fly;
   
   private double breastTime;
   private double crawlTime;
   private double flyTime;
   
   private int breastDate;
   private int crawlDate;
   private int flyDate;

   public boolean getBreast(){
      return this.breast;
   }
   public void setBreast(boolean breast){
      this.breast = breast;
   }
   public double getBreastTime(){
      return this.breastTime;
   }   
   public void setBreastTime(double breastTime){
      this.breastTime = breastTime;
   }
   
   public boolean getCrawl(){
      return this.crawl;
   }
   public void setCrawl(boolean crawl){
      this.crawl = crawl;
   }
   public double getCrawlTime(){
      return this.crawlTime;
   }
   
   public void setCrawlTime(double crawlTime){
      this.crawlTime = crawlTime;
   }
   
   public boolean getFly(){
      return this.fly;
   }
   public void setFly(boolean fly){
      this.fly = fly;
   }
   public double getFlyTime(){
      return this.flyTime;
   }
   
   public void setFlyTime(double flyTime){
      this.flyTime = flyTime;
   }
   public int getBreastDate(){
      return this.breastDate;
   }
   public void setBreastDate(int breastDate){
      this.breastDate = breastDate;
   }
   public int getCrawlDate(){
      return this.crawlDate;
   }
   public void setCrawlDate(int crawlDate){
      this.crawlDate = crawlDate;
   }
    public int getFlyDate(){
      return this.flyDate;
   }
   public void setFlyDate(int flyDate){
      this.flyDate = flyDate;
   }


}