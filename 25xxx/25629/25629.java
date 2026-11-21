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
        
        // 수열의 길이 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 주어진 수열에서 홀수와 짝수의 개수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int odd=0, even=0;
        
        while(N-->0)
        	if(Integer.valueOf(st.nextToken())%2==0)
        		even++;
        	else
        		odd++;
        
        // 주어진 수열을 잘 정렬해서 홀짝 수열로 만들 수 있는지 출력
        bw.write(even==odd||even+1==odd?"1":"0");
        
        bw.close();
    } // end of main
} // end of Main class