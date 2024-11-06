#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string s; cin >> s;

    long long total=0, curLen=0;
    for(int i=0;i<N;i++) {
        if(s[i]=='1') curLen++;
        else {
            total += curLen*(curLen+1)/2;
            curLen=0;
        }
    }
    total += curLen*(curLen+1)/2;
    cout << total;
}