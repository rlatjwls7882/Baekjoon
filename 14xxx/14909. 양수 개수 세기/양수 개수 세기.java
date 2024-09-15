import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 정수 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	int num=0;
    	
    	// 양의 정수의 개수 확인
    	while(st.hasMoreTokens())
    		if(Integer.valueOf(st.nextToken())>0)
    			num++;
    	
    	//개수 출력
    	bw.write(num+"");
    	bw.close();
    } // end of main
} // end of Main class