// ARRAYS
// -------
// datatype array_name[size];
// 2 Ways

// 1.Java Style
// datatype[] array_name = new datatype[size];
// Ex:
// int arr[] = new int[10];
// double[] doubleArr = new double[15];
// char[] name = new char[20];\

// 2. C Style
// datatype array_name[] = new datatype[size];

// int arr[] = {10, 20, 30, 40, 50};
// int[] arr = {10, 20, 30, 40, 50};




public class OneDimArrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[0] + arr[3] - arr[4] * arr[2]);
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
