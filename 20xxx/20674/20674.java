import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 조작할 일 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 조작해야하는 수치의 최솟값 계산
        int control=0, beforep=0;
        
        for(int i=0;i<N;i++) {
        	
        	// i번째 날의 확진자 수 입력
        	int p = Integer.valueOf(br.readLine());
        	
        	if(i==0)
        		beforep=p;
        	
        	// 수치 조작
        	if(p>beforep)
        		control += p-beforep;
        	else
        		beforep = p;
        }
        
        // 조작해야하는 수치의 최솟값 출력
        bw.write(control+"");
        bw.close();
    } // end of main
} // end of Main class