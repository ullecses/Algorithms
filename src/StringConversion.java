import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        String strA = in.nextLine();
        String strB = in.nextLine();
        out.println();
        out.flush();
    }
}
