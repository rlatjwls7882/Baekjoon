import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 알파벳 대문자 c 입력
    	char c = (char)br.read();
    	
    	// 이동거리의 최솟값 계산
    	int d = Math.abs('I'-c)+84;
    	
    	// 이동거리 출력
    	bw.write(d+"");
    	bw.close();
    } // end of main
} // end of Main class