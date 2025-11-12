#include<bits/stdc++.h>
using namespace std;

int blockMerge(int n) {
    int ret=1;
    while(ret<=n) ret*=2;
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<int> cnt;
    int last2=0, last1=0;
    while(n--) {
        int cur; cin >> cur;
        if(cur==1) last1++;
        else last2++;
        if(cur==2) {
            last2+=last1/2;
            if(last1%2) {
                cnt.push_back(last2);
                cnt.push_back(0);
                last2 = last1/2;
            }
            last1=0;
        }
    }
    cnt.push_back(last2+last1/2);
    cnt.push_back(0);

    int res=1;
    for(int i=0;i<cnt.size()-1;i++) res = max(res, blockMerge(cnt[i]+cnt[i+1]));
    cout << res;
}