#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    map<int, int> row;
    map<int, int> col;
    int pos[N][2];
    for(int i=0;i<N;i++) {
        cin >> pos[i][0] >> pos[i][1];
        row[pos[i][0]]++;
        col[pos[i][1]]++;
    }

    long long cnt=0;
    for(int i=0;i<N;i++) {
        cnt += ((long long)row[pos[i][0]]-1)*(col[pos[i][1]]-1);
    }
    cout << cnt;
}