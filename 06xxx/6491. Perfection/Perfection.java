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
        
        while(true) {
        	try {
        		StringTokenizer st = new StringTokenizer(br.readLine());

        		while(st.hasMoreTokens()) {
        			
        			// 양의 정수 N 입력
        			int N = Integer.valueOf(st.nextToken());
        			if(N==0) break;

        			// 약수의 합 계산
        			int sum = -N;
        			
        			for(int i=1;i<=N;i++) {
        				if(N%i==0) {

        					if(i<N/i)
        						sum += i + N/i;
        					else if(i==N/i) {
        						sum+=i;
        						break;
        					}
        					else break;
        				}
        			}

        			// 완전수인 경우
        			if(sum==N)
        				bw.write(N+" PERFECT\n");

        			// 부족수인 경우
        			else if(sum<N)
        				bw.write(N+" DEFICIENT\n");

        			// 과잉수인 경우
        			else
        				bw.write(N+" ABUNDANT\n");
        		}
        		
        	} catch (Exception e) { break; }
        }
        
        bw.close();
    } // end of main
} // end of Main class