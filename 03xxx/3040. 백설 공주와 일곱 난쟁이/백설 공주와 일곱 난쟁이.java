import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 아홉 난쟁이의 모자에 써있는 숫자의 값과 합
        int[] hats = new int[9];
        int sum=0;
        
        for(int i=0;i<9;i++) {
        	hats[i] = Integer.valueOf(br.readLine());
        	sum += hats[i];
        }
        
        // 여덟번째와 아홉번째 난쟁이 확인
        int eight=0, nine=0;
        
        end:
        for(int i=0;i<9;i++)
        	for(int j=i+1;j<9;j++)
        		if(sum-hats[i]-hats[j]==100) {
        			eight=i;
        			nine=j;
        			break end;
        		}
        
        // 일곱 난쟁이의 모자에 쓰여있는 수 출력
        for(int i=0;i<9;i++)
        	if(i!=eight&&i!=nine)
        		bw.write(hats[i]+"\n");
        
        bw.close();
    } // end of main
} // end of Main class