import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * javadoc
 */
public class Partition {
    static AtomicInteger counter = new AtomicInteger();

    public static List<List<Integer>> partition(List<Integer> liste,int taille){
        // Utilisation de Java 8 Stream API et sa Collectors.groupingBy() méthode de collecteur
         Collection<List<Integer>> result = liste.stream()
                .collect(Collectors.groupingBy(i -> counter.getAndIncrement() / taille))
                .values();
    return result.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Vérification du résultat
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        List<List<Integer>> result = partition(numbers, 3);
        result.forEach(s -> System.out.println(s));
    }
}
