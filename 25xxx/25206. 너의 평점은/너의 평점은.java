import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	double sum = 0, sumScore=0;;
    	
    	for(int i=0;i<20;i++) {
    		// 과목명, 학점, 등급 입력
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		st.nextToken();
    		double score = Double.valueOf(st.nextToken());
    		String grade = st.nextToken();
    		
    		// (학점 × 과목평점)의 합
    		if(grade.equals("A+"))
    			sum+=score*4.5;
    		else if(grade.equals("A0"))
    			sum+=score*4;
    		else if(grade.equals("B+"))
    			sum+=score*3.5;
    		else if(grade.equals("B0"))
    			sum+=score*3;
    		else if(grade.equals("C+"))
    			sum+=score*2.5;
    		else if(grade.equals("C0"))
    			sum+=score*2;
    		else if(grade.equals("D+"))
    			sum+=score*1.5;
    		else if(grade.equals("D0"))
    			sum+=score*1;
    		
    		// 학점의 총합
    		if(!grade.equals("P"))
    			sumScore+=score;
    	}
    	
    	// 전공평점 출력
    	bw.write(sum/sumScore+"");
    	bw.close();
    } // end of main
} // end of Main class