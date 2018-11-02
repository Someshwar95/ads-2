import java.util.Arrays;
public class WordNet {

    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) {
        parseMySynsetFile(synsets);
    }
    void parseMySynsetFile(String filename) {
        int id = 0;
        int numOfVertices = 0;
        //In in = new In();
        try {
            In inObj = new In(filename);
            while (!inObj.isEmpty()) {
                numOfVertices++;
                //System.out.println("came inside while loop");
                String[] fileArray = inObj.readString().split(",");
                //numOfVertices = fileArray.length;
                id = Integer.parseInt(fileArray[0]);
                String[] nounsArray = fileArray[1].split(" ");
                System.out.println(Arrays.toString(fileArray));
            }
            Digraph digraphObj = new Digraph(numOfVertices);
            System.out.println(digraphObj);
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
    // returns all WordNet nouns
    public Iterable<String> nouns() {
        return null;
    }

    // is the word a WordNet noun?
    public boolean isNoun(String word) {
        return true;
    }

    // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB) {
        return  0;
    }

    // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB) {
        return "";
    }

    // do unit testing of this class
    public static void main(String[] args) {
        
    }
}
