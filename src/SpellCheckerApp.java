import java.io.IOException;
import java.util.Scanner;

public class SpellCheckerApp {
	
	private static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException
	{
		String userInput;
		String delim =" ";
		String Content="";
		
		while(1>0)
		{
		System.out.println("Please enter a String");
		userInput=sc.nextLine();	
		
		if(userInput.equals("list"))
		{
			for (Integer key : CheckSpell.getMisspelledWords().keySet()) {
				
				Content+=key+" "+CheckSpell.getMisspelledWords().get(key)+"\n";	    
			}
			break;
		}
		
		String[] userParts = userInput.split(delim);
		String[] fileWords = ReadWordFile.Readwordfile();
		
		
		CheckSpell.misspellList(userParts,fileWords);
		
		System.out.println(CheckSpell.getMissMessage());
		CheckSpell.setMissMessage("");
						
		}
		System.out.println(Content);
		
	}

}
