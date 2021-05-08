package day22_String_manipulation_methods;

public class IndexOfExample {
    public static void main(String[] args) {
        String technoligies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technoligies.indexOf(","));//4//first comma

        System.out.println(technoligies.lastIndexOf(","));//40 //last comma

        int indexOfJava = technoligies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technoligies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfCucumber = technoligies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technoligies.indexOf("sql");
        System.out.println("sql is at index " + indexOfSql);//-1, because it can not find it

        if (technoligies.contains("maven")) {//is not -1 => !=-1
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if (technoligies.indexOf("maven") > -1) {//is not -1 => !=-1///or better >=0
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
    }
}
