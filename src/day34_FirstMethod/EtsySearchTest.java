package day34_FirstMethod;

public class EtsySearchTest {

    public static void main(String[] args) {
openBrowser();
navigateToEtsyUrl();
searchForWoodenSpoon();
        verifyResultsAreDisplayedl();
        System.out.println("-----Etsy Search smoke test completed - Pass");


        System.out.println("--Starting ETSY SearchSmoke Test----");
    }

        public static void openBrowser() {
            System.out.println("Launching Chrome browser");
                    }
        public static void navigateToEtsyUrl() {
            System.out.println("Navigating to https://www.etsy.com/");
        }
        public static void searchForWoodenSpoon() {
            System.out.println("Pass: Verify");
            System.out.println("Type'Wooden Spoon', click search");
        }
        public static void verifyResultsAreDisplayedl() {
            System.out.println("Pass: Search results are succesfuly displaid");
        }
    }

//openBrowser
//navigateToEtsyUrl
//searchForWoodenSpoon
//verifyResultsAreDisplayed