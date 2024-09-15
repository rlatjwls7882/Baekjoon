#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int T; cin >> T;
    
    for(int i=1;i<=T;i++) {
        int N; cin >> N;
        priority_queue<int, vector<int>, greater<int>> pq;
        for(int i=0;i<2*N;i++) {
            int P; cin >> P;
            pq.push(P);
        }

        cout << "Case #" << i << ": ";
        vector<int> check;
        while(N>0) {
            int cur = pq.top(); pq.pop();
            if(find(check.begin(), check.end(), cur)==check.end()) {
                int next = cur/3*4;
                check.push_back(next);
                N--;
                cout << cur << " ";
            } else {
                check.erase(find(check.begin(), check.end(), cur));
            }
        }
        cout << endl;
    }
}