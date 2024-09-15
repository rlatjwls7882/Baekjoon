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
        
        // 표제를 기록하는 날 수, 초기 달러의 가격, 역대 최고 달러화 가격 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int p = Integer.valueOf(st.nextToken());
        int h = Integer.valueOf(st.nextToken());
        
        while(n--!=0) {
        	
        	// 오늘의 달러 가격 입력
        	int i = Integer.valueOf(br.readLine());
        	
        	// 달러의 최고가격을 갱신하는 경우
        	if(h<i) {
        		bw.write("BBTV: Dollar reached "+i+" Oshloobs, A record!\n");
        		h = i;
        	}
        	
        	// 달러의 가격이 떨어지는 경우
        	else if(i<p)
        		bw.write("NTV: Dollar dropped by "+(p-i)+" Oshloobs\n");
        	
        	// 가격 갱신
        	p = i;
        }
        
        bw.close();
    } // end of main
} // end of Main class