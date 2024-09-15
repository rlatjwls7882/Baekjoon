import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 메달의 개수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] medal = new int[6];
        	
        	for(int i=0;i<6;i++)
        		medal[i] = Integer.valueOf(st.nextToken());
        	
        	// 개수 비교
        	boolean count=false;
        	
        	if(medal[0]+medal[1]+medal[2]>medal[3]+medal[4]+medal[5])
        		count=true;
        	
        	// 색상 비교
        	boolean color=false;
        	
        	if(medal[0]>medal[3]||(medal[0]==medal[3]&&medal[1]>medal[4])
               ||(medal[0]==medal[3]&&medal[1]==medal[4]&&medal[2]>medal[5]))
        		color=true;
        	
        	// 미국이 이긴 항목 출력
        	for(int i=0;i<6;i++)
        		bw.write(medal[i]+" ");
        	
        	if(color&&count)
        		bw.write("both\n\n");
        	else if(count)
        		bw.write("count\n\n");
        	else if(color)
        		bw.write("color\n\n");
        	else
        		bw.write("none\n\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class