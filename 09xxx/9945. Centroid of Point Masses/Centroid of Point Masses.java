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
        
        for(int caseNum=1;;caseNum++) {
        	
        	// 점의 개수 입력
        	int n = Integer.valueOf(br.readLine());
        	
        	// 점의 개수가 음수인 경우 종료
        	if(n<0) break;
        	
        	// n개의 x, y, m 입력
        	int[] x = new int[n];
        	int[] y = new int[n];
        	int[] m = new int[n];
        	
        	for(int i=0;i<n;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		x[i] = Integer.valueOf(st.nextToken());
        		y[i] = Integer.valueOf(st.nextToken());
        		m[i] = Integer.valueOf(st.nextToken());
        	}
        	
        	// 점 집합의 무게 중심 계산
        	
        	// m₁(a-x₁)+m₂(a-x₂)+...+mn(a-xn) = 0
        	// m₁(b-y₁)+m₂(b-y₂)+...+mn(b-yn) = 0
        	
        	// a = (x₁m₁+x₂m₂+...)/(m₁+m₂+...)
        	// b = (y₁m₁+y₂m₂+...)/(m₁+m₂+...)
        	
        	double ximi=0, yimi=0, mi=0;
        	
        	for(int i=0;i<n;i++) {
        		ximi += x[i]*m[i];
        		yimi += y[i]*m[i];
        		mi += m[i];
        	}
        	
        	// 점 집합의 무게 중심 출력
        	bw.write(String.format("Case %d: %.02f %.02f\n", caseNum, ximi/mi, yimi/mi));
        	
        	// 입력 마지막의 공백 제거
        	br.readLine();
        }
        
        bw.close();
    } // end of main
} // end of Main class