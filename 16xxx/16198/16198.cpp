#include<bits/stdc++.h>
using namespace std;

int maxSum;

void back(vector<int> v, int sum) {
    if(v.size()==2) {
        maxSum = max(maxSum, sum);
        return;
    }

    for(int i=1;i<v.size()-1;i++) {
        vector<int> next(v);
        next.erase(next.begin()+i);
        back(next, sum+v[i-1]*v[i+1]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    vector<int> v(N);
    for(int i=0;i<N;i++) cin >> v[i];
    back(v, 0);
    cout << maxSum;
}