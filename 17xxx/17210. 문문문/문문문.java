import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 총 문의 개수 N 입력
    	long N = Long.valueOf(br.readLine());
    	
    	// 6 이상부터는 규칙을 만족할 수 없음
    	if(N>5)
    		bw.write("Love is open door");
    	
    	// 문을 여는 방법이 0인 경우
    	else if(br.readLine().equals("0"))
    		for(int i=2;i<=N;i++)
    				bw.write((i+1)%2+"\n");
    	
    	// 문을 여는 방법이 1인 경우
    	else
    		for(int i=2;i<=N;i++)
    				bw.write(i%2+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class