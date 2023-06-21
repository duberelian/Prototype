
package Prototype;

import java.util.HashMap;
import java.util.Map;

public class CarCache {
    private static Map<String, Car> carCache = new HashMap<>();
    
    public static Car getCar(String carId) throws CloneNotSupportedException {
        Car cachedCar = carCache.get(carId);
        if (cachedCar != null) {
            return cachedCar.clone();
        } else {
            throw new IllegalArgumentException("Car with id " + carId + " does not exist in the cache.");
        }
    }
    
    public static void loadCache() {
        Sedan sedan = new Sedan();
        sedan.setId("1");
        carCache.put(sedan.getId(), sedan);
        
        SUV suv = new SUV();
        suv.setId("2");
        carCache.put(suv.getId(), suv);
    }
}
