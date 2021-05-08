package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 5;
        if (floorNum  == 1){
        System.out.println("Floor 1 selected Lobby, Verizon");
    }else if(floorNum  == 2){
        System.out.println("Floor 2 selected: Cybertek, NASA, Intelsat");
    }else if(floorNum  == 3){
        System.out.println("Floor 3 selected: Lyft, BofA, Steak house");
    }else{
        System.out.println("Invalid floor: " + floorNum);
    }
        System.out.println(" ==============switch statement================");

        switch (floorNum){
        case 1:
            System.out.println("Floor 1 selected Lobby, Verizon");
            break;
        case 2:
            System.out.println("Floor 2 selected: Cybertek, NASA, Intelsat");
            break;
        case 3:
             System.out.println("Floor 3 selected: Lyft, BofA, Steak house");
            break;
        default:
            System.out.println("Invalid floor: " + floorNum);
        }
}
}