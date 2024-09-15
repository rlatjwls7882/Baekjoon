#include <bits/stdc++.h>

using namespace std;

struct game {
	int no;
	long long price, satisfaction;
};

bool compare(const game &a, const game &b) {
	if(a.satisfaction*b.price!=a.price*b.satisfaction) {
		return b.satisfaction*a.price<a.satisfaction*b.price;
	} else if(a.price!=b.price) {
		return a.price<b.price;
	} else {
		return a.no<b.no;
	}
}

int main(void) {
	ios::sync_with_stdio(); cin.tie(); cout.tie();
	int N, K; cin >> N >> K;

	game games[N];
	for(int i=0;i<N;i++) {
		cin>>games[i].no;
		cin>>games[i].price;
		cin>>games[i].satisfaction;
	}

	sort(games, games+N, compare);
	for(int i=0;i<K;i++) {
		cout<<games[i].no<<endl;
	}
}