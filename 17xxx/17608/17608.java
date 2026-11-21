import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N개의 막대 입력
    	int N = Integer.valueOf(br.readLine());
    	Stack<Integer> bar = new Stack<Integer>();
    	
    	while(N-->0)
    		bar.add(Integer.valueOf(br.readLine()));
    	
    	// 오른쪽에서 볼때 보이는 막대의 개수 계산
    	int height=0, cansee=0;
    	
    	while(!bar.isEmpty()) {
    		int tmp = bar.pop();
    		
    		if(tmp>height) {
    			height=tmp;
    			cansee++;
    		}
    	}
    	
    	bw.write(cansee+"");
    	
    	bw.close();
    } // end of main
} // end of Main class