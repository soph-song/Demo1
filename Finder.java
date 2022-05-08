import java.util.ArrayList;
import java.util.Arrays;

public class Finder {
    public Integer[] EvenNumberFinder(Integer[]list){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < list.length; ++i) {
            if (list[i]%2 == 0) {
                array.add(list[i]);
            }
        }
        Integer[] result = array.toArray(new Integer[array.size()]);
        return result; 

    }
}
