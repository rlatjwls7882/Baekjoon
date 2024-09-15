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
    	
    	// 학생수 N, 친구관계 수 M 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 각 학생의 친구수 계산
    	int[] students = new int[N];
    	
    	while(M--!=0) {
    		st = new StringTokenizer(br.readLine());
    		students[Integer.valueOf(st.nextToken())-1]++;
    		students[Integer.valueOf(st.nextToken())-1]++;
    	}
    	
    	// 각 학생의 친구수 출력
    	for(int i=0;i<N;i++)
    		bw.write(students[i]+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class