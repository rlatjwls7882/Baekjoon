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
    	
    	// A, B, C 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
    	// 맛이 홀수인 칵테일 생성
    	int cocktail=1;
    	
    	if(A%2==1) cocktail*=A;
    	if(B%2==1) cocktail*=B;
    	if(C%2==1) cocktail*=C;
    	
    	// 짝수만 있는 경우
    	if(A%2==0&&B%2==0&&C%2==0)
    		cocktail=A*B*C;
    	
    	// 홀짝 칵테일의 맛 출력
    	bw.write(cocktail+"");
    	bw.close();
    } // end of main
} // end of Main class