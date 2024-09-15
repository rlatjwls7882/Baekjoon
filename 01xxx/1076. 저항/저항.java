import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 저항 표
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        
        // 저항값 계산
        long value=0;
        
        for(int i=1;i>=-1;i--) {
        	String input = br.readLine();
        	
        	if(i==-1) {
        		for(int j=0;j<10;j++)
        			if(color[j].equals(input)) {
        				value *= Math.pow(10, j);
        				break;
        			}
        	}
        		
        	else {
        		for(int j=0;j<10;j++)
        			if(color[j].equals(input)) {
        				value += j*Math.pow(10, i);
        				break;
        			}
        	}
        }
        
        // 저항값 출력
        bw.write(value+"");
        
        bw.close();
    } // end of main
} // end of Main class