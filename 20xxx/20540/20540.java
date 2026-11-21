import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// MBTI 입력
    	String MBTI = bf.readLine();
    	
    	// 정반대의 MBTI 출력
    	if(MBTI.charAt(0)=='E')
    		bw.write("I");
    	else
    		bw.write("E");
    	
    	if(MBTI.charAt(1)=='S')
    		bw.write("N");
    	else
    		bw.write("S");
    	
    	if(MBTI.charAt(2)=='T')
    		bw.write("F");
    	else
    		bw.write("T");
    	
    	if(MBTI.charAt(3)=='P')
    		bw.write("J");
    	else
    		bw.write("P");
    	
    	bw.close();
    } // end of main
} // end of Main class