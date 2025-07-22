public class MultiThreading extends Thread {
    public String name;
    public static int count = 0;
    MultiThreading(String name){
        this.name = name;
    }
   public void run (){
    try{
        System.out.println("Thread " +  this.name + " is running");
        long sum = 0;
        for (long i = 1; i <= 1_00; i++) { // Heavy computation
            Thread.sleep(10);
             sum += i;
             synchronized (MultiThreading.class) {
                // Only one thread can execute this block at a time
                if (this.name.equals("pani1")) {
                    count -= i + 1_0000;
                } else {
                    count += i;
                }
            }
            //  if(this.name == "pani1"){
            //     count-= i+1_0000;
            //  }
            //  else{
            //     count+= i;
            //  }
             
             System.out.println("Thread " + this.name + " is running with count " + this.count);
        }
        System.out.println(count);
    }
    catch (Exception e){
        System.out.println(e);
    }
   }
}

class THreadExample{
    
    public static void main(String[] args) {
        MultiThreading t1 = new MultiThreading("pani1");
        MultiThreading t2 = new MultiThreading("pani2");
        MultiThreading t3 = new MultiThreading("pani3");
        t1.start();
        t2.start();
        t3.start();
        
    }
}