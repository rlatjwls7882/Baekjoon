#include<bits/stdc++.h>
using namespace std;

int add[4] = {1, 5, 10, 50};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    bool cur[1001] = {true, false};
    while(N-->0) {
        bool next[1001] = {false, };
        for(int i=0;i<1000;i++) {
            if(cur[i]) {
                for(int j=0;j<4;j++) {
                    if(i+add[j]<=1000) {
                        next[i+add[j]]=true;
                    }
                }
            }
        }
        memcpy(&cur, &next, sizeof(cur));
    }

    int cnt=0;
    for(int i=1;i<=1000;i++) {
        if(cur[i]) {
            cnt++;
        }
    }
    cout << cnt;
}