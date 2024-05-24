public class Static2 {
    static int count = 0;

    Static2(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Static2 s1 = new Static2();
        Static2 s2 = new Static2();
        Static2 s3 = new Static2();
        Static2 s4 = new Static2();
        Static2 s5 = new Static2();
    }
}
