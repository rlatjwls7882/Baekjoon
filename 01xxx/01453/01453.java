import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 손님의 수 N
    	int N = Integer.valueOf(br.readLine());
    	
    	// 거절 당하는 손님의 수 계산
    	HashSet<String> PC = new HashSet<String>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int refusal=0;
    	
    	while(N-->0)
    		if(!PC.add(st.nextToken()))
    			refusal++;
    	
    	bw.write(refusal+"");
    	
    	bw.close();
    } // end of main
} // end of Main class