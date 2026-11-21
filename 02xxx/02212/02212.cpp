#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    vector<int> sensor(N);
    for(int i=0;i<N;i++) cin >> sensor[i];
    sort(sensor.begin(), sensor.end());

    vector<int> diff;
    for(int i=0;i<N-1;i++) {
        diff.push_back(sensor[i+1]-sensor[i]);
    }
    sort(diff.begin(), diff.end(), greater<int>());

    int sum=0;
    for(int i=K-1;i<diff.size();i++) {
        sum += diff[i];
    }
    cout << sum;
}