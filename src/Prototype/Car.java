
package Prototype;

import java.util.HashMap;
import java.util.Map;


interface Car extends Cloneable{
    void start();
    Car clone() throws CloneNotSupportedException;
    String getId();
    void setId(String id);
}
