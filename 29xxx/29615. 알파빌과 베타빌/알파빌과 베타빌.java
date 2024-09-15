import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 대기명단에 적힌 수 N, 친구의 수 M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 친구의 수만큼 대기명단 자르기	
        HashSet<String> list = new LinkedHashSet<String>();
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<M;i++)
        	list.add(st.nextToken());
        
        // 잘라진 대기명단에 없는 친구의 수(명단을 바꾸는 횟수) 계산
        int cnt=0;
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<M;i++)
        	if(!list.contains(st.nextToken()))
        		cnt++;
        
        // 명단을 바꾸는 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class