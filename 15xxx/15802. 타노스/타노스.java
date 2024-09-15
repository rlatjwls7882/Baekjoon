import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 타노스로부터 살아남는다로 찍기
    	bw.write("1");
    	bw.close();
    } // end of main
} // end of Main class