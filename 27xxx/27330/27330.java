import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 길이 N의 정수열 A 입력
        int N = Integer.valueOf(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        
        for(int i=0;i<N;i++)
        	A[i] = Integer.valueOf(st.nextToken());
        
        // 길이 M의 정수열 B 입력
        int M = Integer.valueOf(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        HashSet<Integer> B = new HashSet<Integer>();
        
        while(M-->0)
        	B.add(Integer.valueOf(st.nextToken()));
        
        // 점수 계산
        int score=0;
        
        for(int i=0;i<N;i++) {
        	score += A[i];
        	
        	if(B.contains(score))
        		score=0;
        }
        
        // 점수 출력
        bw.write(score+"");
        bw.close();
    } // end of main
} // end of Main class