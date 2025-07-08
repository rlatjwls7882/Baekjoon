#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;

    while(t--) {
        int n, k; cin >> n >> k;

        set<int> nums;
        for(int i=1;i<=n;i++) nums.insert(i);
        for(int i=0;i<k;i++) {
            int num; cin >> num;
            nums.erase(num);
        }
        if(n%2==0) { // n이 짝수일 때 1이 있으면 1을 제거하고, 1이 없으면 1을 추가한다. => 짝수 - 홀수 변환
            if(nums.count(1)) nums.erase(1);
            else nums.insert(1);
        }

        cout << n << ' ' << nums.size() << '\n';
        for(int e : nums) cout << e << ' ';
        cout << '\n';
    }
}