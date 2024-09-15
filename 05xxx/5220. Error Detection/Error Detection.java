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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 2진수로 변환한 수, 검사비트 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String binary = Integer.toBinaryString(Integer.valueOf(st.nextToken()));
        	
        	int checkbit = Integer.valueOf(st.nextToken());
        	
        	// 1의 개수 계산
        	int oneNum=0;
        	
        	for(int i=0;i<binary.length();i++)
        		if(binary.charAt(i)=='1')
        			oneNum++;
        	
        	// 1의 개수가 짝수인지 홀수인지 여부와 검사비트와 같은지 확인
        	if(checkbit==oneNum%2)
        		bw.write("Valid\n");
        	else
        		bw.write("Corrupt\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class