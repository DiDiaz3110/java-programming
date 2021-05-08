package HomeworkReplIt;

public class UtopeanTree {
    public static void main(String[] args) {
        int ageOfTree = 1;
        int treeGrowth = 1;
        int treeSize = 1;

        while (ageOfTree <= 10) {
            System.out.println("year " + ageOfTree + " - growth " + treeGrowth + " cm");
            System.out.println("tree size: " + treeSize + "cm");
            ageOfTree++;
            treeGrowth = 1;
            treeSize++;

            while (ageOfTree >= 3 && ageOfTree <= 10) {
                System.out.println("year " + ageOfTree + " - growth " + treeGrowth + " cm");
                System.out.println("tree size: " + treeSize + "cm");
                ageOfTree++;
                treeGrowth = 2;
                treeSize += 2;

            }
        }
    }
}

