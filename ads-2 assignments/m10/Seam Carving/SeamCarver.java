import java.awt.Color;
/**.
 * Class for seam carver.
 */
public class SeamCarver {
    /**.
     * { var_description }
     */
    public static final int THOUSAND = 1000;
    /**.
     * { var_description }
     */
    private Picture picture;
    // create a seam carver object based on the given picture
    /**.
     * Constructs the object.
     *
     * @param      picture1  The picture 1
     */
    public SeamCarver(final Picture picture1) {
        if (picture1 == null) {
            throw new IllegalArgumentException("picture is null");
        } else {
            this.picture = picture1;
        }
    }
    // current picture
    /**.
     * current picture
     *
     * @return     { description_of_the_return_value }
     */
    public Picture picture() {
        return this.picture;
    }
    // width of current picture
    /**.
     * width of current picture
     *
     * @return     { description_of_the_return_value }
     */
    public int width() {
        return picture.width();
    }

    // height of current picture
    /**.
     * height of current picture
     *
     * @return     { description_of_the_return_value }
     */
    public int height() {
        return picture.height();
    }
    // energy of pixel at column x and row y
    /**.
     * energy of pixel at column x and row y
     *
     * @param      x     { parameter_description }
     * @param      y     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public double energy(final int x, final int y) {
        if (x == 0 || y == 0 || picture.width() - 1
            == x || picture.height() - 1 == y) {
            return THOUSAND;
        } else {
            Color top = picture.get(x, y + 1);
            Color bottom = picture.get(x, y - 1);
            Color right = picture.get(x - 1, y);
            Color left = picture.get(x + 1, y);
            int rh = Math.abs(right.getRed() - left.getRed());
            int bh = Math.abs(right.getBlue() - left.getBlue());
            int gh = Math.abs(right.getGreen() - left.getGreen());
            int horizontal = rh * rh + bh * bh + gh * gh;
            int rv = Math.abs(top.getRed() - bottom.getRed());
            int bv = Math.abs(top.getBlue() - bottom.getBlue());
            int gv = Math.abs(top.getGreen() - bottom.getGreen());
            int vertical = rv * rv + bv * bv + gv * gv;
            double energy = Math.sqrt(horizontal + vertical);
            return energy;
        }
    }
    // sequence of indices for horizontal seam
    /**.
     * sequence of indices for horizontal seam
     *
     * @return     { description_of_the_return_value }
     */
    public int[] findHorizontalSeam() {
        return new int[0];
    }
    // sequence of indices for vertical seam
    /**.
     * sequence of indices for vertical seam
     *
     * @return     { description_of_the_return_value }
     */
    public int[] findVerticalSeam() {
        return new int[0];
    }
    // remove horizontal seam from current picture
    /**.
     * Removes a horizontal seam.
     *
     * @param      seam  The seam
     */
    public void removeHorizontalSeam(final int[] seam) {

    }
    // remove vertical seam from current picture
    /**.
     * Removes a vertical seam.
     *
     * @param      seam  The seam
     */
    public void removeVerticalSeam(final int[] seam) {

    }
}


