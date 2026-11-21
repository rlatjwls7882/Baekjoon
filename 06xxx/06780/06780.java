import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 수열의 t1, t2 입력
        int t1 = Integer.valueOf(br.readLine());
        int t2 = Integer.valueOf(br.readLine());
        
        // 수열의 길이 계산
        int length=2;
        
        while(t2<=t1) {
        	
        	int tmp = t1-t2;
        	t1 = t2;
        	t2 = tmp;
        	
        	length++;
        }
        
        // 수열의 길이 출력
        bw.write(length+"");
        bw.close();
    } // end of main
} // end of Main class