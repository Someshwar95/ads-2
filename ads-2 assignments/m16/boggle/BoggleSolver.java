import java.util.Set;
public class BoggleSolver {
	private TrieST<Integer>trieST;
	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A through Z.)
	public BoggleSolver(String[] dictionary) {
		trieST = new TrieST<>();
		int count;
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].length() == 0 || dictionary[i].length() == 1 ||
				dictionary[i].length() == 2) {
				count = 0;
			}
			if (dictionary[i].length() == 3 || dictionary[i].length() == 4) {
				count = 1;
			}
			if (dictionary[i].length() == 5) {
				count = 2;
			}
			if (dictionary[i].length() == 6) {
				count = 3;
			}
			if (dictionary[i].length() == 7) {
				count = 5;
			}
			if (dictionary[i].length() >= 8) {
				count = 11;
			}
			
		}

	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable.
	public Iterable<String> getAllValidWords(BoggleBoard board) {
		if (board == null) {
			throw new IllegalArgumentException("board is null");
		}
		return new Bag<String>();
	}

	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A through Z.)
	public int scoreOf(String word) {
		if (trieST.contains(word)==false) {
			return 0;
		} else {
			return trieST.get(word);
		}
	}
}