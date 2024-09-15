import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // X, Y, N 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.valueOf(st.nextToken());
        int Y = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        
        // 1~N 반복
        for(int i=1;i<=N;i++) {
        	
        	// X, Y로 나누어 떨어지는 경우
        	if(i%X==0&&i%Y==0)
        		bw.write("FizzBuzz\n");
        	
        	// X로 나누어 떨어지는 경우
        	else if(i%X==0)
        		bw.write("Fizz\n");
        	
        	// Y로 나누어 떨어지는 경우
        	else if(i%Y==0)
        		bw.write("Buzz\n");
        	
        	// 나누어 떨어지지 않는 경우
        	else
        		bw.write(i+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class