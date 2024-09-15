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
    	
    	// 파일 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// N개의 파일 입력
    	String[] files = new String[N];
    	
    	for(int i=0;i<N;i++)
    		files[i] = br.readLine();
    		
    	// 간격 수 M 입력
    	int M = Integer.valueOf(br.readLine());
    	
    	while(M--!=0) {
    		
    		// 간격 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int first = Integer.valueOf(st.nextToken());
    		int end = Integer.valueOf(st.nextToken());
    		
    		// 간격 사이의 모든 파일을 출력
    		for(int i=first-1;i<end;i++)
    			bw.write(files[i]+"\n");
    	}

    	bw.close();
    } // end of main
} // end of Main class