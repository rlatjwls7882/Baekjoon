#include<bits/stdc++.h>
using namespace std;

int arr[30][30];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int m, n, k, w; cin >> m >> n >> k >> w;
    for(int i=0;i<m;i++) for(int j=0;j<n;j++) cin >> arr[i][j];

    for(int i=0;i+w-1<m;i++) {
        for(int j=0;j+w-1<n;j++) {
            vector<int> nums;
            for(int k=0;k<w;k++) for(int l=0;l<w;l++) nums.push_back(arr[i+k][j+l]);
            sort(nums.begin(), nums.end());
            cout << nums[nums.size()/2] << ' ';
        }
        cout << '\n';
    }
}