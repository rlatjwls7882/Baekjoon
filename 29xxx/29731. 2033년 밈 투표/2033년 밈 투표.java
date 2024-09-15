import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] pledges =
        	{"Never gonna give you up"
        	,"Never gonna let you down"
        	,"Never gonna run around and desert you"
        	,"Never gonna make you cry"
        	,"Never gonna say goodbye"
        	,"Never gonna tell a lie and hurt you"
        	,"Never gonna stop"};
        
        // 테스트 케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        // 공약이 바뀌었는지 확인
        boolean isNotchanged = true;
        
        while(T--!=0&&isNotchanged) {
        	int iscorrect=0;
        	String tmp = br.readLine();
        	
        	for(int i=0;i<pledges.length;i++)
        		if(pledges[i].equals(tmp))
        			iscorrect++;
        	
        	if(iscorrect!=1)
        		isNotchanged=false;
        }
        
        // 공약이 바뀌었는지 출력
        if(isNotchanged)
        	bw.write("No");
        else
        	bw.write("Yes");
        
        bw.close();
    } // end of main
} // end of Main class