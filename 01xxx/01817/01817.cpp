#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N, M; cin >> N >> M;

    int cnt=0, cur=M;
    while(N-->0) {
        int weight; cin >> weight;
        if(cur+weight>M) {
            cnt++;
            cur=weight;
        } else {
            cur += weight;
        }
    }
    cout << cnt;
}