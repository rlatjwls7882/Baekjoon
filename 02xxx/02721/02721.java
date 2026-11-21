import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		int n = Integer.valueOf(bf.readLine());
    		
    		// 가중치 T(k+1), 결과 W(n)
    		int Tk=1, Wn=0;
    		for(int k=1;k<=n;k++) {
    			Tk+=k+1;
    			Wn+=Tk*k;
    		}
    		
    		// W(n) 출력
    		bw.write(Wn+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class