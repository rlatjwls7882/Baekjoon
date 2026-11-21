import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.valueOf(bf.readLine());
    	int groupWordNum=0;
    	
    	while(N--!=0) {
    		String string = bf.readLine();
    		
    		// 연속되는 문자 제거
    		String tmp = String.valueOf(string.charAt(0));
    		
    		for(int i=0;i<string.length()-1;i++)
    			if(string.charAt(i)!=string.charAt(i+1))
    				tmp+=string.charAt(i+1);
    		
    		
    		// 현재 문자가 처음 나오는지 확인
    		boolean isFirst=true;
    		
    		for(int i=0;i<tmp.length();i++)
    			if(tmp.indexOf(tmp.charAt(i))!=tmp.indexOf(tmp.charAt(i),i)) {
    				isFirst=false;
    				break;
    			}
    		
    		// 그룹 단어 개수 계산
    		if(isFirst) groupWordNum++;
    	}
    	
    	bw.write(groupWordNum+"");
    	bw.close();
    } // end of main
} // end of Main class