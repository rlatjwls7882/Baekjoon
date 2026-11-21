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

        // 아이들의 수, 안전 요원의 시야, 안전 요원의 위치 (x,y) 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        
        // 안전하지 못한 아이의 수 계산
        int notSafe=0;
        
        while(n--!=0) {
        	
        	st = new StringTokenizer(br.readLine());
        	int tmpx = Integer.valueOf(st.nextToken());
        	int tmpy = Integer.valueOf(st.nextToken());
        	
        	if(k<Math.sqrt((tmpx-x)*(tmpx-x)+(tmpy-y)*(tmpy-y)))
        		notSafe++;
        }
        
        // 안전하지 못한 아이의 수 출력
        bw.write(notSafe+"");
        bw.close();
    } // end of main
} // end of Main class