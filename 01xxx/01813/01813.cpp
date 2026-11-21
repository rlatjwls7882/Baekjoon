#include <bits/stdc++.h>

using namespace std;

int main(void) {
	ios::sync_with_stdio(); cin.tie(); cout.tie();
	int N; cin >> N;

	int cnt[51] = {0};
	while(N-->0) {
		int idx; cin >> idx;
		cnt[idx]++;
	}

	bool chk=false;
	for(int i=50;i>=1;i--) {
		if(i==cnt[i]) {
			cout << i;
			chk=true;
			break;
		}
	}

	if(cnt[0]>0 && !chk) {
		cout << -1;
	} else if(!chk) {
		cout << 0;
	}
}