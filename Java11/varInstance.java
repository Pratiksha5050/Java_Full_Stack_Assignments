//var cannot be used to declare instance and global variables

class varInstance {

	// instance variable
	var x = 50;
	public static void main(String[] args)
	{
		System.out.println(x);
	}
}

//  o/p:
//  varInstance.java:8: error: 'var' is not allowed here
// 	var x = 50;
// 	^
// 1 error