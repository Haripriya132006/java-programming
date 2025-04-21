public class jumpgame {
    public static void main(String[] args){
        int[] arr={1,3,2,2,4,2,3,4,5};
        int i=0,jumps_possible;
        int n=arr.length;


        while (i < n) {
            if (arr[i] < n) {
                jumps_possible = arr[i];

                if (jumps_possible <= 0) {
                    System.out.println("false ");
                    return;
                } 

                
                else {
                    for (int j = jumps_possible; j > 0; j--) {
                        if (i + j >= n - 1) {
                            System.out.println("truee");
                            return;
                        } else {
                            System.out.println( "next iteration");
                            // no need to update jumps_possible here
                            continue;
                        }
                    }
                }
            }
            i++;
        }
        System.out.println("false"); // If loop ends without reaching the goal
    }

        

}

