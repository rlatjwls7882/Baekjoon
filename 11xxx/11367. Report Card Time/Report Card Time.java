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
    	
    	// 반에 속한 호빗 수
    	int N = Integer.valueOf(br.readLine());
    	
    	while(N--!=0) {
    		
    		// 이름과 점수를 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String name = st.nextToken();
    		int score = Integer.valueOf(st.nextToken());
    		
    		// 이름과 성적 출력
    		bw.write(name+" ");
    		
    		if(score>=97)
    			bw.write("A+\n");
    		else if(score>=90)
    			bw.write("A\n");
    		else if(score>=87)
    			bw.write("B+\n");
    		else if(score>=80)
    			bw.write("B\n");
    		else if(score>=77)
    			bw.write("C+\n");
    		else if(score>=70)
    			bw.write("C\n");
    		else if(score>=67)
    			bw.write("D+\n");
    		else if(score>=60)
    			bw.write("D\n");
    		else
    			bw.write("F\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class