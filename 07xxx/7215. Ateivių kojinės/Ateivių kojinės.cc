#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int k, s; cin >> k >> s;

    bool chk=false;
    int color[s];
    for(int i=0;i<s;i++) {
        cin >> color[i];
        if(color[i]>=k) {
            chk=true;
        }
    }

    int cnt=-1;
    if(chk) {
        cnt=1;
        for(int i=0;i<s;i++) {
            cnt += min(k-1, color[i]);
        }
    }
    cout << cnt;
}