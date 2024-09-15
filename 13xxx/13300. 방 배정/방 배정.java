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
    	
    	// 수학여행에 참가하는 학생 수 N, 한 방에 배정할 수 있는 최대 인원수 K
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken());
    	
    	// 학생들의 성별과 학년 확인
    	int[][] Stu = new int[2][6];
    	
    	while(N-->0) {
    		st = new StringTokenizer(br.readLine());
    		Stu[Integer.valueOf(st.nextToken())][Integer.valueOf(st.nextToken())-1]++;
    	}
    	
    	// 학생들을 모두 배정하기 위해 필요한 방의 수 계산
    	int room=0;
    	
    	for(int S=0;S<2;S++)
    		for(int Y=0;Y<6;Y++)
    			room += (Stu[S][Y]+(K-1))/K;
    	
    	bw.write(room+"");
    	
    	bw.close();
    } // end of main
} // end of Main class