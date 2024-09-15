import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 딸의 수 N, 남은 펜던트의 수 O 입력
        int N = Integer.valueOf(br.readLine());
        int O = Integer.valueOf(br.readLine());
        
        // 총 펜던트의 개수의 최댓값 계산
        
        // A - A/N = O
        // A = O*N/(N-1)
        
        int A = O*N/(N-1);
        
        // 총 펜던트의 개수의 최솟값, 최댓값 계산
        if(A%N==0)
        	bw.write(A-1+" ");
        else
        	bw.write(A+" ");
        
        bw.write(A+"");
        
        bw.close();
    } // end of main
} // end of Main class