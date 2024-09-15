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
        
        // 기부하는 일 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        // 각 날마다 분배할 수 있는 묶음의 최대 수를 출력
        int A=0, B=0, C=0;
        
        while(T--!=0) {
        	
        	// 기부를 받은 A, B, C 세트의 개수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	A += Integer.valueOf(st.nextToken());
        	B += Integer.valueOf(st.nextToken());
        	C += Integer.valueOf(st.nextToken());
        	
        	// 기부를 할 수 있는 경우
        	if(A>=30&&B>=30&&C>=30) {
        		
        		// A만큼 기부하는 경우
        		if(A<=B&&A<=C) {
        			bw.write(A+"\n");
        			B-=A;
        			C-=A;
        			A=0;
        		}
        		
        		// B만큼 기부하는 경우
        		else if(B<=C) {
        			bw.write(B+"\n");
        			A-=B;
        			C-=B;
        			B=0;
        		}
        		
        		// C만큼 기부하는 경우
        		else {
        			bw.write(C+"\n");
        			A-=C;
        			B-=C;
        			C=0;
        		}
        	}
        	
        	// 기부를 할 수 없는 경우
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class