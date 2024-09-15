import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 출력
    	bw.write("강한친구 대한육군\n강한친구 대한육군");
    	bw.close();
    } // end of main
} // end of Main class