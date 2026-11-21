#include<bits/stdc++.h>
using namespace std;

int cnt[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string a, b; cin >> n >> a >> b;

    if(a[0]!=b[0] || a[n-1]!=b[n-1]) {
        cout << "NO";
        return 0;
    }

    for(char ch:a) cnt[ch]++;
    for(char ch:b) cnt[ch]--;
    for(int i=0;i<128;i++) {
        if(cnt[i]!=0) {
            cout << "NO";
            return 0;
        }
    }

    int left=0, right=0;
    while(left<n || right<n) {
        while(left<n && (a[left]=='a' || a[left]=='e' || a[left]=='i' || a[left]=='o' || a[left]=='u')) left++;
        while(right<n && (b[right]=='a' || b[right]=='e' || b[right]=='i' || b[right]=='o' || b[right]=='u')) right++;
        if(!(left==n && right==n) && (left==n || right==n || a[left]!=b[right])) {
            cout << "NO";
            return 0;
        }
        left++;
        right++;
    }
    cout << "YES";
}