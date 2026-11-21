import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 최소 시간
    	int time=0;
    	
    	while(true) {
    		// 한글자씩 입력
    		char ch=(char)bf.read();
    		
    		// 읽어온 문자가 대문자가 아닐때 종료
    		if(!('A'<=ch&&ch<='Z')) break;
    		
    		// 최소 시간 계산
    		if('A'<=ch&&ch<='C')
    			time+=3;
    		else if('D'<=ch&&ch<='F')
    			time+=4;
    		else if('G'<=ch&&ch<='I')
    			time+=5;
    		else if('J'<=ch&&ch<='L')
    			time+=6;
    		else if('M'<=ch&&ch<='O')
    			time+=7;
    		else if('P'<=ch&&ch<='S')
    			time+=8;
    		else if('T'<=ch&&ch<='V')
    			time+=9;
    		else if('W'<=ch)
    			time+=10;
    	}
    	
    	bw.write(time+"");
    	bw.close();
    } // end of main
} // end of Main class