import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 학생 수 N, 상을 받는 사람 수 k 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int k = Integer.valueOf(st.nextToken());
    	
    	// N명의 점수 입력
    	LinkedList<Integer> score = new LinkedList<Integer>();
    	st = new StringTokenizer(br.readLine());
    	
    	while(N--!=0)
    		score.add(Integer.valueOf(st.nextToken()));
    	
    	// k번째 점수 출력
    	score.sort(Comparator.reverseOrder());
    	bw.write(score.get(k-1)+"");
    	
    	bw.close();
    } // end of main
} // end of Main class