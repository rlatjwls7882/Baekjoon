#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double M, N, a; cin >> M >> N >> a;

    double sum=0;
    for(int i=0;i<N;i++) {
        double tmp; cin >> tmp;
        sum += tmp;
    }

    if(a==1000) cout << "Impossible";
    else cout << (M+sum)*a/(1000-a);
}