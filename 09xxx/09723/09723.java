import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=T;i++) {
        	
        	// 삼각형의 세변 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] abc = new int[3];
        	
        	for(int j=0;j<3;j++)
        		abc[j] = Integer.valueOf(st.nextToken());
        	
        	// 직각 삼각형인지 판별
        	Arrays.sort(abc);
        	
        	if(abc[2]*abc[2]==abc[0]*abc[0]+abc[1]*abc[1])
        		bw.write("Case #"+i+": YES\n");
        	else
        		bw.write("Case #"+i+": NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class