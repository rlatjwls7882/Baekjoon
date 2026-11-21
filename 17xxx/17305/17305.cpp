#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000;
long long preSum[MAX+1]; // 무게가 3인 사탕들의 누적합

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, w; cin >> n >> w;

    vector<int> weight3, weight5;
    while(n--) {
        int t, s; cin >> t >> s;
        if(t==3) weight3.push_back(s);
        else weight5.push_back(s);
    }
    sort(weight3.begin(), weight3.end(), greater<int>());
    sort(weight5.begin(), weight5.end(), greater<int>());

    for(int i=0;i<weight3.size();i++) preSum[i+1] = preSum[i] + weight3[i];
    for(int i=weight3.size()+1;i<=MAX;i++) preSum[i] = preSum[i-1];

    long long maxS = preSum[w/3], total=0;
    for(int i=0;i<weight5.size() && (i+1)*5<=w;i++) {
        total += weight5[i];
        maxS = max(maxS, total + preSum[max((w-(i+1)*5)/3, 0)]); // 일부분 무게 5인 사탕, 나머지부분 무게 3인 사탕
    }
    cout << maxS;
}