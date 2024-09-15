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
    	
    	// N 입력
    	int N = Integer.valueOf(bf.readLine());
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	// 마지막 원소 계산
    	int max=0;
    	while(N--!=0) {
    		int tmp = Integer.valueOf(st.nextToken());
    		
    		if(max<tmp) max=tmp;
    	}
    	
    	// 마지막 원소 출력
    	bw.write(max+"");
    	bw.close();
    } // end of main
} // end of Main class