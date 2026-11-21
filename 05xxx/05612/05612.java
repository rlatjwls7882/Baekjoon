import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	//조사한 시간 n, 터널 속 차량 intunnel 입력
    	int n = Integer.valueOf(bf.readLine());
    	int intunnel = Integer.valueOf(bf.readLine());
    	int intunnelMax = intunnel;
    	
    	for(int i=1;i<=n;i++) {
    		// 터널 속 차량 수 변경
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		intunnel += +Integer.valueOf(st.nextToken()) - Integer.valueOf(st.nextToken());
    		
    		// 최대 차량 수 측정
    		if(intunnel>intunnelMax) intunnelMax = intunnel;
    		
    		// 터널 속 차량이 0보다 작을때 최대차량을 0으로 고정
    		else if(intunnel<0) {
    			intunnelMax=0;
    			break;
    		}
    	}
    	
    	// 터널 속 최대 차량 수 출력
    	bw.write(intunnelMax+"");
    	bw.close();
    } // end of main
} // end of Main class