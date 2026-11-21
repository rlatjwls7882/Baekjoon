import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 노래 제목 출력
        bw.write("Hymn To Love");
        
        bw.close();
    } // end of main
} // end of Main class