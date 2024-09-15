#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<int> max;
    for(int diff=1;diff<=N;diff++) {
        vector<int> cur;
        int val1=N; cur.push_back(val1);
        int val2=diff; cur.push_back(val2);

        while(true) {
            int next = val1-val2;
            if(next<0) break;
            cur.push_back(next);
            val1=val2;
            val2=next;
        }

        if(cur.size()>max.size()) {
            max=cur;
        }
    }

    cout << max.size() << '\n';
    for(int val:max) {
        cout << val << " ";
    }
}