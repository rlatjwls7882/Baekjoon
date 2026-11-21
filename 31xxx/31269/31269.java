import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		Code[] codes = new Code[n];
		for(int i=0;i<n;i++) {
			codes[i] = new Code(i+1);
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			codes[Integer.valueOf(st.nextToken())-1].totalScore += n-i;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			codes[i].associationScore = Integer.valueOf(st.nextToken());
		}
		
		Arrays.sort(codes, new Comparator<Code>() {
			@Override
			public int compare(Code o1, Code o2) {
				return o2.associationScore-o1.associationScore;
			}
		});
		for(int i=0;i<n;i++) {
			codes[i].totalScore += n-i;
		}
		
		Arrays.sort(codes, new Comparator<Code>() {
			@Override
			public int compare(Code o1, Code o2) {
				return o2.totalScore-o1.totalScore;
			}
		});
		for(int i=0;i<n;i++) {
			bw.write((i+1)+". "+codes[i].name+" ("+codes[i].totalScore+")\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Code {
	String name;
	int totalScore=0, associationScore;
	public Code(int num) {
		if(num<10) {
			name="Kod0"+num;
		} else {
			name="Kod"+num;
		}
	}
} // end of Code class