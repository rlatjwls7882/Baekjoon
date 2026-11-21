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
        
        // 노움 그룹의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 노움의 수 g 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int g = Integer.valueOf(st.nextToken());
        	
        	// 노움의 왕의 위치 출력
        	int lastgnome = Integer.valueOf(st.nextToken());
        	
        	for(int i=2;i<=g;i++) {
        		int currgnome = Integer.valueOf(st.nextToken());
        		
        		if(currgnome!=lastgnome+1) {
        			bw.write(i+"\n");
        			break;
        		}
        		
        		lastgnome = currgnome;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class