import java.util.ArrayList;

/**
 * Bookstore
 */
public class Bookstore {

    public String name;
    public String address;
    public int sqFt;
    public boolean usedBooks;
    public boolean isItOpen;
    public boolean isItOpenWeekends;
    public boolean isItOpenSundays;
    public String dailyOpeningTime;
    public String dailyClosingTime;

    private ArrayList<String> titles;


    public Bookstore(){
        this.name="BookCity";
        this.address = "123 Main st. Charlotte, NC";
        this.sqFt = 5000;
        this.usedBooks = true;
        this.isItOpen = true;
        this.isItOpenWeekends = false;
        this.isItOpenSundays = false;
        this.dailyOpeningTime = "9am";
        this.dailyClosingTime = "5pm";

        
    }
    
    public Bookstore(boolean d, boolean f, boolean g){
        this.name="BookCity";
        this.address = "123 Main st. Charlotte, NC";
        this.sqFt = 5000;
        this.usedBooks = d;
        this.isItOpen = true;
        this.isItOpenWeekends = f;
        this.isItOpenSundays = g;        
        this.dailyOpeningTime = "9am";
        this.dailyClosingTime = "5pm";
    }
    
    public Bookstore(String a, String b, int c, boolean d, boolean e, boolean f, boolean g, String h, String i){
        this.name="BookCity";
        this.address = "123 Main st. Charlotte, NC";
        this.sqFt = 5000;
        this.usedBooks = d;
        this.isItOpen = true;
        this.isItOpenWeekends = f;
        this.isItOpenSundays = g;        
        this.dailyOpeningTime = "9am";
        this.dailyClosingTime = "5pm";        
    }

    public void setName(String name){  
        this.name = name;      
    }
    
    
    public void setAddress(String address){
        this.address = address;        
    }
    
    
    public void setSqFt(int sqFt){
        this.sqFt = sqFt;        
    }
    
    
    public void setUsedBooks(boolean x){  
        this.usedBooks = x;      
    }
    
    
    public void setIsItOpen(boolean x){
        this.isItOpen = x;        
    }
    
    
    public void setIsItOpenWeekends(boolean x){
        this.isItOpenWeekends = x;        
    }
    
    
    public void setIsItOpenSundays(boolean x){
        this.isItOpenSundays = x;        
    }
    
    
    public void setDailyOpeningTime(String x){
        this.dailyOpeningTime = x;        
    }
    
    
    public void setDailyClosingTime(String x){
        this.dailyClosingTime = x;        
    }


    public String getName(){
        return name;    
    }

    
    public String getAddress(){
        return address;
    }

    
    public int getSqFt(){
        return sqFt;
    }

    
    public boolean getUsedBooks(){
        return usedBooks;
    }

    
    public boolean getIsItOpen(){
        return isItOpen;
    }
    
    
    public boolean getIsItOpenWeekends(){
        return isItOpenWeekends;
    }

    
    public boolean getIsItOpenSundays(){
        return isItOpenSundays;
    }

    
    public String getDailyOpenTimes(){
        return dailyOpeningTime;
    }

    
    public String getDailyClosingTimes(){
        return dailyClosingTime;
    }


    public void storeIntro(Bookstore s){
        System.out.println("Welcome to "+ s.getName()+",");
        System.out.println("Located at "+ s.getAddress()+".");
        System.out.println("Our store stretches across "+ s.getSqFt()+" of open sales floor.");
        if (usedBooks){
            System.out.println("We have a wide selection of new and used books!");
        } else System.out.println("We have a wide selection of brand new books!");
        if (isItOpen){
            System.out.println("The store is open now.");
        } else System.out.println("The store is closed at this time.");
        System.out.println("Store working hours are: "+getDailyOpenTimes()+" - "+getDailyClosingTimes()+".");

    }

    
}