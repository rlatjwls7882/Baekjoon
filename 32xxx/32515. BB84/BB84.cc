#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string s1, s2, s3, s4; cin >> N >> s1 >> s2 >> s3 >> s4;
    string res;
    for(int i=0;i<N;i++) {
        if(s1[i] == s3[i]) {
            if(s2[i] != s4[i]) {
                cout << "htg!";
                return 0;
            }
            res += s2[i];
        }
    }
    cout << res;
}