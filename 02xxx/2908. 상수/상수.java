import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 두 숫자 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine());
    	String numA = st.nextToken();
    	String numB = st.nextToken();
    	
    	// 상수가 읽는 A
    	String numARead = "";
    	for(int i=numA.length()-1;i>=0;i--)
    		numARead+=numA.charAt(i);
    	
    	// 상수가 읽는 B
    	String numBRead = "";
    	for(int i=numB.length()-1;i>=0;i--)
    		numBRead+=numB.charAt(i);
    	
    	// 큰수 출력
    	if(numARead.compareTo(numBRead)>0)
    		bw.write(numARead);
    	else
    		bw.write(numBRead);
    	
    	bw.close();
    } // end of main
} // end of Main class