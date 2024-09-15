import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N번째 종말의 수 계산
        int i=665;
        
        while(N!=0) {
        	i++;
        	
        	if(String.valueOf(i).indexOf("666")!=-1)
        		N--;
        }
        
        // N번째 종말의 수 출력
        bw.write(i+"");
        bw.close();
    } // end of main
} // end of Main class
