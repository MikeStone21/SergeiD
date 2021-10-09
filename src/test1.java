public class test1 {

    public static int[] between(int a, int b) {
        // your code here

//        for (int i = a; i <= b; i++) {
//            System.out.print(" " + i);
//        }
//
//        return int[i];

        int[] result = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            result[i - a] = i;
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println(between(a,b));


//    public static int strCount(String str, char letter) {
//        //write code here
//    }
//    public static void main(String[] args) {



    }
}
