import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import static java.util.Arrays.asList;


public class PartitionTest {

    @Test
    public void partition() {
        // initialisation
        List<Integer> numbers = asList(1,2,3,4,5);

        // appel de la méthode
        List<List<Integer>> result = Partition.partition(numbers, 3);

        // vérification de la taille du résultat
        Assert.assertEquals(result.size(), 2);

        // vérification du résultat
        Assert.assertEquals(result.get(0), asList(1,2,3));
        Assert.assertEquals(result.get(1), asList(4,5));
    }
}
