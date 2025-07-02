#include<bits/stdc++.h>
using namespace std;

string reverse(string s) {
	for(int i=0;i<s.length()/2;i++) {
		swap(s[i], s[s.length()-1-i]);
	}
	return s;
}

int main() {
	ios::sync_with_stdio(0); cin.tie(0);
	string s; cin >> s;
	int n = s.length();

	set<string> a;
	for(int i=0;i<n;i++) {
		a.insert(s.substr(i, n-i) + s.substr(0, i));
	}

	string revS = reverse(s);
	for(int i=0;i<n;i++) {
		if(a.count(revS.substr(i, n-i) + revS.substr(0, i))) {
			cout << 1;
			return 0;
		}
	}
	cout << 0;
}