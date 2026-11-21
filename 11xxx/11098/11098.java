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
    	
    	// 테스트 케이스의 개수 n
    	int n = Integer.valueOf(br.readLine());
    	
    	while(n-->0) {
    		
    		// p명의 선수중 가장 비싼 선수 찾기
    		int p = Integer.valueOf(br.readLine());
    		int maxC=0;
    		String name="";
    		
    		while(p-->0) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			int C = Integer.valueOf(st.nextToken());
    			
    			if(C>maxC) {
    				maxC=C;
    				name = st.nextToken();
    			}
    		}
    		
    		bw.write(name+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class