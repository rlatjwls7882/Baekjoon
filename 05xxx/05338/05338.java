import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 마이크로소프트 로고 출력
    	bw.write("       _.-;;-._\n"
    			+ "'-..-'|   ||   |\n"
    			+ "'-..-'|_.-;;-._|\n"
    			+ "'-..-'|   ||   |\n"
    			+ "'-..-'|_.-''-._|");
    	bw.close();
    } // end of main
} // end of Main class