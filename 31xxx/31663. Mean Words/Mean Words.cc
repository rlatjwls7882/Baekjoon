#include <bits/stdc++.h>

using namespace std;

int main(void) {
	ios::sync_with_stdio(); cin.tie(); cout.tie();
	int N; cin >> N;

	vector<string> strings;
	int maxLength=0;
	for(int i=0;i<N;i++) {
		string s; cin >> s;
		maxLength = max((int)s.length(), maxLength);
		strings.push_back(s);
	}

	for(int i=0;i<maxLength;i++) {
		int sum=0, cnt=0;
		for(int j=0;j<N;j++) {
			if(i<strings[j].length()) {
				sum += strings[j][i]-'a';
				cnt++;
			}
		}
		cout << (char)((int)(sum/(double)cnt)+97);
	}
}