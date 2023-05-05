public class EX extends Thread {
     public void run() {
       for (var i = 0; i<=10;i++){
//           System.out.println("This code is running in a thread");
       }
    }
    public static void main(String[] args) {

        EX thread = new EX();
         long startTime = System.nanoTime();
        thread.start();


        System.out.println("This code is outside of the thread");
        long endTime = System.nanoTime();

        System.out.println(endTime-startTime);

    }

}
