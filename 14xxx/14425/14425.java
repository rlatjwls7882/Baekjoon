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
    	
    	// 집합에 있는 문자열 수 N, 검사할 문자열 수 M 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	// 집합에 N개의 문자열 입력
    	HashSet<String> strings = new HashSet<String>();
    	
    	while(N--!=0)
    		strings.add(br.readLine());
    	
    	// M개의 문자열중 집합에 존재하는 문자열의 수 계산
    	int existNum=0;
    	
    	while(M--!=0)
    		if(strings.contains(br.readLine()))
    			existNum++;
    	
    	// 집합에 존재하는 문자열 수 출력
    	bw.write(existNum+"");
    	bw.close();
    } // end of main
} // end of Main class