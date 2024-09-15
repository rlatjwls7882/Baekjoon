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
        
        // 점수의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // M과 J의 평균 점수 계산
        long Msum=0, Jsum=0;
        double M=0, J=0;
        
        while(N-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	if(st.nextToken().charAt(0)=='M') {
        		M++;
        		Msum += Integer.valueOf(st.nextToken());
        	}
        	
        	else {
        		J++;
        		Jsum += Integer.valueOf(st.nextToken());
        	}
        }
        
        // M과 J중 평균점수가 누가 높은지 확인
        if(M==0) M=1;
        if(J==0) J=1;
        
        bw.write(Msum/M>Jsum/J?"M":Msum/M==Jsum/J?"V":"J");
        
        bw.close();
    } // end of main
} // end of Main class