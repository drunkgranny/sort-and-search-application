import org.asm_labs.BubbleSort;
import org.asm_labs.FileCreator;
import org.asm_labs.RandomAccessable;
import org.asm_labs.RandomAccessableArray;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

/**
 * Created by ymaslov on 22.06.17.
 */
public class SortAndSearchApplication {
    public static void main(String[] args) throws IOException {
        FileCreator file = new FileCreator(args[0]);
        File myFile = file.createFile();
        file.fillTheFile(myFile);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);

            }
        };

        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>(comparator);
        Integer[] a = {1, 0, 7, 4 ,2 ,9};
        RandomAccessableArray<Integer> randomAccessableArray = new RandomAccessableArray<Integer>(a);
        bubbleSort.sort(randomAccessableArray);
        for (int i = 0; i < randomAccessableArray.size(); i++) {
            System.out.println(randomAccessableArray.get(i));
        }

    }
}
