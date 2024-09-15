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
    	
    	//시간 입력
    	StringTokenizer st = new StringTokenizer(bf.readLine(),":");
    	int h1 = Integer.valueOf(st.nextToken());
    	int m1 = Integer.valueOf(st.nextToken());
    	int s1 = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(bf.readLine(),":");
    	int h2 = Integer.valueOf(st.nextToken());
    	int m2 = Integer.valueOf(st.nextToken());
    	int s2 = Integer.valueOf(st.nextToken());
    	
    	int outputS=0; 
    	int outputM=0;
    	int outputH=0;
    	
    	//시간 계산
    	outputS += s2-s1; if(outputS<0) { outputS+=60; outputM-=1; } 
    	outputM += m2-m1; if(outputM<0) { outputM+=60; outputH-=1; }
    	outputH += h2-h1; if(outputH<0) outputH+=24;
    	
    	// 0시간 0분 0초가 결과로 나올 경우 24시간 0분 0초로 변경
    	if(outputS==0&&outputM==0&&outputH==0)
    		outputH=24;
    	
    	// 시분초가 한자리 수일때 앞에 0을 붙임
    	String output = "";
    	if(outputH<10) output+="0"; output += outputH+":";
    	if(outputM<10) output+="0"; output+=outputM+":";
    	if(outputS<10) output+="0"; output+=outputS;
    	
    	bw.write(output+"");
    	bw.close();
    } // end of main
} // end of Main class