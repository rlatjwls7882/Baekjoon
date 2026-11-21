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
        
        // A 학교에서 끝난 경기의 점수 입력
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int scoreAA = Integer.valueOf(st.nextToken());
        int scoreAB = Integer.valueOf(st.nextToken());
        
        // B 학교에서 진행중인 경기의 점수 입력
        st = new StringTokenizer(br.readLine(),":");
        int scoreBB = Integer.valueOf(st.nextToken());
        int scoreBA = Integer.valueOf(st.nextToken());
        
        // 승부차기를 할 가능성이 있는지 확인
        bw.write(scoreAB>=scoreBA&&scoreAA>=scoreBB?"YES":"NO");
        
        bw.close();
    } // end of main
} // end of Main class