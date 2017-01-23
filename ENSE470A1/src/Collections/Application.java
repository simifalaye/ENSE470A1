package Collections;
import java.io.*;
import java.util.Scanner;

public class Application 
{
	public static void main(String[] args)
	{
		NoParallelization x = new NoParallelization();
		long startTime, endTime, duration; 
		
		Scanner s;
		try 
		{
			s = new Scanner(new File("RandomText.txt"));
			while (s.hasNext()){
				x.addWordList(s.next().replaceAll("[^A-Za-z]+", ""));
			}
			s.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		if(x.getWordList().size() != 0)
		{
			startTime = System.nanoTime();
			x.sortList();
			x.printListCE();
			endTime = System.nanoTime();

			duration = (endTime - startTime) / 1000000;
			System.out.println("Execution time: " + duration + "ms.");
		}
		
	}
}
