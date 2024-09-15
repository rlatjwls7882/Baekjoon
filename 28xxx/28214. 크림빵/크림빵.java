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
        
        // 묶음 수 N, 묶음 개수 K, 팔 수 없는 크림없는 빵의 최소 개수 P 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        int P = Integer.valueOf(st.nextToken());
        
        // 팔 수 있는 묶음의 수 계산
        st = new StringTokenizer(br.readLine());
        int canSell=0;
        
        for(int i=0;i<N;i++) {
        	
        	// 크림 없는 빵의 개수 계산
        	int noCream=0;
        	
        	for(int j=0;j<K;j++)
        		if(st.nextToken().equals("0"))
        			noCream++;
        	
        	// 크림 없는 빵의 개수가 P 미만인 경우
        	if(noCream<P)
        		canSell++;
        }
        
        // 팔 수 있는 묶음의 수 출력
        bw.write(canSell+"");
        bw.close();
    } // end of main
} // end of Main class