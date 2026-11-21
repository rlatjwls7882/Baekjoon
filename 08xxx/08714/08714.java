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
        
        // 동전의 개수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 동전의 앞면의 개수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int front=0;
        
        for(int i=0;i<n;i++)
        	if(st.nextToken().equals("1"))
        		front++;
        
        // 같은 면으로 만들 때 적게 뒤집는 횟수 출력
        if(front<n-front)
        	bw.write(front+"");
        else
        	bw.write(n-front+"");
        
        bw.close();
    } // end of main
} // end of Main class