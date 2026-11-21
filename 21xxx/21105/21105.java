import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 도넛 맛의 수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	while(N--!=0) {
    		
    		// 새가격 P, 가격 변화 C
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		double P = Double.valueOf(st.nextToken());
    		double C = Double.valueOf(st.nextToken());
    		
    		// 원래 가격 O 출력
    		double O = P*100/(C+100);
    		bw.write(O+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class