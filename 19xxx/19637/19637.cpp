#include <bits/stdc++.h>
using namespace std;


int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string name[N+1];
    int power[N+1] = {0, };

    for(int i=0;i<N;i++) {
        cin >> name[i] >> power[i];
    }

    while(M-->0) {
        int val; cin >> val;
        int s=0, e=N;
        while(s+1<e) {
            int mid = (s+e)/2;
            if(power[mid]<val) {
                s=mid;
            } else {
                e=mid;
            }
        }
        if(power[s]>=val) {
            cout << name[s] << '\n';
        } else {
            cout << name[e] << '\n';
        }
    }
}