class islandproblem{
    public static void main(String[] args){
        int[][] arr={
        {1,1,1},
        {0,1,0},
        {1,1,1}
    };
    // System.out.println(arr.length);
    // System.out.println(arr[0].length);

    sol(arr);

    }

    public static void dulr(int i,int j,int[][]arr){
        if((i+1<arr.length) && arr[i+1][j]==1) {
            arr[i+1][j]=0;
            // System.out.println("saw an land at down");
            dulr(i+1,j,arr);
        }
        if((i-1>=0) && (arr[i-1][j]==1)){
            arr[i-1][j]=0;
            // System.out.println("saw an land at up");
            dulr(i-1,j,arr);
        }
        if( (j+1<arr[0].length) &&(arr[i][j+1]==1) ){
            arr[i][j+1]=0;
            // System.out.println("saw an land at left");
            dulr(i,j+1,arr);
        }
        if((j-1>=0) && arr[i][j-1]==1){
            arr[i][j-1]=0;
            // System.out.println("saw an land at right");
            dulr(i,j-1,arr);
        return;
        }
    }
    
    public static  void sol(int[][]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]==1){
                    count++;
                    dulr(i,j,arr); //going into dulr only if the input is one
                    //changes all the connecte 1's to 0!!
                }

            }
        }
        System.out.println( "count would be "+count);
    }
}