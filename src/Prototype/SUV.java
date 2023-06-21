
package Prototype;

import java.util.HashMap;
import java.util.Map;

public class SUV implements Car, Cloneable {
    public SUV() {
    }
    private String id;
    
    @Override
    public void start() {
        System.out.println("Encendiendo el SUV");
    }
    
    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
    
    @Override
    public String getId() {
        return id;
    }
    
    @Override
    public void setId(String id) {
        this.id = id;
    }
}
