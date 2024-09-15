#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            int length = min(s[i].size(), s[j].size());
            for(int k=1;k<=length;k++) {
                if(s[i].substr(0, k).compare(s[j].substr(s[j].size()-k, k))==0 || s[j].substr(0, k).compare(s[i].substr(s[i].size()-k, k))==0) {
                    cnt++;
                    break;
                }
            }
        }
    }
    cout << cnt;
}