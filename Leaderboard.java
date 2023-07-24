package wordguesser;

public class Leaderboard extends Player{
	private int sampleScore;
	
	public int getSampleScore() {
		return sampleScore;
	}

	public void setSampleScore(int sampleScore) {
		this.sampleScore = sampleScore;
	}
public Leaderboard(String name2, int difficultyLevel2, int score) {
		super(name2, difficultyLevel2);
		// TODO Auto-generated constructor stub
		this.sampleScore=score;
	}
	
	public void displayLeaderboard(int difficultyLevel) {
		if (super.getDifficultyLevel() == difficultyLevel) {
		System.out.println(super.getName()+"\t\t\t"+this.sampleScore);
		}
	}
}
