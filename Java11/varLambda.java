// var cannot be used with Lambda Expression

import java.util.*;
interface myInt 
{
	int add(int a, int b);
}
class varLambda
{
	public static void main(String[] args)
	{
	
		// var cannot be used since they
		// require explicit target type
		var obj = (a, b) -> (a + b);

		System.out.println(obj.add(2, 3));
	}
}
// O/P:varLambda.java:17: error: cannot infer type for local variable obj
// var obj = (a, b) -> (a + b);
//     ^
// (lambda expression needs an explicit target-type)
// 1 error