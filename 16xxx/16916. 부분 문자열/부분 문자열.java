import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S = br.readLine();
        String P = br.readLine();
        
        // P가 S의 부분 문자열인지 확인
        int[] table = makeTable(P);
        
        int idx=0, lengthS=S.length(), lengthP=P.length();
        boolean isSubstring=false;
        
        for(int i=0;i<lengthS;i++) {
        	while(idx>0&&S.charAt(i)!=P.charAt(idx))
        		idx = table[idx-1];
        	
        	if(S.charAt(i)==P.charAt(idx)) {
        		if(idx==lengthP-1) {
        			isSubstring=true;
        			break;
        		}
        		else idx +=1;
        	}
        }
        
        bw.write(isSubstring?"1":"0");
        
        bw.close();
    } // end of main
    
    // 부분 일치 테이블 계산
    static int[] makeTable(String pattern) {
    	int length = pattern.length();
    	int[] table = new int[length];
    	
    	int idx=0;
    	for(int i=1;i<length;i++) {
    		while(idx!=0&&pattern.charAt(i)!=pattern.charAt(idx))
    			idx = table[idx-1];
    		
    		if(pattern.charAt(i)==pattern.charAt(idx)) {
    			idx++;
    			table[i] = idx;
    		}
    	}
    	
    	return table;
    } // end of makeTable
} // end of Main class