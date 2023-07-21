import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTerminals {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java","Python", "Job","Apple","Wooden Spoon", "Javascript", "Jeep", "Samsung","Book", "Computer","Camera");
        List<String> startsWithJ = names.stream().filter(a -> a.startsWith("J")).collect(Collectors.toList());
        //System.out.println(startsWithJ);

        int[] numbers ={10,15,20,25,30,35,40,45,50};
        int[] evenNumbers = Arrays.stream(numbers).filter(p -> p % 2 != 0).toArray();
        //System.out.println(Arrays.toString(evenNumbers));

        //System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).count());
        int evenNumbersTotal = Arrays.stream(evenNumbers).reduce(0,(a, b) -> a + b);
        //System.out.println(evenNumbersTotal);

        //names.stream().filter(p->p.startsWith("J")).forEach(p-> System.out.println(p));

        boolean b1 = Arrays.stream(numbers).allMatch(p -> p > 9);
        System.out.println(b1);
        boolean b2 = Arrays.stream(numbers).anyMatch(p -> p == 10);
        System.out.println(b2);
        boolean b3 = Arrays.stream(numbers).noneMatch(p -> p < 0);
        System.out.println(b3 );



    }
}
