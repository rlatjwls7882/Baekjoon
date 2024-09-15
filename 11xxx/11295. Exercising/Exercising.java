import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int U=1;;U++) {
        	
        	// 보폭 수 입력
        	int L = Integer.valueOf(br.readLine().trim());
        	
        	if(L==0) break;
        	
        	// 사용자가 걸은 횟수 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// 사용자가 걸은 거리를 km로 출력
        	bw.write(String.format("User %d\n", U));
        	
        	while(N--!=0)
        		bw.write(String.format("%.5f\n", Double.valueOf(br.readLine())*L/100000));
        }
        
        bw.close();
    } // end of main
} // end of Main class