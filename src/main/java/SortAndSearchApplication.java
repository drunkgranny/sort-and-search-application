import org.asm_labs.FileCreator;

import java.io.File;
import java.io.IOException;

/**
 * Created by ymaslov on 22.06.17.
 */
public class SortAndSearchApplication {
    public static void main(String[] args) throws IOException {
        FileCreator file = new FileCreator(args[0]);
        File myFile = file.createFile();
        file.fillTheFile(myFile);
    }
}
