import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 이진수 A, B 입력
    	String A = br.readLine();
    	String B = br.readLine();
    	int length=100_000;
    	
    	// A&B
    	for(int i=0;i<length;i++)
    		if(A.charAt(i)=='1'&&B.charAt(i)=='1')
    			bw.write("1");
    		else
    			bw.write("0");
    	bw.write("\n");
    	
    	// A|B
    	for(int i=0;i<length;i++)
    		if(A.charAt(i)=='1'||B.charAt(i)=='1')
    			bw.write("1");
    		else
    			bw.write("0");
    	bw.write("\n");
    	
    	// A^B
    	for(int i=0;i<length;i++)
    		if(A.charAt(i)!=B.charAt(i))
    			bw.write("1");
    		else
    			bw.write("0");
    	bw.write("\n");
    	
    	// ~A
    	for(int i=0;i<length;i++)
    		if(A.charAt(i)=='0')
    			bw.write("1");
    		else
    			bw.write("0");
    	bw.write("\n");
    	
    	// ~B
    	for(int i=0;i<length;i++)
    		if(B.charAt(i)=='0')
    			bw.write("1");
    		else
    			bw.write("0");
    	
    	bw.close();
    } // end of main
} // end of Main class