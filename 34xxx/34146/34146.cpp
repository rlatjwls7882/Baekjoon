#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    map<int, int> nums;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            int num; cin >> num;
            nums[num]++;
        }
    }

    int cnt=0;
    for(auto e : nums) {
        if(e.second%2) {
            if(m%2==0 || ++cnt>n) {
                cout << "NO";
                return 0;
            }
        }
    }
    cout << "YES";
}