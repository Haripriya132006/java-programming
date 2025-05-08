public class multithread extends Thread {
    public static void main(String[] args) {
        multithread multi=new multithread();
        multi.start(); //if we give run .. it will run single threaded .. start kodutha multi threaded
        multithread multi1=new multithread();
        multi1.start(); //start makes run as multithreaded
        multithread multi3=new multithread();
        multi3.start(); //start makes run as multithreaded
    }

    @Override
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
