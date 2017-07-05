import org.asm_labs.adapters.RandomAccessableFile;
import org.asm_labs.files.FileCreator;
import org.asm_labs.files.InputModifier;
import org.asm_labs.logic.InsertionSort;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;

/**
 * Created by ymaslov on 22.06.17.
 */
public class SortAndSearchApplication {
    public static void main(String[] args) throws IOException {

        FileCreator file = new FileCreator("E:\\sort-and-search-application\\src\\main\\java\\org\\asm_labs\\first.txt");
        File myFile = file.createFile();
        file.fillTheFile(myFile);

        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\sort-and-search-application\\src\\main\\java\\org\\asm_labs\\first.txt", "rw");
        RandomAccessableFile randomAccessableFile = new RandomAccessableFile(randomAccessFile);

        System.out.println("File before sorting: ");
        System.out.println("---------------------");

        for (int i = 0; i < randomAccessableFile.size(); i++) {
            System.out.println(randomAccessableFile.get(i));
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

//        long start = System.currentTimeMillis();
//        InsertionSort<String> insertionSort = new InsertionSort<>(comparator);
//        insertionSort.sort(randomAccessableFile);
//        InputModifier inputModifier = new InputModifier();
//        long elapsedTimes = (System.currentTimeMillis() - start) / 1000; //count in Millis
//
//        System.out.println("File after sorting: ");
//        System.out.println("--------------------");
//        for (int i = 0; i < randomAccessableFile.size(); i++) {
//            System.out.println(randomAccessableFile.get(i));
//        }
//
//        System.out.println("Time for sorting: " + elapsedTimes);

        InsertionSort<String> insertionSort = new InsertionSort<>(comparator);
        InputModifier<String> inputModifier = new InputModifier<>();
        inputModifier.setSort(insertionSort);
        inputModifier.modify(randomAccessableFile);
    }
}
