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
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	// 고정비용 A, 가변비용 B, 가격 C
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 손익분기점이 존재하지 않는 경우
    	if(C<=B)
    		bw.write("-1");
    	
    	else {
    		
    		// 손익분기점 계산
    		int sellNum=A/(C-B)+1;
    		
    		// 손익 분기점 출력
    		bw.write(sellNum+"");
    	}
    	bw.close();
    } // end of main
} // end of Main class