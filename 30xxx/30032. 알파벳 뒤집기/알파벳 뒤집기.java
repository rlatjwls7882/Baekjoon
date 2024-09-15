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
        
        // 뒤집는 알파벳의 순서
        char[] upsidedown = {'d', 'b', 'q', 'p'};
        char[] leftright = {'d', 'q', 'b', 'p'};
        
        // 격자의 크기 N, 뒤집는 방향 D 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int D = Integer.valueOf(st.nextToken());
        
        // 각각의 알파벳을 주어진 방향으로 뒤집어서 출력
        for(int i=0;i<N;i++) {
        	String string = br.readLine();
        	
        	for(int j=0;j<N;j++) {
        		
        		// 상하 방향으로 뒤집기
        		if(D==1) {
        			for(int k=0;k<4;k++)
        				if(upsidedown[k]==string.charAt(j))
        					bw.write(upsidedown[(k+2)%4]);
        		}
        		
        		// 좌우 방향으로 뒤집기
        		else
        			for(int k=0;k<4;k++)
        				if(leftright[k]==string.charAt(j))
        					bw.write(leftright[(k+2)%4]);
        	}
        	bw.write("\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class