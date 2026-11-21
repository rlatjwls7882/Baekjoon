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
        
        // 과제를 수행한 학생의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N--!=0) {
        	
        	// 삼각형의 세 각 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] angles = new int[3];
        	
        	for(int i=0;i<3;i++)
        		angles[i] = Integer.valueOf(st.nextToken());
        	
        	// 세 각 출력
        	for(int i=0;i<3;i++)
        		bw.write(angles[i]+" ");
        	
        	// 세 각의 합이 180도인 경우
        	if(angles[0]+angles[1]+angles[2]==180)
        		bw.write("Seems OK\n");
        	
        	// 세 각의 합이 180도이 아닌 경우
        	else
        		bw.write("Check\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class