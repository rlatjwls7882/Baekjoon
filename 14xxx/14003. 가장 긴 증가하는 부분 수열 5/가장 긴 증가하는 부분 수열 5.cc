#include<bits/stdc++.h>
using namespace std;

int visited[1000000], val[1000000];

struct e {
    int val, idx;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    vector<e> sequence;
    for(int i=0;i<N;i++) {
        cin >> val[i];
        if(sequence.empty() || sequence.back().val<val[i]) {
            if(i>0) visited[i] = sequence.back().idx;
            else visited[i] = -1;
            sequence.push_back({val[i], i});
        } else {
            int left=0, right=sequence.size()-1;
            while(left<right) {
                int mid = (left+right)/2;
                if(sequence[mid].val>=val[i]) right = mid;
                else left = mid+1;
            }
            if(sequence[left].val>val[i]) {
                sequence[left] = {val[i], i};
                if(left>0) visited[i] = sequence[left-1].idx;
                else visited[i] = -1;
            }
        }
    }
    cout << sequence.size() << '\n';
    stack<int> stk;
    for(int i=sequence.back().idx;i!=-1;i=visited[i]) {
        stk.push(val[i]);
    }
    while(!stk.empty()) {
        cout << stk.top() << ' '; stk.pop();
    }
}