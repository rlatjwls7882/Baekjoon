#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, S; cin >> N >> S;
    int L[N];
    for(int i=0;i<N;i++) {
        cin >> L[i];
    }
    
    int cnt=0;
    for(int i=0;i<N-1;i++) {
        for(int j=i+1;j<N;j++) {
            if(L[i]+L[j]<=S) {
                cnt++;
            }
        }
    }
    cout << cnt;
}