import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _3WordPresentInTXTFileOrNot 
{

	// main method
	public static void main(String[] args) throws FileNotFoundException 
	{
		String[] myWordList=readFromFile();
		Arrays.sort(myWordList); // sort myWordordList
		int wordIndex=Arrays.binarySearch(myWordList,"Google");
		
		if(wordIndex>=0)
		{
			System.out.println("Word Found !");
		}
		else
		{
			System.out.println("Word not Found...");
		}
	}
	
	
	// return all words present in file
	public static String[] readFromFile() throws FileNotFoundException
	{
		ArrayList<String> wordList=new ArrayList<>(); // we don't know actual word count in file. so we not directly use array
		File file=new File("MyWordList.txt");
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine())// check every line one by one
		{
			String line=sc.nextLine(); // get line 
			String[] words=line.split("\\s+"); // Splitting every line into words 

			for(String word:words)
			{
				wordList.add(word); // adding  words in ArrayList
			}
		} 
		sc.close();
		return wordList.toArray(new String[0]); // convert ArrayList to Array
	}
}
