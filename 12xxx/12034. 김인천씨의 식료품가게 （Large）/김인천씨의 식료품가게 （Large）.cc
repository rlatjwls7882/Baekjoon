#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int T; cin >> T;
    
    for(int i=1;i<=T;i++) {
        int N; cin >> N;
        vector<int> check;
        for(int i=0;i<2*N;i++) {
            int P; cin >> P;
            check.push_back(P);
        }

        cout << "Case #" << i << ": ";
        while(!check.empty()) {
            int cur = check.front(); check.erase(check.begin());
            int next = cur/3*4;
            cout << cur << " ";
            check.erase(find(check.begin(), check.end(), next));
        }
        cout << endl;
    }
}