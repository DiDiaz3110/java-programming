package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        //int seconds = 0;
        //video 1 min 57 sec
        //while we did not reach to last sec
        //print "Watching YouTube video: second:1

        //print "Finished watching Cat Video, lets start another one"
        System.out.println("World's smallest cat video");
        int seconds = 117;
        while(seconds<=117){
            System.out.println("Watching YouTube video: second: " + seconds);
            seconds --;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching Cat Video, lets start another one");
    }
}
