import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// CroAlpha 입력
    	String CroAlpha = bf.readLine();
    	
    	// 크로아티아 알파벳 개수 계산
    	int index=0, CroAlphaNum=0;
    	while(index!=CroAlpha.length()) {

    		if(index==CroAlpha.indexOf("c=",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("c-",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("dz=",index)) {
    			index+=3;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("d-",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("lj",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("nj",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("s=",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else if(index==CroAlpha.indexOf("z=",index)) {
    			index+=2;
    			CroAlphaNum++;
    		}
    		
    		else {
    			index++;
    			CroAlphaNum++;
    		}
    	}
    	
    	// 크로아티아 알파벳 개수 출력
    	bw.write(CroAlphaNum+"");
    	bw.close();
    } // end of main
} // end of Main class