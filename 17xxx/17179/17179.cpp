#include<bits/stdc++.h>
using namespace std;

int s[1002];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, l; cin >> n >> m >> l;
    for(int i=1;i<=m;i++) cin >> s[i];

    while(n--) {
        int q; cin >> q;
        int left=0, right=l;
        while(left<right) {
            int mid = left+right+1>>1;
            int cnt=0, last=0;
            for(int i=1;i<=m;i++) {
                last += s[i]-s[i-1];
                if(last>=mid) {
                    last=0;
                    cnt++;
                }
            }
            if(cnt==q && last+l-s[m]>=mid || cnt>q) left=mid;
            else right=mid-1;
        }
        cout << left << '\n';
    }
}