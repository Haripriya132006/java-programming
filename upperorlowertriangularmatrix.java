public class upperorlowertriangularmatrix {
    
    public static void main(String[] args) {
        int[][] matrix={
            {1,0,1},
            {0,1,0},
            {1,0,0}
        };
        if(checkupper(matrix)){
            System.out.println("upperr");
        }
        else{
            System.out.println("not upper");
        }

        if(checklower(matrix)){
            System.out.println("lowerrr");
        }
        else{
            System.out.println("not lowerrr");
        }
        
        if(symmetric(matrix)){
            System.out.println("symettric");
        }
        else{
            System.out.println("not symmetric");
        }
    
    }


    public static boolean checkupper(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i][j]!=0){
                    // System.out.println("not a upper triangle matrix");
                    return false; 
                }
            }
        }
        return true;
    }

    public static boolean checklower(int[][] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[i][j]!=0){
                    // System.out.println("not a upper triangle matrix");
                    return false; 
                }
            }
        }
        return true;
    }

    public static boolean symmetric(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (arr[i][j]!=arr[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

}
