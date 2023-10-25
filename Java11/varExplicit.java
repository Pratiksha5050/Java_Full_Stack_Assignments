
// var cannot be used without explicit initialization

import java.io.*;

class varExplicit {
	public static void main(String[] args)
	{

		// declaration without initialization
		var variable;
		
		// This is also not valid
		var variable = null;
	}
}

// o/p:
// varExplicit.java:12: error: cannot infer type for local variable variable
// 		var variable;
// 		    ^
//   (cannot use 'var' on variable without initializer)
// varExplicit.java:15: error: cannot infer type for local variable variable
// 		var variable = null;
// 		    ^
//   (variable initializer is 'null')
// 2 errors