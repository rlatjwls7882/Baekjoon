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
        
        // 재료의 개수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 만들 수 있는 케이크의 최대 수 계산
        int cakes = 10000;
        
        while(N--!=0) {
        	
        	// 케이크 하나당 필요한 재료의 양과 주방에 있는 재료의 양 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int require = Integer.valueOf(st.nextToken());
        	int have = Integer.valueOf(st.nextToken());
        	
        	// 이 재료로 만들 수 있는 케이크수 계산
        	if(have/require<cakes)
        		cakes = have/require;
        }
        
        // 만들 수 있는 케이크의 최대 수 출력
        bw.write(cakes+"");
        bw.close();
    } // end of main
} // end of Main class