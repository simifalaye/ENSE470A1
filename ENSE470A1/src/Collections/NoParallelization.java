package Collections;
import java.util.*;

public class NoParallelization 
{
	private ArrayList<String> wordList = new ArrayList<String>();
	public void addWordList(String m)
	{
		this.wordList.add(m);
	}
	public ArrayList<String> getWordList()
	{
		return this.wordList;
	}
	public void sortList()
	{
		Collections.sort(wordList);
	}
	
	public void printList()
	{
		System.out.println("The ordered list of words is:");
		for (String object: wordList) {
		    System.out.println(object);
		}
	}
	
	public void printListCE()
	{
		System.out.println("The ordered list of words beginning with \"Ce\" without using parallelization is:");
		for (String object: wordList) {
			if(object.length() >= 2)
			{
				if(object.substring(0, 2).equals("Ce"))
				{
					System.out.println(object);
				}
			}
		}
	}
}
