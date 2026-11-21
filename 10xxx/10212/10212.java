import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 랜덤으로 한 학교 출력
        String[] mystery = {"Yonsei", "Korea"};
        bw.write(mystery[(int)(Math.random()*2)]+"");
        
        bw.close();
    } // end of main
} // end of Main class