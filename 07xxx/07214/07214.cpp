#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int k, s; cin >> k >> s;

    int color[s];
    for(int i=0;i<s;i++) {
        cin >> color[i];
    }

    int cnt=1;
    for(int i=0;i<s;i++) {
        cnt += min(color[i], k-1);
    }
    cout << cnt;
}