import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        while(T-->0) {
        	String string = br.readLine();
        	
        	// 문제 결과 출력
        	if(string.charAt(0)=='P') bw.write("skipped\n");
        	else {
        		int index = string.indexOf("+");
        		int a = Integer.valueOf(string.substring(0, index));
        		int b = Integer.valueOf(string.substring(index));
        		bw.write(a+b+"\n");
        	}
        }
        	
        bw.close();
    } // end of main
} // end of Main class