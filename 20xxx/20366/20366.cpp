#include<bits/stdc++.h>
using namespace std;

struct Sum {
    int sum, i, j;
    bool operator<(const Sum a) const {
        return this->sum < a.sum;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) cin >> arr[i];
    vector<Sum> v;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            v.push_back({arr[i]+arr[j], i, j});
        }
    }
    sort(v.begin(), v.end());

    int minSum=INT_MAX;
    for(int left=0;left<v.size();left++) {
        int right=left+1;
        while(right<v.size() && (v[left].i==v[right].i || v[left].i==v[right].j || v[left].j==v[right].i || v[left].j==v[right].j)) right++;
        if(right<v.size()) minSum = min(minSum, v[right].sum-v[left].sum);
    }
    cout << minSum;
}