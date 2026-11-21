#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int add[6] = {1, 1, 1, 1, 2, 1};
    long long cnt=1;
    for(int i=1;i<N;i+=6) {
        for(int j=0;j<6 && i+j<N;j++) {
            cnt += add[j]+i/6;
        }
    }
    cout << cnt;
}