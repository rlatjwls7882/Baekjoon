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
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 현재 이미지
        int[][] pixel = new int[N][N];
        for(int i=0;i<N;i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0;j<N;j++)
        		pixel[i][j] = Integer.valueOf(st.nextToken());
        }
        
        // K배 늘린 이미지
        for(int i=0;i<N*K;i++) {
        	for(int j=0;j<N;j++)
        		for(int k=0;k<K;k++)
        			bw.write(pixel[i/K][j]+" ");
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class