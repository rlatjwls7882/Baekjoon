#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<int> nums;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            int num; cin >> num;
            nums.push_back(num);
        }
    }
    sort(nums.begin(), nums.end());

    long long sum=0;
    for(int i=1;i<nums.size();i++) sum += nums[i];
    cout << sum;
}