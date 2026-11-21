#include<bits/stdc++.h>
using namespace std;

int ingredient[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k, r; cin >> k >> r;
    for(int i=0;i<k;i++) cin >> ingredient[i];

    int res=0;
    while(r--) {
        int maxCnt = INT_MAX;
        for(int i=0;i<k;i++) {
            int need; cin >> need;
            if(need) maxCnt = min(maxCnt, ingredient[i]/need);
        }
        int price; cin >> price;
        res = max(res, price*maxCnt);
    }
    cout << res;
}