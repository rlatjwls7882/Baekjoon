import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write("문제의 정답");
    	bw.close();
    } // end of main
} // end of Main class
// M1rry Christmas!