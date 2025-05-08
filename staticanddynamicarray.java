public class staticanddynamicarray{

//ADT - absolute data types
    public static void main(String[] args) {
        int[] arr=new int[4];
        int size=0;

//INSERTINGGG
        insert(arr, 10, size++);
        insert(arr, 20, size++);
        insert(arr, 30, size++);
        System.out.println("after inserting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }


///GETTING SIZE
        System.out.println("\nsize of the array "+ size);


////REMOVING LAST ELEMENT
        removelast(arr, size--);
        System.out.println("\nafter removing");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

///GETTING SIZE
        System.out.println("\nsize of the array "+ size);

///GETTING ELEMENT
        get(arr, 20, size);
        get(arr, 40, size);

////GETTING SIZE
        System.out.println("size of the array "+ size);

///BEFORE AND AFTR SHIFTING
        System.out.println("\nbefore shifting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        shift(arr, size);
        System.out.println("\nafter shifting");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

//ROTATING
        insert(arr, 20, size++);
        System.out.println("\nbefore rotating");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        rotate(arr, size);
        System.out.println("\nafter rotating");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
    

///FUNCTIONSS
    public static void insert(int[] arr,int value,int size){
        arr[size]=value;

    }
    public static void removelast(int[]arr,int size){
        if(size==0){
            System.out.println("no elements in array");
        }
        arr[size]=0;
    }

    public static void get(int[]arr,int value,int size){
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                System.out.println("\nvalue "+value+" found in the array at index "+i);
                return;
            }
        }
        System.out.println("value "+value+" not in array");
        
    }

    public static void shift(int[] arr, int size) {
        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0; // or insert a specific value at index 0
    }
    
    public static void rotate(int[] arr, int size) {
        if (size == 0 ||size==1) return; // no rotation needed
    
        int last = arr[size - 1];

        for (int i = size - 1; i > 0; i--) { 
            arr[i] = arr[i - 1];
        }
        arr[0] = last; 
    }
}