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
        
        while (true) {
        	
        	// 연호 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String g = st.nextToken();
        	
        	// 연호가 '#'인경우 종료
        	if(g.equals("#"))
        		break;
        	
        	// 년, 월, 일 입력
        	int y = Integer.valueOf(st.nextToken());
        	int m = Integer.valueOf(st.nextToken());
        	int d = Integer.valueOf(st.nextToken());
        	
        	// 연호와 날짜 출력
        	if(y>31||(y==31&&m>=5))
        		bw.write("? "+(y-30)+" "+m+" "+d+"\n");
        	
        	else
        		bw.write("HEISEI "+y+" "+m+" "+d+"\n");
		}
        
        bw.close();
    } // end of main
} // end of Main class