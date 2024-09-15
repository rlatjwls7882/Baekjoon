#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> M;

    int sum=0, list[M];
    for(int i=0;i<M;i++) {
        cin >> list[i];
        sum += list[i];
    }
    int K; cin >> K;

    long double total=0;
    for(int i=0;i<M;i++) {
        long double pro=1;
        if(K>list[i]) continue;
        for(int j=0;j<K;j++) {
            pro = pro*(list[i]-j)/(sum-j);
        }
        total += pro;
    }
    cout.precision(10);
    cout << total;
}