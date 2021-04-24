import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.Files.newInputStream;

public class InputOutputStreamUse {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\paul9\\Desktop\\Java\\Hello.txt");
        Path outputPath = Paths.get("C:\\Users\\paul9\\Desktop\\Java\\Hello2.txt");
        InputStream input;
        try {
            input = Files.newInputStream(inputPath, StandardOpenOption.READ);
            /*int i;
            while ((i = input.read()) != -1){
                System.out.print((char) i);
            }*/
            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);
            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);
            byte[] data = new byte[1024];
            int i;
            while((i = input.read(data) ) != -1) {
                outputStream.write(data);
            }
            input.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
