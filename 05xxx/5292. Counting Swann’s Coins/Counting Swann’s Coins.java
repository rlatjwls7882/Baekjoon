import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 세야할 동전의 개수 입력
        int N = Integer.valueOf(br.readLine().trim());
        
        // N개의 동전 세기
        for(int i=1;i<=N;i++) {
        	if(i%3==0&&i%5==0)
        		bw.write("DeadMan\n");
        	else if(i%3==0)
        		bw.write("Dead\n");
        	else if(i%5==0)
        		bw.write("Man\n");
        	else
        		bw.write(i+" ");
        }
        
        bw.close();
    } // end of main
} // end of Main class