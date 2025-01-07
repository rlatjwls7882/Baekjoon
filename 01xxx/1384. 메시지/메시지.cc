#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int groupNum=1;;groupNum++) {
        int N; cin >> N;
        if(!N) break;

        vector<vector<string>> s(N, vector<string>(N));
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                cin >> s[i][j];
            }
        }

        int cnt=0;
        cout << "Group " << groupNum << '\n';
        for(int i=0;i<N;i++) {
            for(int j=1;j<N;j++) {
                if(s[i][j][0]=='N') {
                    cout << s[(i-j+N)%N][0] << " was nasty about " << s[i][0] << '\n';
                    cnt++;
                }
            }
        }
        if(!cnt) cout << "Nobody was nasty\n";
        cout << '\n';
    }
}