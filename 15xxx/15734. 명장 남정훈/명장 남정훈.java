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
    	
    	// 왼발 선수 L, 오른발 선수 R, 양발 선수 A
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int L = Integer.valueOf(st.nextToken());
    	int R = Integer.valueOf(st.nextToken());
    	int A = Integer.valueOf(st.nextToken());
    	
    	// 잔류 인원 계산
    	int diff = Math.abs(L-R);
    	int remainPeople=0;
    	
    	remainPeople+= Math.min(L, R)*2;
    	remainPeople+= Math.min(A, diff)*2;
    	
    	if(A-diff>0) remainPeople+= (A-diff)/2*2;
    	
    	// 잔류 인원수 출력
    	bw.write(remainPeople+"");
    	bw.close();
    } // end of main
} // end of Main class