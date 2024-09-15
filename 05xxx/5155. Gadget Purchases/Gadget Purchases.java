import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int K = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			Machine[] machines = new Machine[m+1];
			for(int j=0;j<=m;j++) {
				machines[j] = new Machine();
			}
			
			for(int j=1;j<=m;j++) {
				st = new StringTokenizer(br.readLine());
				machines[j].income -= Integer.valueOf(st.nextToken());
				machines[j].cost -= Integer.valueOf(st.nextToken());
				machines[j].use = Integer.valueOf(st.nextToken());
				machines[j].cost += Integer.valueOf(st.nextToken());
			}
			
			while(n-->0) {
				int idx = Integer.valueOf(br.readLine());
				if(machines[idx].use>0) {
					machines[idx].use--;
					machines[idx].income += machines[idx].cost;
				}
			}
			
			bw.write("Data Set "+i+":\n");
			for(int j=1;j<=m;j++) {
				if(machines[j].income>0) {
					bw.write(j+"\n");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class

class Machine {
	int cost, use, income;
	
	public Machine() {
		this.cost=0;
		this.use=0;
		this.income=0;
	}
} // end of Machine class