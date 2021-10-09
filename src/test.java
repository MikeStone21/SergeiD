public class test {
    public static void main(String[] args) {
        int[] arr = {10,9,15,8,12};

        int sum = 0;
        int index = 0;
        int max = arr[index];
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i]; //сумма //  sum += arr[i]
            if (max < arr[i]) { //min>arr[i]
                max = arr[i];   //min = arr[i]
                index = i;
            }

        }
        System.out.println(max);
        System.out.println(index);
    }
}
