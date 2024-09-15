#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    bool visited[N+1] = {false, };

    while(Q-->0) {
        int X; cin >> X;
        int lastMeet=-1;
        int tmp=X;
        while(tmp!=1) {
            if(visited[tmp]) {
                lastMeet=tmp;
            }
            tmp/=2;
        }

        if(lastMeet==-1) {
            cout << "0\n";
            visited[X]=true;
        } else {
            cout << lastMeet << '\n';
        }
    }
}