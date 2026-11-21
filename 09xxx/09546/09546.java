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
        	
        	// 정류장의 수 k
        	int k = Integer.valueOf(br.readLine());
        	
        	// 처음에 타고 있던 승객의 수 계산
        	int passenger=0;
        	while(k-->0) passenger=passenger*2+1;
        	bw.write(passenger+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class