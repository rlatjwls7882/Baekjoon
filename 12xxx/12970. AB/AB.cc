#include<bits/stdc++.h>
using namespace std;

char ch[50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    fill(ch, ch+n, 'B');

    int a=0;
    for(int i=0;i<n;i++) {
        int cur = n-1-i - a;
        if(cur>0 && k>=cur) {
            k -= cur;
            a++;
            ch[i]='A';
        }
    }
    if(k!=0) {
        cout << -1;
        return 0;
    }
    for(int i=0;i<n;i++) cout << ch[i];
}