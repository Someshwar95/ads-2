import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        LSD l = new LSD();
        int w = arr[0].length();
        l.sort(arr, w);
        System.out.println(Arrays.toString(arr));
    }
}