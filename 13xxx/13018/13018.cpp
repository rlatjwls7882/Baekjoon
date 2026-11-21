#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    if(n==k) {
        cout << "Impossible";
    } else {
        int cnt = n-1-k, outputCnt=1;
        if(cnt%2==1) cout << n << ' '; // 홀수번 바뀌어야 하는 경우 (1과 스왑해야함)
        else cout << "1 ";

        for(int i=2;i<n;i+=2) {
            if(cnt>=2) { // 스왑
                cout << i+1 << ' ' << i << ' ';
                cnt-=2;
                outputCnt+=2;
            } else {
                if(i+1==n) {
                    cout << i << ' ';
                    outputCnt++;
                } else {
                    cout << i << ' ' << i+1 << ' ';
                    outputCnt+=2;
                }
            }
        }

        if(outputCnt!=n) {
            if(cnt%2==1) cout << 1;
            else cout << n;
        }
    }
}