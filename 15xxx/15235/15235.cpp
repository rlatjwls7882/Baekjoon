#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int end[1000] = {0, };

    vector<int> input(1000);
    for(int i=0;i<n;i++) cin >> input[i];
    int t=1;
    while(true) {
        bool isEnd=true;
        for(int i=0;i<n;i++) {
            if(input[i]==0) continue;
            if(--input[i]==0) end[i]=t;
            t++;
            isEnd=false;
        }
        if(isEnd) break;
    }
    for(int i=0;i<n;i++) cout << end[i] << ' ';
} 