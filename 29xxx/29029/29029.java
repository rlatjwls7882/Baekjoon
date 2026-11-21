import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 피규어 수 N, 피규어의 방향 direction
    	int N = Integer.valueOf(br.readLine());
    	String direction = br.readLine();
    	
    	// 모두 같은 방향으로 만드는데 걸리는 시간 계산
    	int North=0, South=0, East=0, West=0;
    	
    	while(N--!=0) {
    		
    		if(direction.charAt(N)=='N') {
    			East+=1;
    			West+=1;
    			South+=1;
    		}
    		
    		else if(direction.charAt(N)=='S') {
    			East+=1;
    			West+=1;
    			North+=1;
    		}
    		
    		else if(direction.charAt(N)=='E') {
    			North+=1;
    			South+=1;
    			West+=1;
    		}
    		
    		else {
    			North+=1;
    			South+=1;
    			East+=1;
    		}
    	}
    	
    	// 최소 시간 출력
    	if(North<=South&&North<=East&&North<=West)
    		bw.write(North+"");
    	
    	else if(South<=East&&South<=West)
    		bw.write(South+"");
    	
    	else if(East<=West)
    		bw.write(East+"");
    	
    	else
    		bw.write(West+"");
    	
    	bw.close();
    } // end of main
} // end of Main class