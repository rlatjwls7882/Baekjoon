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
    	
    	// 총 타석 수 N
    	int n = Integer.valueOf(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	// 볼넷이 아닌 타석의 합 bats, 볼넷이 아닌 타석의 수 num
    	int bats=0, num=0;
    	
    	while(n--!=0) {
    		int tmp = Integer.valueOf(st.nextToken());
    		
    		if(tmp!=-1) {
    			bats+=tmp;
    			num++;
    		}
    	}
    	
    	// 장타율 출력
    	bw.write(bats/(double)num+"");
    	bw.close();
    } // end of main
} // end of Main class