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
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 문제의 개수 N, 가장 쉬운 문제와 어려운 문제가 가져서는 안되는 X, Y 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int N = Integer.valueOf(st.nextToken());
        	String X = st.nextToken();
        	String Y = st.nextToken();
        	
        	// 가장 쉽고 어려운 문제가 X와 Y를 가졌는지 확인
        	String problem = br.readLine();
        	boolean EASY=false, HARD=false;
        	
        	if(problem.indexOf(X)==0)
        		EASY=true;
        	if(problem.indexOf(Y,problem.length()-Y.length())==problem.length()-Y.length())
        		HARD=true;
        	
        	// 가장 쉽고 어려운 문제가 X와 Y를 가졌는지 출력
        	if(EASY&&HARD)
        		bw.write("BOTH\n");
        	else if(EASY)
        		bw.write("EASY\n");
        	else if(HARD)
        		bw.write("HARD\n");
        	else
        		bw.write("OKAY\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class