#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int cnt=0;
    while(N-->0) {
        int a, b, c; cin >> a >> b >> c;

        if(a==-1 && b==-1 && c==-1) {
            continue;
        }

        if((b==-1 && c==-1) || (c==-1 && a!=-1 && b!=-1 && a<=b) || (a!=-1 && b!=-1 && c!=-1 && a<=b && b<=c)) {
            cnt++;
        }
    }
    cout << cnt;
}
