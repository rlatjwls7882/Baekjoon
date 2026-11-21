import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S 입력
        String S = br.readLine();
        
        // 학점 총합 sum, 학점 개수 num 계산
        int index=0;
        double sum=0, num=0;
        
        for(int i=0;i<S.length();) {
        	
        	if(S.indexOf("A+",index)==i) {
        		i+=2;
        		sum+=4.5;
        	}
        	
        	else if(S.indexOf("A",index)==i) {
        		i+=1;
        		sum+=4;
        	}
        	
        	else if(S.indexOf("B+",index)==i) {
        		i+=2;
        		sum+=3.5;
        	}
        	
        	else if(S.indexOf("B",index)==i) {
        		i+=1;
        		sum+=3;
        	}
        	
        	else if(S.indexOf("C+",index)==i) {
        		i+=2;
        		sum+=2.5;
        	}
        	
        	else if(S.indexOf("C",index)==i) {
        		i+=1;
        		sum+=2;
        	}
        	
        	else if(S.indexOf("D+",index)==i) {
        		i+=2;
        		sum+=1.5;
        	}
        	
        	else if(S.indexOf("D",index)==i) {
        		i+=1;
        		sum+=1;
        	}
        	
        	else
        		i+=1;
        	
        	index=i;
        	num++;
        }
        
        // 학점의 산술평균 출력
        bw.write(sum/num+"");
        bw.close();
    } // end of main
} // end of Main class