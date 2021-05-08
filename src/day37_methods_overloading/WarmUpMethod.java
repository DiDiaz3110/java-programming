package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123"); //POSITIVE TEST / SUNNY DAY
        loginVoid("", "");//ERROR

        System.out.println(login("cybertekStudent", "abc123"));
        System.out.println(login("cybertekStudent", "abc124"));
    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equals(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login successful, welcome back Cybertek student!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        boolean successfulLogin = true;

        if(userName.equals(secretUserName) && password.equals(secretPassword)) {
            return successfulLogin;//return true and exit method here.
            //or you can do like this
            //return userName.equals(secretUserName) && password.equals(secretPassword);
        } else {
            return false;
        }

//        if(login("cybertekStudent", "abc123")){
//            System.out.println("Login successful, welcome back Cybertek student!");
//            System.out.println("Select the course to continue");
//        }else{//or you can skip else, just }
//            System.out.println("Login failed!");
     //   }
//        boolean isLoginSuccesful = login("nadir", "mountain");
//        System.out.println("isLoginSuccesful = " + isLoginSuccesful);
//        if(login("nadir", "mountain")){
//            System.out.println("welcome to Canvas, select your course");
//        }else {
//            System.out.println("Something is wrong with your credentialsno");
//        }

    }
}