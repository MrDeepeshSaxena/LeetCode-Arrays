public class Flipping_an_Image_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j * 2 < len; j++) {
                if (image[i][j] == image[i][len - j - 1]) {
                    image[i][j] ^= 1;
                    image[i][len - j - 1] = image[i][j];
                }
            }
        }
        return image;
    }
}
