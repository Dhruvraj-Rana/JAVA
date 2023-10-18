import java.util.Scanner;
abstract class Sensor{
     String name;
     int range;
     int accuracy;
     abstract void readValue();
     abstract void DisplayValue();
}
class TemperatureSensor extends Sensor{
    int tempval;
    void readValue(){
         System.out.println("--------Temp -------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range(Heighest) for Temp Sensor");
        range=sc.nextInt();
        System.out.println("Enter Accuray(Ony Integer) for Temp Sensor");
        accuracy=sc.nextInt();
         System.out.println("Enter Reading(Celcius) for Temp Sensor");
        tempval=sc.nextInt();
    }
    void DisplayValue(){
        System.out.println("----------------------------------------------TEMP SENSOR-------------------------------------");
        System.out.println("Here is the reading for Temp Sensor:");
        System.out.println("Range:"+"0-"+range+" Cel");
        System.out.println("Accuracy:"+accuracy+"%");
        System.out.println("Temperature reading of vehicle:"+tempval+" Cel");
         System.out.println("Feedback:");
        if(tempval>55){
            System.out.println("Overheat! Please turn off engine");
        }
        else{
             System.out.println("All Good");
        }
    
    }
}
class speedSensor extends Sensor{
    int speed;
     void readValue(){
          System.out.println("------Speed------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range(Heighest) for Speed Sensor");
        range=sc.nextInt();
        System.out.println("Enter Accuray(Ony Integer) for Speed Sensor");
        accuracy=sc.nextInt();
         System.out.println("Enter current speed(Km/hr) for Speed Sensor");
        speed=sc.nextInt();
    }
     void DisplayValue(){
         System.out.println("----------------------------------------------SPEED SENSOR-------------------------------------");
        System.out.println("Here is the reading for Speed Sensor:");
        System.out.println("Range:"+"0-"+range+" Km/hr");
        System.out.println("Accuracy:"+accuracy+"%");
        System.out.println("Speed reading of vehicle:"+speed+" Km/hr");
         System.out.println("Feedback:");
        if(speed>100){
            System.out.println("Overspeed! Please Slow down");
        }
        else{
             System.out.println("All Good");
        }
    }
}
class FuelSensor extends Sensor{
    int fuel;
    void  readValue(){
         System.out.println("------- Fuel Sensor------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range(Heighest) for Fuel Sensor");
        range=sc.nextInt();
        System.out.println("Enter Accuray(Ony Integer) for Fuel Sensor");
        accuracy=sc.nextInt();
        System.out.println("Enter Fuel in vehicle(Lt) for Fuel Sensor");
        fuel=sc.nextInt();
    }
     void DisplayValue(){
         System.out.println("----------------------------------------------FUEL SENSOR-------------------------------------");
        System.out.println("Here is the reading for Fuel Sensor:");
        System.out.println("Range:"+"0-"+range+" Lt");
        System.out.println("Accuracy:"+accuracy+"%");
        System.out.println("Fuel reading of vehicle:"+fuel+" Lt");
         System.out.println("Feedback:");
        if(fuel<5){
            System.out.println("Low Fuel! Please Refuel your vhehicle");
        }
        else{
             System.out.println("All Good");
        }
    }
    
}

public class Car{
    public static void main(String args[]){
        TemperatureSensor t1=new TemperatureSensor();
        t1.readValue();
        speedSensor s1=new speedSensor();
        s1.readValue();
        FuelSensor f1=new FuelSensor();
        f1.readValue();
        t1.DisplayValue();
        s1.DisplayValue();
        f1.DisplayValue();
        
    }
}
