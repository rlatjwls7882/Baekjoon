import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열의 길이 N, 문자열 str 입력
    	int N = Integer.valueOf(br.readLine());
    	String str = br.readLine();
    	
    	// 1의 개수를 깨어있는 강의 수로 인식
    	str = str
    			.replace("100", "3")
    			.replace("10", "11")
    			.replace("0", "")
    			.replace("3", "111");
    	
    	// 깨어있는 강의 수 출력
    	bw.write(str.length()+"");
    	bw.close();
    } // end of main
} // end of Main class