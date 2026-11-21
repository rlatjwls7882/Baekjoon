import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int numCases=1;;numCases++) {
        	
        	// 사람수 N
        	int N = Integer.valueOf(br.readLine().trim());
        	if(N==0) break;
        		
        	// N명의 생일 그래프 생성
        	int[] graph = new int[12];
        	
        	while(N--!=0)
        		graph[Integer.valueOf(br.readLine().substring(3,5))-1]++;
        	
        	// 생일 그래프 출력
        	String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"
        			, "Aug", "Sep", "Oct", "Nov", "Dec"};
        	bw.write(String.format("Case #%d:\n", numCases));
        	
        	for(int i=0;i<12;i++) {
        		bw.write(String.format("%s:", month[i]));
        		
        		while(graph[i]-->0)
        			bw.write("*");
        		bw.write("\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class