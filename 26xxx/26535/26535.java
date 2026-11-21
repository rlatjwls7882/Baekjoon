import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 닭의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 울타리의 크기 계산
        int fence = (int)Math.ceil(Math.sqrt(N))+2;
        
        // 첫번째 줄
        for(int i=0;i<fence;i++)
        	bw.write("x");
        bw.write("\n");
        
        // 2번째 줄 ~ fence-1번째 줄
        for(int i=0;i<fence-2;i++) {
        	bw.write("x");
            
        	for(int j=0;j<fence-2;j++)
        		bw.write(".");
        	bw.write("x\n");
        }
        
        // 마지막 줄
        for(int i=0;i<fence;i++)
        	bw.write("x");
        
        bw.close();
    } // end of main
} // end of Main class