#include<bits/stdc++.h>
using namespace std;

int cnt[10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        for(int i=1;i<=9;i++) cin >> cnt[i];
        cnt[9]+=cnt[6];
        cnt[6]=0;

        int len = accumulate(cnt, cnt+10, 0);
        vector<int> res(len);
        int l=0, r=len-1;
        for(int i=9, idx=0;i>=1;i--) {
            while(cnt[i]--) {
                if(idx++%2==0) res[l++]=i;
                else res[r--]=i;
            }
        }
        for(int e : res) cout << e << ' ';
        cout << '\n';
    }
}