#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    for(int i=1;i<=T;i++) {
        int N; cin >> N;
        vector<int> prev;
        for(int j=0;j<N;j++) {
            int tmp; cin >> tmp;
            prev.push_back(tmp);
        }

        while(prev.size()!=2) {
            vector<int> next;
            for(int j=0;j<(N+1)/2;j++) {
                next.push_back(prev[j]+prev[N-1-j]);
            }
            prev=next;
            N = (N+1)/2;
        }

        cout << "Case #" << i << ": ";
        if(prev[0]>prev[1]) cout << "Alice\n";
        else cout << "Bob\n";
    }
}