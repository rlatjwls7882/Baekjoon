import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 대회에 참가하는 인원수 n
    	int n = Integer.valueOf(br.readLine());
    	
    	// 등록비 총액 계산
    	bw.write(n*4000+"");
    	
    	bw.close();
    } // end of main
} // end of Main class