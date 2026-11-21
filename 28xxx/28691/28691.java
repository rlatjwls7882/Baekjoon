import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 동아리의 첫번째 글자 입력
    	String string = bf.readLine();
    	
    	// 전체 이름 출력
    	if(string.equals("M"))
    		bw.write("MatKor");
    	else if(string.equals("W"))
    		bw.write("WiCys");
    	else if(string.equals("C"))
    		bw.write("CyKor");
    	else if(string.equals("A"))
    		bw.write("AlKor");
    	else
    		bw.write("$clear");
    	
    	bw.close();
    } // end of main
} // end of Main class