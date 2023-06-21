
package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Sedan implements Car, Cloneable {

    public Sedan() {
    }
    private String id;
    
    @Override
    public void start() {
        System.out.println("Encendiendo el sedan");
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
