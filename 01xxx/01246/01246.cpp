#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int price[M];
    for(int i=0;i<M;i++) {
        cin >> price[i];
    }

    int maxPrice=0, totalPrice=0;
    for(int i=1;;i++) {
        int cnt=0;
        for(int j=0;j<M;j++) {
            if(price[j]>=i) cnt++;
        }
        if(i*min(cnt, N)>=totalPrice) {
            maxPrice=i;
            totalPrice=i*min(cnt, N);
        }
        if(cnt==0) break;
    }
    cout << maxPrice << " " << totalPrice;
}