#include<bits/stdc++.h>
using namespace std;

int s[100], cur[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N,D,K; cin >> N >> D >> K;
    
    for(int i=0;i<N;i++) cin >> s[i];
    
    int clearCnt=0;
    while(D--) {
        for(int i=0;i<N;i++) {
            cur[i] += s[i];
            if(cur[i]>K) {
                for(int i=0;i<N;i++) cur[i] = s[i];
                clearCnt++;
                break;
            }
        }
    }
    cout << clearCnt;
}