import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 트로피의 개수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	// 왼쪽에서 보이는 트로피의 개수 계산
    	Stack<Integer> trophies = new Stack<>();
    	int see=0, height=0;
    	
    	while(N-->0) {
    		int tmp = Integer.valueOf(br.readLine());
    		if(height<tmp) {
    			height=tmp;
    			see++;
    		}
    		trophies.push(tmp);
    	}
    	bw.write(see+"\n");
    	
    	// 오른쪽에서 보이는 트로피의 개수 계산
    	see=0; height=0;
    	
    	while(!trophies.isEmpty()) {
    		int tmp = trophies.pop();
    		if(height<tmp) {
    			height=tmp;
    			see++;
    		}
    	}
    	bw.write(see+"");
    	
    	bw.close();
    } // end of main
} // end of Main class