import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {

        String str ="Omer";
        System.out.println(str);
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
        StringBuffer stringBuffer = new StringBuffer(stringBuilder);
        System.out.println(stringBuffer.reverse());
        MyFunction cube = (a) -> {
            System.out.println(a * a * a);
        };
        MyFunction square = (a) -> {
            System.out.println(a * a);
        };
        MyFunction oddOrEven = (a) -> {
            if (a % 2 == 0) {
                System.out.println(a + " is even");
            } else {
                System.out.println(a + " is odd");
            }
        };

        cube.test(10);
        square.test(10);
        oddOrEven.test(10);
        System.out.println(Arrays.toString(Day.values()));
        System.out.println(Day.MONDAY.getShortName());
        Predicate<Integer> isOdd = (a) ->
        {
            if (a % 2 != 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(isOdd.test(100));
        Consumer<int[]> printEach = (arr) ->
        {
            for (int each : arr) {
                System.out.println(each);
            }
        };
        int[] arr = {10, 20, 30, 40, 50};
        printEach.accept(arr);

        Function<int[], List<Integer>> arrayToList = a ->
        {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };
        List<Integer> apply = arrayToList.apply(arr);
        System.out.println(apply);
        BiPredicate<int[], Integer> contains = (a, b) ->
        {
            for (int each : a) {
                if (each == b) {
                    return true;
                }
            }
            return false;
        };
        System.out.println(contains.test(arr, 10));

        BiConsumer<String, Integer> printMultipleTimes = (a, b) ->
        {
            for (int i = 0; i < b; i++) {
                System.out.println(a);
            }
        };
        printMultipleTimes.accept("Omer", 3);

        BiFunction<int[], int[], List<Integer>> mergeTwoArrays = (a, b) ->
        {
            List<Integer> list = new ArrayList<>();
            for (int each : a) {
                list.add(each);
            }
            for (int each : b) {
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {1,2},arr2={10,20};
        List<Integer>list = mergeTwoArrays.apply(arr1,arr2);
        System.out.println(list);



    }



}
