package day25LoopsInJava;

public class WhileHungry {
    public static void main(String[] args) throws InterruptedException {
        boolean isHungry = true;
        int bananas = 0;
        int countoFull = 3;

        while(isHungry){ //or you can write (isHungry==true)//or//while(isHungry && bananas != countToFull
            bananas++;
            System.out.println("Eating a banana: "+bananas);
            Thread.sleep(1000);
            //isHungry = babanas == countToFull ? false:true;
            if(bananas == countoFull){
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, lets get back to studying");
    }
}
