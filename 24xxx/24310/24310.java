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
        
        // A, B, C, D 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        int C = Integer.valueOf(st.nextToken());
        int D = Integer.valueOf(st.nextToken());
        
        if(A>B) {
        	int tmp=A;
        	A=B;
        	B=tmp;
        }
        
        if(C>D) {
        	int tmp=C;
        	C=D;
        	D=tmp;
        }
        
        // 울타리에서 칠해진 판의 개수 계산
        int colored=0;
        
        // A C D B
        if(A<=C&&D<=B)
        	colored = B-A+1;
        
        // C A B D
        else if(C<=A&&B<=D)
        	colored = D-C+1;
        
        // A B C D or C D A B
        else if(B<=C||D<A)
        	colored = B-A+D-C+2;
        
        // A C B D
        else if(A<=C&&B<=D)
        	colored = D-A+1;
        
        // C A D B
        else
        	colored = B-C+1;
        
        // 울타리에서 칠해진 판의 개수 출력
        bw.write(colored+"");
        bw.close();
    } // end of main
} // end of Main class