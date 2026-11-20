class bubblesort {
    public static void main(String[] args) {
        int arr[] = {42, 17, 35, 8, 36};
        int n = arr.length;
        for (int pass = 1; pass < n; pass++) {
            for (int i = 0; i < n - 1 - pass + 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            System.out.println("Pass " + pass + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
