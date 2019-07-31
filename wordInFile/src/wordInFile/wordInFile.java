package wordInFile;

public class wordInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "C:\\Users\\Sandiip\\eclipse-workspace\\wordInFile\\src\\wordInFile\\a.txt";
		String word = "body";
		boolean checkCase = false;
		search srch = new search();
		boolean result = srch.searchInFile(fileName, word,checkCase);
		System.out.println("Result = "+ result);
		
	}

}
