
public class MethodTester 
{

	public static void main(String[] args) 
	{
		
		String myString = "Run some methods on this jawn";
		
		//1. write  code which will return the character at index 5 and 
		//  store it in a variable.  display the value of the variable in the console

		char character = myString.charAt(5);
		System.out.println("character: "+character);
		
		//2. write code which will return the length of the string and store it in a 
		//   variable.   Display the content of the variable in the console.

		int length = myString.length();
		System.out.println("length: "+length);
		
		//3. write code which will return the word 'some' and store it in a variable 
		//     you must use a method on myString to generate the word, you may not type 'some'

		String word = myString.substring(4,8);
		System.out.println("word: "+word);

		//4. write code which will display the string in myString with all char 'o' 
		//      replaced with '*'

		System.out.println(myString.replace("o", "*"));
		
		//write a line of code which will return and print the index of the letter m in the 
		//      given string, myString

		System.out.println(myString.indexOf("m"));

	}

}
