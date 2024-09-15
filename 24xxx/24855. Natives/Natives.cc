#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int a[N];
    for(int i=0;i<N;i++) {
        cin >> a[i];
    }
    sort(a, a+N, greater<int>());

    int treasure_max=0;
    for(int i=0;i<N/2;i++) {
        treasure_max += a[i];
    }
    cout << treasure_max;
}