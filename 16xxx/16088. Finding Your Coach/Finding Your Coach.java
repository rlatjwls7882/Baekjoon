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
        
        // 테스트 케이스의 수
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// 왼쪽과 오른쪽의 코치수 l r, 바로 앞에 있는 코치 번호 n, 찾는 코치의 번호 m
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int l = Integer.valueOf(st.nextToken());
        	int r = Integer.valueOf(st.nextToken());
        	int n = Integer.valueOf(st.nextToken());
        	int m = Integer.valueOf(st.nextToken());
        	
        	// 코치가 바로 앞에 있는 경우
        	if(n==m)
        		bw.write("G\n");
        	
        	// 코치가 왼쪽에 있다고 확신하는 경우
        	else if(r<Math.abs(n-m))
        		bw.write("L\n");
        	
        	// 코치가 오른쪽에 있다고 확신하는 경우
        	else if(l<Math.abs(n-m))
        		bw.write("R\n");
        	
        	// 코치가 어디에 있는지 모르는 경우
        	else
        		bw.write("E\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class