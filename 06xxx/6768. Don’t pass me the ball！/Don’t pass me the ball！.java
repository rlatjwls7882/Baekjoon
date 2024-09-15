import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 골을 넣은 선수의 등번호 J 입력
    	int J = Integer.valueOf(br.readLine());
    	
    	// 골을 넣은 선수의 등번호가 4 미만이면 골이 인정이 안됨
    	if(J<4)
    		bw.write("0");
    	
    	// ₍ᴊ₋₁₎C₃ => (J-1)(J-2)(J-3)/6
    	else
    		bw.write((J-1)*(J-2)*(J-3)/6+"");
    	
    	bw.close();
    } // end of main
} // end of Main class