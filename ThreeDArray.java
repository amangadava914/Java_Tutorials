public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] a= {{{10,20,30},{40,50,60,70}},{{80,90,100,1000},{10000,100000}}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println("The Three Dimensional Array is :"+a[i][j][k]);
                }
                //System.out.println();
            }
        }
    }
}
