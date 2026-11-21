#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int card[13];
    for(int i=0;i<13;i++) card[i]=4;

    int John=0, Mary=0;
    int tmp;
    cin >> tmp; John += min(tmp, 10); card[tmp-1]--;
    cin >> tmp; John += min(tmp, 10); card[tmp-1]--;
    cin >> tmp; Mary += min(tmp, 10); card[tmp-1]--;
    cin >> tmp; Mary += min(tmp, 10); card[tmp-1]--;

    while(N-->0) {
        cin >> tmp;
        John += min(tmp, 10);
        Mary += min(tmp, 10);
        card[tmp-1]--;
    }

    for(int i=0;i<13;i++) {
        if(card[i] && (Mary+min(10, i+1)==23 || Mary+min(10, i+1)<23 && John+min(10, i+1)>23)) {
            cout << i+1;
            return 0;
        }
    }
    cout << -1;
}