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
        
        // 데이터의 수 K 입력
        int K = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=K;i++) {
        	
        	// 반지름의 개수 b, 푸의 무게 w 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int b = Integer.valueOf(st.nextToken());
        	double w = Double.valueOf(st.nextToken());
        	
        	// 풍선의 총 부피 계산
        	double volume=0;
        	
        	while(b--!=0) {
        		double r = Double.valueOf(br.readLine());
        		
        		volume += Math.PI*4/3*r*r*r;
        	}
        	
        	// 풍선이 푸를 들어올릴 수 있는지 출력
        	bw.write("Data Set "+i+":\n");
        	
        	if(volume/1000>=w)
        		bw.write("Yes\n\n");
        	else
        		bw.write("No\n\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class