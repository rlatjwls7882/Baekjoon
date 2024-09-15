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
        
        for(int i=1;;i++) {
        	
        	// 홀에서 파가 되는 횟수, 존이 친 타수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int p = Integer.valueOf(st.nextToken());
        	int s = Integer.valueOf(st.nextToken());
        	
        	// 0 0 입력시 종료
        	if(p==0&&s==0)
        		break;
        	
        	// 기록되는 점수 계산
        	String score="";
        	
        	if(s==1)
        		score = "Hole-in-one.";
        	
        	else if(p==s)
        		score = "Par.";
        	
        	else if(p-1==s)
        		score = "Birdie.";
        	
        	else if(p-2==s)
        		score = "Eagle.";
        	
        	else if(p-3==s)
        		score = "Double eagle.";
        	
        	else if(p+1==s)
        		score = "Bogey.";
        	
        	else
        		score = "Double Bogey.";
        		
        	// 존의 점수 출력
        	bw.write(String.format("Hole #%d\n%s\n\n", i, score));
        }
        
        bw.close();
    } // end of main
} // end of Main class