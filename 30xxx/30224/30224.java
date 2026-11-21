import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력
        String N = br.readLine();
        
        // 출력
        if(N.indexOf("7")==-1) {
        	if(Long.valueOf(N)%7!=0)
        		bw.write("0");
        	else
        		bw.write("1");
        }
        
        else {
        	if(Long.valueOf(N)%7!=0)
        		bw.write("2");
        	else
        		bw.write("3");
        }
        
        bw.close();
    } // end of main
} // end of Main class