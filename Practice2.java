public class Practice2 {
    public static void main(String[] args) {
//        int x;
//        int y = 10,z=12;
//        x = y++ + z++;
//        System.out.println(x+" "+y+" "+z+" ");

        //practice
//        for (int k = 0; k < 20; k = k+2) {
//            if (k%3 == 1){
//                System.out.println(k+" ");
//            }
//        }

        //practice
//        System.out.println(20+1.34f+"A"+"B");


        //Practice
//        int a = 20,b = 10, c =5;
//        if ((a>>1 == b ) && (b<<1 == a)){
//            System.out.println("Possible");
//        }
//        else
//            System.out.println("Not Possible");

         //Practice
        int i = 0, j = 9;
        do {
            i++;
            if (j-- < i++) {
                break;
            }
        }
        while (i < 5);{
            System.out.println(i+""+j);
        }
    }
}
