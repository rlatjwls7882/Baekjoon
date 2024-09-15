import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	String str1 = bf.readLine();
    	
    	// 거꾸로된 문자열 생성
    	String str1Reverse = "";
    	
    	for(int i=str1.length()-1;i>=0;i--)
    		str1Reverse+=str1.charAt(i);
    	
    	// 팰린드롬 여부 출력
    	if(str1.equals(str1Reverse))
    		bw.write("1");
    	else
    		bw.write("0");
    	
    	bw.close();
    } // end of main
} // end of Main class