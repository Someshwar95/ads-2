import java.util.Scanner;
/**.
 * Class for directed graph.
 */
class Directed {
    /**.
     * initialising the int node.
     */
    private int vertices;
    /**.
     * initialising the int edges.
     */
    private int edges;
    /**.
     * initialising the bag interger class.
     */
    private Bag<Integer>[] adjacent;
    /**.
     * Constructs the object.
     *
     * @param      scan  The scanner class
     */
    Directed(final Scanner scan) {
        vertices = scan.nextInt();
        edges = 0;
        int noedges = scan.nextInt();
        adjacent = (Bag<Integer>[]) new Bag[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacent[i] = new Bag<Integer>();
        }
        for (int j = 0; j < noedges; j++) {
            int one = scan.nextInt();
            int two = scan.nextInt();
            addEdge(one, two);
        }
    }
    /**.
     * returns the number of nodes present.
     * complexity O(1).
     * @return     int value.
     */
    public int nodes() {
        return vertices;
    }
    /**.
     * returns the number of edges present.
     * complexity O(1).
     * @return     int value.
     */
    public int edges() {
        return edges;
    }
    /**.
     * Adds an edge between two nodes.
     * complexity O(1) as the complexity of
     * add method in bag is 1.
     * @param      one   One
     * @param      two   Two
     */
    public void addEdge(final int one, final int two) {
        adjacent[one].add(two);
        edges++;
    }
    /**.
     * returns the array of edges connected to the
     * node.
     * complexity O(1) as it returns the iterable array.
     * @param      one     vertix of the node.
     *
     * @return     the iterable array.
     */
    public Iterable<Integer> adjacent(final int one) {
        return adjacent[one];
    }
}
/**.
 * Class for cyclic graph.
 */
class Cyclic {
    /**.
     * initialising the boolean array.
     */
    private boolean[] link;
    /**.
     * initialising the edge array.
     */
    private int[] edgeto;
    /**
     * initialising the stack array.
     */
    private boolean[] stack;
    /**.
     * initialising the stack class object.
     */
    private Stack<Integer> sta;
    /**.
     * Constructs the object.
     *
     * @param      graph  The graph
     */
    Cyclic(final Directed graph) {
        link = new boolean[graph.nodes()];
        edgeto = new int[graph.nodes()];
        stack = new boolean[graph.nodes()];
        for (int i = 0; i < graph.nodes(); i++) {
            if (!link[i] && sta == null) {
                dfs(graph, i);
            }
        }
    }
    /**.
     * Determines if stack object is present or its null.
     * complexity O(1)
     * @return     True if has stack, False otherwise.
     */
    public boolean hasCycle() {
        return sta != null;
    }
    /**.
     * returns the stack containing the nodes.
     * complexity O(1) returns the stack.
     * @return     the iterable array.
     */
    public Iterable<Integer> stack() {
        return sta;
    }
    /**.
     * depth first search method.
     * complexity O(e) e refers to no of
     * edges.
     * @param      graph  The graph
     * @param      one    One
     */
    public void dfs(final Directed graph, final int one) {
        stack[one] = true;
        link[one] = true;
        for (int two : graph.adjacent(one)) {
            if (sta != null) {
                return;
            } else if (!link[two]) {
                edgeto[two] = one;
                dfs(graph, two);
            } else if (stack[two]) {
                sta = new Stack<Integer>();
                for (int k = one; k != two; k = edgeto[k]) {
                    sta.push(k);
                }
                sta.push(two);
                sta.push(one);
            }
        }
        stack[one] = false;
    }
}
/**.
 * { item_description }
 */
final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     * main method for the program.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Directed dg = new Directed(scan);
        Cyclic cy = new Cyclic(dg);
        if (cy.hasCycle()) {
            System.out.println("Cycle exists.");
        } else {
            System.out.println("Cycle doesn't exists.");
        }

    }
}



