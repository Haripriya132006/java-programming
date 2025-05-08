public class matrixthingies {
    public static void main(String[] args) {
        int[][] arr={
            {1,0,0,0,0},
            {0,2,0,0,0},
            {0,0,3,0,0},
            {0,0,0,1,0},
            {0,0,0,0,0}
        };
        int flag=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (i!=j){
                    if( arr[i][j]!=0 ){
                        flag=1;
                        System.out.println("not diagonal");
                        break;
                    }
                }

            }
        }
        
        if (flag!=1){
            System.out.println("is diagonal");

        }
    }
}
