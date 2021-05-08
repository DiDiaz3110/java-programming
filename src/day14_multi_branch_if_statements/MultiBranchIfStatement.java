package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 20;
        if(day==1) {
            System.out.println("Monday");
        }else {
            System.out.println("Not Monday");

        if(day==2){
                System.out.println("Tuesday");}

        if(day==3){
                    System.out.println("Wednesday");
            }
        //Но если написать else if(day==2){ тогда code работает быстрее
        }
    }
}
