import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	// 학생의 기울기를 담을 list 생성
    	HashSet<Double> stuNumIn12 = new HashSet<Double>();
    	HashSet<Double> stuNumIn34 = new HashSet<Double>();

    	// 학생 수 n 입력
    	int N = Integer.valueOf(bf.readLine());
    
    	// 학생이 수직선 위에 있는 경우를 구분하기 위한 변수
    	boolean isPlusX=true, isMinusX=true, isPlusY=true, isMinusY=true;
    	
    	// 학생 수
    	int stuNum=0;
    	
    	while(N--!=0) {
    		// 학생의 x, y좌표 입력
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		double x = Double.valueOf(st.nextToken());
    		double y = Double.valueOf(st.nextToken());
    		
    		// 학생이 수직선 위에 있는 경우
    		if(isMinusX&&x<0&&y==0) { isMinusX=false; stuNum++; }
    		else if(isPlusX&&x>0&&y==0) { isPlusX=false; stuNum++; }
    		else if(isMinusY&&x==0&&y<0) { isMinusY=false; stuNum++; }
    		else if(isPlusY&&x==0&&y>0) { isPlusY=false; stuNum++;}
    		
    		// 학생이 1,2 사분면 위에 있는 경우
    		else if(y>0)
    			stuNumIn12.add(y/x);
    		
    		// 학생이 3,4 사분면 위에 있는 경우
    		else 
    			stuNumIn34.add(y/x);
    	}

    	// 수직선 위에 없는 학생 수
    	stuNum+=stuNumIn12.size();
    	stuNum+=stuNumIn34.size();
    	
    	// 학생 수 출력
    	bw.write(stuNum+"");
    	bw.close();
    } // end of main
} // end of Main class