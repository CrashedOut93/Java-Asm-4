public class SwapEle {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        printArray(arr);
        swapElements(arr, 1, 5);
        printArray(arr);
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    static void swapElements(int arr[], int i, int j){
        if(i < 0 || i > arr.length-1)
            return;
        if(j < 0 || j > arr.length-1)
        return;


        int temp = arr[i]; //2
        //taking template variable and assigning the 2nd array to I which is 1

        arr[i] = arr[j]; //6
        //index 1 equals index 5 allowing the number 6 to swap to 2

        arr[j] = temp; //2
        //index 5 equals temp at index 1 allowing 2 to swap with 6
    }
}
