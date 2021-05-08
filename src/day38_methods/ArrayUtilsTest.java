package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 34, 909};
        ArrayUtils.printArray(nums);
        //or like this
        ArrayUtils.printArray(new int[]{23, 54, 342, 4234});

        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println(nums);
        System.out.println(new int[]{23, 54, 342, 423});

        int[] nums2 = {4, 1, 5, 8};

        System.out.println("found = " + ArrayUtils.contains(nums,23));
        System.out.println("found = " + ArrayUtils.contains(nums,45));
    }

    }
