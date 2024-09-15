import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// UCPC 2018의 본선이 열리는 날짜 계산
    	bw.write("20180729");
    	bw.close();
    } // end of main
} // end of Main class
