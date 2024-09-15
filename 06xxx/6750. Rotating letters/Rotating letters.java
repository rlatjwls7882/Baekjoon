import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 표지판에 사용할 수 있는 알파벳
        char[] alpha = {'I', 'O', 'S', 'H', 'Z', 'X', 'N'};
        
        // 영단어 입력
        String string = br.readLine();
        
        // 영단어를 표지판에 사용할 수 있는지 판단
        boolean canUse = true;
        
        for(int i=0;i<string.length();i++) {
        	int cnt=0;
        	
        	for(int j=0;j<7;j++)
        		if(string.charAt(i)==alpha[j])
        			cnt++;
        	
        	if(cnt!=1)
        		canUse = false;
        }
        
        // 영단어를 표지판에 사용할 수 있는지 출력
        if(canUse)
        	bw.write("YES");
        else
        	bw.write("NO");
        
        bw.close();
    } // end of main
} // end of Main class