package OOP_01;

public class C01_OOP_Runner {
    public static void main(String[] args) {
       /*
        Car properties public olunca ozelliklere butun packege erisebilir
        private yapinca sadece Class icindekiler erisebilir
        Bu durum ENCAPSULATION
        Private yapinca class icinde metod olusturarak erisebiliriz
        Car_Properties honda = new Car_Properties();
        honda.brand = "Honda";
        honda.model = "Civic";
        honda.segment = "C";
        honda.color = "Red";
        honda.yearMade = 2005;
        honda.kmLong = 120000;
        honda.engineVersion = "1.6 Vtec";
        honda.wheels = 4;
        */
        Car_Properties honda = new Car_Properties();
        honda.setBrand("Honda");
        System.out.println("The brand of the car is " + honda.getBrand());
        honda.setYearMade(1990);
        honda.setModel("Civic");
        honda.setSegment("C");
        honda.setColor("Red");
        honda.setYearMade(2012);
        honda.setKmLong(199000);
        honda.setEngineVersion("1.6 Vtec");
        honda.setWheels(4);
        System.out.println(honda.getYearMade());

        //Variable 'ford' might not have been initialized
        //Car_Properties ford;
        //ford.setYearMade(1991); Object atamadigimizda referans ile object olusmamis oluyor.







    }
}
