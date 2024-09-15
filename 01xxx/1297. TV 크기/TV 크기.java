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
    	
    	// 대각선 D, 높이 너비 비율 H W 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	double D = Double.valueOf(st.nextToken());
    	double H = Double.valueOf(st.nextToken());
    	double W = Double.valueOf(st.nextToken());
    	
    	// 높이 a, 너비 b 계산
    	
    	// a^2 + b^2 = D^2
    	// a:b = H:W
    	
    	// ∴ b^2 = (D^2 W^2)/(H^2 + W^2)
    	// ∴ a = (H/W)*b
    	double b = Math.sqrt(D*D*W*W/(H*H+W*W));
    	double a = H/W*b;
    	
    	// 높이, 너비 출력
    	bw.write((int)a+" "+(int)b);
    	bw.close();
    } // end of main
} // end of Main class