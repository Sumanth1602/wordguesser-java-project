package wordguesser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Words{
	protected static List<String> word = new ArrayList<String>();
	
	public static List<String> getWord() {
		return word;
	}

	public static void setWord(List<String> word) {
		Words.word = word;
	}

	public static String getRandomWord() {
		if (word.size() == 0) {
			return "";
		}
		Random rand = new Random();
		return word.get(rand.nextInt(word.size()));
	}
public static void displayWord() throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(new File("src\\wordguesser\\Words.java"));
		while (s.hasNext()){
		    word.add(s.next());
		}
		s.close();
		 
	}
	
	
}
