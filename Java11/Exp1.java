// Write a program to calculate the Simple Interest with minimal code using features of Java 11. 
// Hint: Use the concept of functional interface and Local variable syntax for lambda  parameters.
import java.util.*;

@FunctionalInterface
interface simples
{
    double calculate(float PrincipleAmount,float Time,float Rate);
}

class Exp1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        float PrincipleAmount=s.nextFloat();
        float Time=s.nextFloat();
        float Rate=s.nextFloat();
       

        simples s1=(P,T,R)->(PrincipleAmount*Time*Rate)/100;
        double si=s1.calculate(PrincipleAmount,Time,Rate);
        System.out.println("Simple Interest : "+si);

    }
} 
