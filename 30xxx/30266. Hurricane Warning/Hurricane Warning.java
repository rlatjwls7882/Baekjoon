import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 데이터 세트의 수 K
    	int K = Integer.valueOf(br.readLine());
    	
    	for(int numCases=1;numCases<=K;numCases++) {
    		
    		// 사람의 수 n, 경보를 보낼 수 있는 미디어의 종류 m
    		int n = Integer.valueOf(br.readLine());
    		String m = br.readLine();
    		
    		// 허리케인 경보를 받는 사람의 수 계산
    		int cnt=0;
    		
    		while(n-->0) {
    			
    			String receive = br.readLine();
    			
    			for(int i=0;i<m.length();i++)
    				if(receive.indexOf(m.charAt(i))!=-1) {
    					cnt++;
    					break;
    				}
    		}
    		
    		bw.write(String.format("Data Set %d:\n%d\n\n", numCases, cnt));
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class