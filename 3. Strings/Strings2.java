public class Strings2{

    public static void main(String args[]){
		
		String message = "This is a string message.";
		System.out.println(message);
		
		System.out.println("Total characters : " + message.length());
		System.out.println("4th Character (3rd index) : " + message.charAt(3));
		System.out.println(message.concat(" Yaaay!"));
		System.out.println("----------");

		//Does message starts with ..?
		System.out.println(message.startsWith("a"));
		//Does message ends with ..?
		System.out.println(message.endsWith("."));
		System.out.println("----------");

		//Get characters from the beginning to the 5th character [4th index] (not including 5th)
		char[] chars = new char[4];
		message.getChars(0,4,chars,0);
		System.out.println(chars);
		System.out.println("----------");

		//where a specific character is located at (Xth index or -1 [Not available])
		System.out.println(message.indexOf("a"));
		System.out.println(message.indexOf("av"));
		//it starts searching from the last character;
		//however it gives you an index number from the beginning
		System.out.println(message.lastIndexOf("g"));
		System.out.println("----------");

		//replaces all characters with another one
		String messageURL = message.replace(" ","-");
		System.out.println(messageURL);
		System.out.println("----------");

		//creates a new string slice, but it does NOT change the original
		System.out.println(message.substring(8));
		System.out.println(message.substring(5,10));
		System.out.println("----------");

		//split each word and print/list them with a for loop
		for (String word : message.split(" ")){
			System.out.println(word);
		}
		System.out.println("----------");

		//makes the message uppercase or lowercase
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println("----------");

		//trim function clears the extra spaces from the beginning and end
		String message2 = "      This is a string message.                   ";
		System.out.println(message2);
		System.out.println(message2.trim());
		System.out.println("----------");

        
    }
}



