#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int t[MAX], like[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, a, b; cin >> n >> m >> a >> b;
    for(int i=0;i<n;i++) cin >> t[i];
    while(a--) {
        int l; cin >> l;
        like[l]=1;
    }
    while(b--) {
        int h; cin >> h;
        like[h]=-1;
    }

    int sum=0, last=0;
    for(int i=0;i<n;i++) {
        if(last==0 || last*like[t[i]]>0) {
            last += like[t[i]];
        } else {
            if(abs(last)>=3) sum += last;
            last = like[t[i]];
        }
    }
    if(abs(last)>=3) sum += last;
    cout << sum;
}