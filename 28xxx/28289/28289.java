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
        
        // 학생들의 수 입력
        int P = Integer.valueOf(br.readLine());
        
        // 소프트웨어개발과, 임베디드소프트웨어개발과, 인공지능소프트웨어개발과, 동아리에 속하지 않은 학생 수 계산
        int[] club = new int[4];
        
        while(P--!=0) {
        	
        	// 학년과 반 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int Gp = Integer.valueOf(st.nextToken());
        	int Cp = Integer.valueOf(st.nextToken());
        	
        	// 1학년 학생은 동아리에 속하지 않음
        	if(Gp==1) club[3]++;
        	
        	// 1반과 2반은 소프트웨어개발과
        	else if(Cp==1||Cp==2) club[0]++;
        	
        	// 3반은 임베디드소프트웨어개발과
        	else if(Cp==3) club[1]++;
        	
        	// 4반은 인공지능소프트웨어개발과
        	else club[2]++;
        }
        
        // 각 동아리의 학생 수 출력
        for(int i=0;i<4;i++)
        	bw.write(club[i]+"\n");
        
        bw.close();
    } // end of main
} // end of Main class