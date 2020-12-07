package bai_3_Class_And_Object.bai_tap;

public class StopWatch {
    private  long startTime , eadTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long eadTime) {
        this.startTime = startTime;
        this.eadTime = eadTime;
    }
    public long start(){
        return this.startTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.eadTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.eadTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println(watch.start());
        int count = 0;
        for (int i = 0;i < 100000;i++){
          for (int j = 0;j< 100000;j++){
              count ++;
          }
        }
        watch.stop();
        System.out.println(watch.stop());
        System.out.println(watch.getElapsedTime());
    }

}
