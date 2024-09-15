import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 독특한 돌의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 돌을 넣을 상자의 열과 행의 합이 최소가 되는 상자 계산 
        int i=1, j=1;
        
        while(i*j<N) {
        	
        	if(i==j) i++;
        	else j++;
        }
        
        // 상자의 열과 행 출력
        bw.write(i+" "+j);
        bw.close();
    } // end of main
} // end of Main class