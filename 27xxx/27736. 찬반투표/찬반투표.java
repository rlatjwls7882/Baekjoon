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
    	
    	// 재학생의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// 찬성표의 수 - 반대표의 수, 기권표의 수 입력
    	int yesOrNo=0, abstention=0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i=0;i<N;i++) {
    		int tmp = Integer.valueOf(st.nextToken());
    		
    		if(tmp==0) abstention++;
    		else yesOrNo+=tmp;
    	}
    	
    	// 투표 결과 출력
    	if(abstention*2>=N)
    		bw.write("INVALID");
    	else if(yesOrNo>0)
    		bw.write("APPROVED");
    	else
    		bw.write("REJECTED");
    	
    	bw.close();
    } // end of main
} // end of Main class