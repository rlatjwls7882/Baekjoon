import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 진법수 b 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int b = Integer.valueOf(st.nextToken());
        	
        	// 진법수가 0인 경우 종료
        	if(b==0) break;
        	
        	// b진법의 정수 p m 입력
        	BigInteger p = new BigInteger(st.nextToken(),b);
        	BigInteger m = new BigInteger(st.nextToken(),b);
        	
        	// p를 m으로 나눈 나머지를 b진법으로 출력
        	bw.write(p.remainder(m).toString(b)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class