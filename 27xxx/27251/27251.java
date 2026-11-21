import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 별을 출력할 줄의 수 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 줄에 별 출력
        for(int i=1;i<=n;i++) {
        	for(int j=0;j<i*i;j++)
        		if(j<100)
        			bw.write("*");
        		else {
        			bw.write("...");
        			break;
        		}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class