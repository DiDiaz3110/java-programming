package day23_String_Manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
    String message = "Sender: [Murodil] From Number<(202)375-1774> Message:{Hello, lets code some java}";
    int start = message.indexOf("[");
    int end = message.indexOf("]");
        System.out.println(message.substring(start +1, end));
        String sender = message.substring(start +1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        System.out.println(" Fikret ".trim());//trim takes away spaces on the borders (as well as \t and \n),
        // but not on the middle (if there is one)
        // you can do that way as well -> sender=sender.trim()

if(sender.equals("Saim")){
    System.out.println("Messafe frim Saim about HW");
    }else{
    System.out.println("Someone else messae");
    }


}
}