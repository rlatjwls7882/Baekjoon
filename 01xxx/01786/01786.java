import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String T = br.readLine();
        String P = br.readLine();
        
        // T 중간에 P가 나타난 횟수와 위치 계산
        int[] table = makeTable(P);
        ArrayList<Integer> pos = new ArrayList<>();
        
        int idx=0, lengthT=T.length(), lengthP=P.length();
        
        for(int i=0;i<lengthT;i++) {
        	while(idx>0&&T.charAt(i)!=P.charAt(idx))
        		idx = table[idx-1];
        	
        	if(T.charAt(i)==P.charAt(idx)) {
        		if(idx==lengthP-1) {
        			pos.add(i-idx+1);
        			idx = table[idx];
        		}
        		else idx +=1;
        	}
        }
        
        bw.write(pos.size()+"\n");
        for(int i:pos)
        	bw.write(i+" ");
        
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