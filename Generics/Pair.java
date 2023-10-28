import java.util.Date;

public class Pair<K, V> 
{
    private K key;
    private V value;

    public K getKey() 
    {
        return key;
    }

   // instanceof operator is used to check if the key and value are instances of the specified classes (String and Date)
    public void setKey(K key) 
    {
        if (key instanceof String) 
        {
            this.key = key;
        } 
        else 
        {
            throw new IllegalArgumentException("Key must be of type String");
        }
    }

    public V getValue() 
    {
        return value;
    }

    public void setValue(V value) 
    {
        if (value instanceof String || value instanceof Date) 
        {
            this.value = value;
        }
         else 
         {
            throw new IllegalArgumentException("Value must be of type String or Date");
        }
    }

    public static void main(String[] args) {
        // creating an object with String key and value
        Pair<String, String> obj1 = new Pair<>();
        obj1.setKey("1");
        obj1.setValue("Hello");
        System.out.println("Key: " + obj1.getKey() + ", Value: " + obj1.getValue());

        //creating an object with String key and Date value
        Pair<String, Date> obj2 = new Pair<>();
        obj2.setKey("Today is");
        obj2.setValue(new Date());
        System.out.println("Key: " + obj2.getKey() + ", Value: " + obj2.getValue());
    }
}
