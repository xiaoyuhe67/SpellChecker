import java.util.HashMap;

public class CheckSpell {
	
	private static HashMap<Integer, String> misspelledWords = new HashMap<Integer, String>();
	private static String missMessage="";
	private static int index=0;
		
	public static boolean checkspell(String part, String[] s2)
	{
		boolean check=false;
		for(int i=0; i<s2.length;i++)
		{
			if(part.equals(s2[i]))
			{
				check=true;
			}
		}
		return check;
	}
	
	public static void misspellList(String[] s1, String[] s2)
	{	   
		for(int i=0;i<s1.length;i++)
		{
			if(checkspell(s1[i],s2)==false)
			{
				missMessage=(s1[i]+" is not a word. Please reenter."+"\n");
				misspelledWords.put(index, s1[i]);
				index++;
			}
		}
		
	}

	public static HashMap<Integer, String> getMisspelledWords() {
		return misspelledWords;
	}

	public static void setMisspelledWords(HashMap<Integer, String> misspelledWords) {
		CheckSpell.misspelledWords = misspelledWords;
	}

	public static String getMissMessage() {
		return missMessage;
	}

	public static void setMissMessage(String missMessage) {
		CheckSpell.missMessage = missMessage;
	}

	
}
