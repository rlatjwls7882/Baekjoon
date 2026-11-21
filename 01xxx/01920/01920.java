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
        
        // 정수의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 정수 입력
        HashSet<String> A = new HashSet<String>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(N--!=0)
        	A.add(st.nextToken());
        
        // 검색할 정수의 수 M 입력
        int M = Integer.valueOf(br.readLine());
        
        // 검색하여 존재하면 1, 없으면 0 출력
        st = new StringTokenizer(br.readLine());
        
        while(M--!=0) {
        	if(A.contains(st.nextToken()))
        		bw.write("1\n");
        	else
        		bw.write("0\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class