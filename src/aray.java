public class aray {
    public static void main(String[] args) {
       // int a = 10;
        //int[] arr = {4,2,3,4,5,6,7,11,20,21};

       // System.out.println(a);
        //System.out.println(arr[0]);

        int[][] arr = {
                {3,5,7},
                {7,8,9},
                {8,10,12}
        };

        for ( int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
