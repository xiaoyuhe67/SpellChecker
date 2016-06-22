import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWordFile {
	
	
	public static String[] Readwordfile() throws IOException
	{
		StringBuilder sb=new StringBuilder();
		File file = new File("words");	
		FileReader fr = new FileReader(file);
	    BufferedReader br = new BufferedReader(fr);
	    String line;
	    while ( (line = br.readLine())!= null)     
	    {
	            sb.append(line+"\n");	            
	            
	    }
	    String[] myArray = sb.toString().split("\n");
	    br.close();
	    
	    return myArray;
	}
	
	

}
