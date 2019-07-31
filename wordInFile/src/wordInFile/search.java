package wordInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class search {

	public boolean searchInFile(String fileName, String word, boolean checkCase) {
		//List<String> records = new ArrayList<String>();
		String delimiters = "[-\\t,;.?!:@\\[\\](){}_*/[ ]]";
		  try
		  {
		    BufferedReader reader = new BufferedReader(new FileReader(fileName));
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		      
		    	for(String str : line.split(delimiters)){
		    		if (!checkCase) {
		    			str = str.toLowerCase();
		    			word = word.toLowerCase();
		    		}
		    	  if(str.equals(word))
		    		  return true;
		    	}
		      }
		    reader.close(); 
		    }
		    
		    
		  
		  catch (Exception e)
		  {
		    System.err.format("Exception occurred trying to read '%s'.", fileName);
		    e.printStackTrace();
		    return false;
		  }
		
		return false;
	}
}
