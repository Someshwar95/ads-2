import java.util.Scanner;
/**.
 * Class for page rank.
 */
class PageRank {
	/**.
	 * Constructs the object.
	 *
	 * @param      graph  The graph
	 */
	public PageRank(final int graph) {

	}
	/**.
	 * Gets the pr.
	 *
	 * @param      v     { parameter_description }
	 *
	 * @return     The pr.
	 */
	public double getPR(final int v) {
		return 0;
	}
	/**.
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return "";
	}
}
/**.
 * Class for web search.
 */
class WebSearch {
	/**.
	 * Constructs the object.
	 *
	 * @param      pageRank  The page rank
	 * @param      filename  The filename
	 */
	public WebSearch(final int pageRank, String filename) {
		filename = "WebContent.txt";
	}
	/**.
	 * { function_description }
	 *
	 * @param      query  The query
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int iAmFeelingLucky(String query) {
		return -1;
	}

}
/**.
 * Class for solution.
 */
public class Solution {
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
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
