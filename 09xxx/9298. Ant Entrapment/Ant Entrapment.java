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
        
        for(int i=1;i<=T;i++) {
        	
        	// 개미의 수 N 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// 개미의 x,y 좌표의 최대 최솟값 계산
        	double maxX=-1000, minX=1000, maxY=-1000, minY=1000;
        	
        	while(N--!=0) {
        		
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		double x = Double.valueOf(st.nextToken());
        		double y = Double.valueOf(st.nextToken());
        		
        		if(x>maxX) maxX=x;
        		if(x<minX) minX=x;
        		if(y>maxY) maxY=y;
        		if(y<minY) minY=y;
        	}
        	
        	// 울타리로 둘러싼 넓이와 둘레 출력
        	bw.write(String.format("Case %d: Area %f, Perimeter %f\n"
                                   , i, (maxX-minX)*(maxY-minY), (maxX-minX+maxY-minY)*2));
        }
        
        bw.close();
    } // end of main
} // end of Main class