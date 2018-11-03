import java.util.*;
class PageRank {
	public PageRank(int graph) {

	}
	public double getPR(int v) {
		return 0;
	}
	public String toString() {
		return "";
	}
}

class WebSearch {
	public WebSearch(int pageRank, String filename) {

	}
	public int iAmFeelingLucky(String query) {
		return -1;
	}

}


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		// read the first line of the input to get the number of vertices
		for (int i = 1;i <= n;i++) {
			for (int j = 1;j <= n;j++) {
			}
		}
		// iterate count of vertices times 
		// to read the adjacency list from std input
		// and build the graph
		
		
		// Create page rank object and pass the graph object to the constructor
		
		// print the page rank object
		
		// This part is only for the final test case
		
		// File path to the web content
		String file = "WebContent.txt";
		
		// instantiate web search object
		// and pass the page rank object and the file path to the constructor
		
		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky
		System.out.println("iAmFeelingLucky");
		
	}
}
