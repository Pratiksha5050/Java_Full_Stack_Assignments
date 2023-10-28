// Write an application to hold 10 random int values as keys and 10 random double values as 
// values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and 
// values double
import java.util.*;

class IntDoubleHash
{
    public static void main(String args[])
    {

        HashMap<Integer,Double> m=new HashMap<>();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter key and value :");
            Integer k=s.nextInt();
            Double d=s.nextDouble();
            m.put(k,d);
        }

    
        for(Map.Entry<Integer,Double> j:m.entrySet())
        {
            System.out.println("Key : "+j.getKey()+" Value : "+j.getValue());
        }

    }
}