package wordguesser;

public class Levels extends System1{
	private static int Level;

	
	public static int getLevel() {
		return Level;
	}
public static int setLevel(int difficultyLevel) {
		Level= difficultyLevel;
		return Level;
	}

	
}
