import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 각각의 문자가 나온 횟수 계산
    	int[] character = new int[26];
    	
    	while(true)
    		try {
				String string = br.readLine();
				
				for(int i=0;i<string.length();i++)
					if(string.charAt(i)!=' ')
						character[string.charAt(i)-'a']++;
			} catch (Exception e) { break; }
    	
    	// 가장 많이 나온 문자 확인
    	int max=0;
    	
    	for(int i=0;i<26;i++)
    		if(character[i]>max)
    			max=character[i];
    	
    	for(int i=0;i<26;i++)
    		if(character[i]==max)
    			bw.write((char)('a'+i));
    	
    	bw.close();
    } // end of main
} // end of Main class