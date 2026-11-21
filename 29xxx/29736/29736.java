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
        
        // A, B 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // 브실이가 푼 문제수 K, 양의 정수 X 입력
        st = new StringTokenizer(br.readLine());
        int K = Integer.valueOf(st.nextToken());
        int X = Integer.valueOf(st.nextToken());
        
        // 친구가 될 수 있는 사람의 수 계산
        int cnt=0;
        
        // A <= K-X <= K+X <= B 인경우
        if(A<=K-X&&K+X<=B)
        	for(int i=K-X;i<=K+X;i++)
        		cnt++;
        
        // A <= K-X <= B <= K+X 인경우
        else if(A<=K-X&&B<=K+X)
        	for(int i=K-X;i<=B;i++)
        		cnt++;
        
        // K-X <= A <= K+X <= B 인경우
        else if(K-X<=A&&K+X<=B)
        	for(int i=A;i<=K+X;i++)
        		cnt++;
        
        // K-X <= A <= B <= K+X 인경우
        else if(K-X<=A&&B<=K+X)
        	for(int i=A;i<=B;i++)
        		cnt++;
        
        // 친구가 될 수 있는 사람의 수 출력
        if(cnt>0)
        	bw.write(cnt+"");
        else
        	bw.write("IMPOSSIBLE");
        
        bw.close();
    } // end of main
} // end of Main class