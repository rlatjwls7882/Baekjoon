import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 백준 사이트의 생일 출력
    	bw.write("3/19");
    	bw.close();
    } // end of main
} // end of Main class