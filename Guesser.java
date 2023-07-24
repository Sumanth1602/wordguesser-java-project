package wordguesser;

import java.io.IOException;

public class Guesser extends Hints{
	private String GuessWord;
	private Hints hint;
	
	public String getGuessWord() {
		return GuessWord;
	}

	public void setGuessWord(String guessWord) {
		GuessWord = guessWord;
	}

	public Hints getHint() {
		return hint;
	}

	public void setHint(Hints hint) {
		this.hint = hint;
	}
public void beginGuess() throws IOException {
		// TODO Auto-generated method stub
		Words.displayWord();
		
	}
	
}
