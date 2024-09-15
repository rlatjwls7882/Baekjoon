#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    int card[n];
    for(int i=0;i<n;i++) {
        cin >> card[i];
    }

    int cnt=1;
    for(int i=1;i<n;i++) {
        if(card[i-1]<card[i]) {
            cnt++;
        }
    }
    cout << cnt;
}