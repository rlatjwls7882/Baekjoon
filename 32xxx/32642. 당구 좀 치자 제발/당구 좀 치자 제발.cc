#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    long long cur=0, sum=0;
    while(n-->0) {
        int weather; cin >> weather;
        if(weather) cur++;
        else cur--;
        sum += cur;
    }
    cout << sum;
}