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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 원래 크기
        String[] strings = new String[M];
        for(int i=0;i<M;i++)
        	strings[i] = br.readLine();
        
        // K배 늘린 크기
        for(int i=0;i<M*K;i++) {
        	for(int j=0;j<N;j++)
        		for(int k=0;k<K;k++)
        			bw.write(strings[i/K].charAt(j)+"");
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class