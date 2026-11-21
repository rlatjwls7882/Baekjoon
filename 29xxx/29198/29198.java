import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	
    	// N, M, K를 입력(M은 안씀)
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	int K = Integer.valueOf(st.nextToken());
    	
    	ArrayList<String> strings = new ArrayList<String>();
    	
    	// N개의 문자열을 입력
    	while(N--!=0)
    		strings.add(bf.readLine());
    	
    	// 입력받은 문자열중 작은것부터 K개를 꺼냄
    	strings.sort(null);
    	String string = "";
    	
    	for(int i=0;i<K;i++)
    		string+=strings.get(i);
    	
    	// 문자열을 오름차순으로 재배치함
    	char[] charr = string.toCharArray();
    	Arrays.sort(charr);
    	
    	// 결과 출력
    	bw.write(String.valueOf(charr)+"");
    	bw.close();
    } // end of main
} // end of Main class