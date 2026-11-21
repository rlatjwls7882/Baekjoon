import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 피의자가 한 말 입력
        String string = br.readLine();
        
        // 피의자가 캐나다인인지 확인
        if(string.lastIndexOf("eh?")==string.length()-3)
        	bw.write("Canadian!");
        else
        	bw.write("Imposter!");
        
        bw.close();
    } // end of main
} // end of Main class