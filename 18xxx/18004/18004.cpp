#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> a >> b;

    int cnt=0;
    while(a>b) {
        if(a%2==0) a/=2;
        else a++;
        cnt++;
    }
    cout << b-a+cnt;
}