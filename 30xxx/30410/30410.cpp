#include<bits/stdc++.h>
using namespace std;

int blockMerge(int n) {
    int ret=1;
    while(ret<=n) ret<<=1;
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int res=0, last1=0, last2=0;
    while(n--) {
        int cur; cin >> cur;
        if(cur==1) last1++;
        else {
            last2++;
            if(last1%2) last2 = last1/2;
            else last2 += last1/2;
            last1=0;
        }
        res = max(res, last2+last1/2);
    }
    cout << blockMerge(res);
}