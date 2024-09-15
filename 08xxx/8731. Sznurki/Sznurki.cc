#include <bits/stdc++.h>

using namespace std;
typedef long long ll;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n, w; cin >> n >> w;
    
    int cnt=0, cur=0;
    while(n-->0) {
        int tmp; cin >> tmp;
        cur += tmp;

        if(cur>=w) {
            cur=0;
            cnt++;
        }
    }
    cout << cnt;
}