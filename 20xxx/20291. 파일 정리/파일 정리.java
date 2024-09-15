import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 파일의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 각 확장자의 개수 확인
		TreeMap<String, Integer> extension = new TreeMap<>();
		while(N-->0) {
			String file = br.readLine();
			String fileExt = file.substring(file.indexOf(".")+1);
			extension.put(fileExt, extension.getOrDefault(fileExt, 0)+1);
		}
		
		for(String fileExt:extension.keySet())
			bw.write(fileExt+" "+extension.get(fileExt)+"\n");
		
		bw.close();
	} // end of main
} // end of Main class