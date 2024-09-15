import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.valueOf(br.readLine());
    	String s = br.readLine();
    	
    	// 2, e 개수 계산
    	int twoNum=0, eNum=0;
    	
    	for(int i=0;i<N;i++) {
    		if(s.charAt(i)=='2') twoNum++;
    		else if(s.charAt(i)=='e') eNum++;
    	}
    	
    	// 개수 비교
    	if(twoNum>eNum) bw.write("2");
    	else if(eNum>twoNum) bw.write("e");
    	else bw.write("yee");
    	
    	bw.close();
    } // end of main
} // end of Main class