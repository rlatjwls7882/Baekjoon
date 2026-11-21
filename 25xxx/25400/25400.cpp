#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    int cnt=0;
    for(int i=0;i<n;i++) {
        int tmp; cin >> tmp;
        if(tmp==cnt+1) {
            cnt++;
        }
    }
    cout << n-cnt;
}