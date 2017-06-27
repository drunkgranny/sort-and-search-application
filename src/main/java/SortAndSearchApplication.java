import org.asm_labs.*;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;

/**
 * Created by ymaslov on 22.06.17.
 */
public class SortAndSearchApplication {
    public static void main(String[] args) throws IOException {


//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//
//            }
//        };

//        BubbleSort<Integer> bubbleSort = new BubbleSort<Integer>(comparator);
//        Integer[] a = {1, 0, 7, 4 ,2 ,9};
//        RandomAccessableArray<Integer> randomAccessableArray = new RandomAccessableArray<Integer>(a);
//        bubbleSort.sort(randomAccessableArray);
//        System.out.println("Bubble: ");
//        for (int i = 0; i < randomAccessableArray.size(); i++) {
//            System.out.println(randomAccessableArray.get(i));
//        }
//        System.out.println("Selection: ");
//        SelectionSort<Integer> selectionSort = new SelectionSort<Integer>(comparator);
//        selectionSort.sort(randomAccessableArray);
//        for (int i = 0; i < randomAccessableArray.size(); i++) {
//            System.out.println(randomAccessableArray.get(i));
//        }

        FileCreator file = new FileCreator("E:\\sort-and-search-application\\src\\main\\java\\org\\asm_labs\\first.txt");
        File myFile = file.createFile();
        file.fillTheFile(myFile);

        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\sort-and-search-application\\src\\main\\java\\org\\asm_labs\\first.txt", "rw");
        RandomAccessableFile randomAccessableFile = new RandomAccessableFile(randomAccessFile);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        long start = System.currentTimeMillis();
        BubbleSort<String> bubbleSort = new BubbleSort<String>(comparator);
        bubbleSort.sort(randomAccessableFile);
        long elapsedTimes = (System.currentTimeMillis() - start) / 1000; //count in Millis
        System.out.println(elapsedTimes);
//        for (int i = 0; i < randomAccessableFile.size(); i++) {
//            System.out.println(randomAccessableFile.get(i));
//        }

    }
}
