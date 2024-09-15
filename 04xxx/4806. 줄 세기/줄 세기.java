import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String tmp;
    	int lineNum=0;
    	
    	// 줄의 개수 계산
    	while((tmp = br.readLine())!=null)
    		lineNum++;
    	
    	// 줄의 개수 출력
    	bw.write(lineNum+"");
    	bw.close();
    } // end of main
} // end of Main class