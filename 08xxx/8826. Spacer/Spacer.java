import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// n개의 움직인 방향 입력
        	int n = Integer.valueOf(br.readLine());
        	String dir = br.readLine();
        	
        	// 상하와 좌우방향으로 움직인 최소거리 계산
        	int NS=0, EW=0;
        	
        	for(int i=0;i<n;i++) {
        		if(dir.charAt(i)=='N')
        			NS ++;
        		else if(dir.charAt(i)=='S')
        			NS --;
        		else if(dir.charAt(i)=='E')
        			EW++;
        		else
        			EW--;
        	}
        	
        	// 움직인 최소거리 계산
        	bw.write(Math.abs(NS)+Math.abs(EW)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class