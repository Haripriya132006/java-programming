//1. add element in certain position - use binary sort
//2. merge 2 arrays and sort it
//3. union of 2 arrays
//4.intersection of 2 arrrays

public class addelementincertainposition {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 9, 50};
        int[] arr2 = {50, 6, 9, 10, 40};
        int[] inter= new int[10];
        int[] temp = new int[arr1.length + arr2.length];
        int size = 0;
        for (int i = 0; i < arr1.length; i++) {
            temp[size++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < size; j++) {
                if (arr2[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[size++] = arr2[i];
            }
        }

        // Print the union
        for (int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

