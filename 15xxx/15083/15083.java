import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 세 물건의 가격 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[3];
        
        for(int i=0;i<3;i++)
        	p[i] = Integer.valueOf(st.nextToken());
        
        Arrays.sort(p);
        
        // 전체 할인 쿠폰 1개와 개별 할인 쿠폰 2개 입력
        st = new StringTokenizer(br.readLine());
        int c1 = Integer.valueOf(st.nextToken());
        int[] c2 = new int[2];
        
        for(int i=0;i<2;i++)
        	c2[i] = Integer.valueOf(st.nextToken());
        
        Arrays.sort(c2);
        
        // 어떤 할인 쿠폰을 선택하는지에 따른 절약 금액 계산
        double case1=(p[0]+p[1]+p[2])*c1/100.;
        double case2=(p[1]*c2[0]+p[2]*c2[1])/100.;
        
        // 돈을 더 절약할 수 있는 선택지 출력
        if(case1>case2)
        	bw.write(String.format("one %.02f", case1));
        else
        	bw.write(String.format("two %.02f", case2));
        
        bw.close();
    } // end of main
} // end of Main class