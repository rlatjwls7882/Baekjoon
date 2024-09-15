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
    	
    	// 시험장의 수
    	int N = Integer.valueOf(br.readLine());
    	
    	// 각 시험장마다 학생 수
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	// 감독관이 감시하는 학생수 B, C
    	StringTokenizer ins = new StringTokenizer(br.readLine());
    	double B = Double.valueOf(ins.nextToken());
    	double C = Double.valueOf(ins.nextToken());
    	
    	// 필요한 감독관의 수 계산
    	long inspectorNum = 0;
    	
    	while(N--!=0) {
    		double stu = Double.valueOf(st.nextToken());
    		
    		// 총감독관
    		stu-=B;
    		inspectorNum++;
    		
    		// 부감독관
    		if(stu>0)
    			inspectorNum += Math.ceil(stu/C);
    	}
    	
    	// 필요한 감독관 수 출력
    	bw.write(inspectorNum+"");
    	bw.close();
    } // end of main
} // end of Main class