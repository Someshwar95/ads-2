import java.util.*;
public class Solution {
	public static void main(String[] args) {
		In scan = new In();
		String synsetFileName = scan.readString();
		String hypernymFileName = scan.readString();
		String implementationType = scan.readString();
		if (implementationType.equals("Graph")) {
			WordNet wordNet = new WordNet(synsetFileName, hypernymFileName);
		} else {

		}
	}
}