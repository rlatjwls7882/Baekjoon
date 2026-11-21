#include<bits/stdc++.h>
using namespace std;

int a[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    int val; cin >> val;
    sort(a, a+n);

    int cnt=0, left=0, right=n-1;
    while(left<right) {
        if(a[left]+a[right]<val) {
            left++;
        } else if(a[left]+a[right]>val) {
            right--;
        } else {
            cnt++;
            left++;
            right--;
        }
    }
    cout << cnt;
}