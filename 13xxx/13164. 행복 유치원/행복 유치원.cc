#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;

    vector<int> diff;
    int last=0;
    while(N-->0) {
        int cur; cin >> cur;
        if(last) diff.push_back(cur-last);
        last=cur;
    }
    sort(diff.begin(), diff.end(), greater<int>());

    int sum=0;
    for(int i=K-1;i<diff.size();i++) {
        sum += diff[i];
    }
    cout << sum;
}