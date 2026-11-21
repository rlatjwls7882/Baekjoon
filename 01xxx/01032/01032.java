import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 파일 이름의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 파일 이름 입력
        String[] name = new String[N];
        
        for(int i=0;i<N;i++)
        	name[i] = br.readLine();
        
        // 패턴 출력
        for(int i=0;i<name[0].length();i++) {
        	
        	// 모든 파일 이름의 i번째 문자가 같은지 확인
        	boolean same = true;
        	
        	for(int j=1;j<N;j++)
        		if(name[j-1].charAt(i)!=name[j].charAt(i)) {
        			same = false;
        			break;
        		}
        	
        	if(same)
        		bw.write(name[0].charAt(i));
        	else
        		bw.write("?");
        }
        
        bw.close();
    } // end of main
} // end of Main class