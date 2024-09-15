import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 줄서있는 사람의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 줄서있는 n-1명의 순서 입력
        HashMap<Integer, Integer> line = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=2;i<=n;i++)
        	line.put(Integer.valueOf(st.nextToken()), i);
        
        // 줄서있는 n명의 순서 출력
        bw.write("1");
        
        for(int i=0;i<n-1;i++)
        	bw.write(" "+line.get(i));
        
        bw.close();
    } // end of main
} // end of Main class