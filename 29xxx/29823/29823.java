import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 로봇이 밟은 단계 수, 걸음 방향 입력
        int N = Integer.valueOf(br.readLine());
        String dir = br.readLine();
        
        // 처음위치로 돌아오는 최소 단계수 계산
        int x=0, y=0;
        
        for(int i=0;i<N;i++) {
        	
        	if(dir.charAt(i)=='N')
        		y++;
        	else if(dir.charAt(i)=='S')
        		y--;
        	else if(dir.charAt(i)=='E')
        		x++;
        	else
        		x--;
        }
        
        // 처음위치로 돌아오는 최소 단계수 출력
        bw.write(Math.abs(x)+Math.abs(y)+"");
        bw.close();
    } // end of main
} // end of Main class