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
        
        // 구해야하는 자연수의 개수 T
        int T = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(T-->0) {

        	// 양의 정수 N 입력
        	int N = Integer.valueOf(st.nextToken());

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

        	// 완전수 판별
        	if(sum==N)
        		bw.write("Perfect\n");
        	else if(sum<N)
        		bw.write("Deficient\n");
        	else
        		bw.write("Abundant\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class