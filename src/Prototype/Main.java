
package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CarCache.loadCache();
        
        Car clonedCar1 = CarCache.getCar("1");
        clonedCar1.start();
        
        Car clonedCar2 = CarCache.getCar("2");
        clonedCar2.start();
    }
 
}
