import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9);
        List<Integer> listWithUniques = numbers.stream().distinct().collect(Collectors.toList());
        //System.out.println(listWithUniques);
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 7, 8, 9};
        int[] uniqueArray = Arrays.stream(nums).distinct().toArray();
        //System.out.println(Arrays.toString(uniqueArray));

        List<Integer> listWithTwoLessElement = listWithUniques.stream().skip(2).collect(Collectors.toList());
        //System.out.println(listWithTwoLessElement);

        int[] arrayWithFiveElement = Arrays.stream(uniqueArray).limit(5).toArray();
        //System.out.println(Arrays.toString(arrayWithFiveElement));

        List<Integer> elementsMultipleByTen = listWithUniques.stream().map(a -> {
            if (a % 2 == 0) {
                return a * 3;
            } else {
                return a * 10;
            }
        }).collect(Collectors.toList());
        //System.out.println(elementsMultipleByTen);

        int[] arrayWithEvenNums = Arrays.stream(uniqueArray).filter(a -> a % 2 == 0).toArray();
        //System.out.println(Arrays.toString(arrayWithEvenNums));
        //System.out.println(listWithUniques.stream().filter(a -> a % 2 == 0).map(a -> {return a * 10;}).collect(Collectors.toList()));

        List<String> names = Arrays.asList("Omer","Hasan", "Emine","Betul");
        List<String> sortedList = names.stream().sorted().collect(Collectors.toList());
        //System.out.println(sortedList);

        List<Integer> listWithThrees =
                listWithUniques.stream().filter(a -> a % 3 == 0).peek(a -> System.out.println(a)).collect(Collectors.toList());
        System.out.println(listWithThrees);

    }
}
