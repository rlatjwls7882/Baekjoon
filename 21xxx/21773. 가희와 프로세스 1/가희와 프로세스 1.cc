#include<bits/stdc++.h>
using namespace std;

struct element {
	int a, b, c;
	bool operator<(const element e) const {
		if(c!=e.c) return c < e.c;
		return a > e.a;
	}
};

int main() {
	ios::sync_with_stdio(0); cin.tie(0);
	int t, n; cin >> t >> n;
	priority_queue<element> pq;
	while(n--) {
		int a, b, c; cin >> a >> b >> c;
		pq.push({a, b, c});
	}

	while(t-- && !pq.empty()) {
		auto top = pq.top(); pq.pop();
		cout << top.a << '\n';
		if(top.b>1) pq.push({top.a, top.b-1, top.c-1});
	}
}