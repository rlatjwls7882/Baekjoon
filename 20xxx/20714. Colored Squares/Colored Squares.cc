#include<bits/stdc++.h>
using namespace std;

int s[200'000], cnt[100'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, c, k; cin >> n >> c >> k;
    for(int i=0;i<n;i++) cin >> s[i];

    int maxLen=0;
    int left=0, right=0;
    while(left<n || right<n) {
        while(right<n && (right-left-cnt[s[left]]<k || right-left-cnt[s[left]]==k && s[left]==s[right])) {
            cnt[s[right++]]++;
            maxLen = max(maxLen, cnt[s[left]]);
        }
        cnt[s[left++]]--;
        if(right-left-cnt[s[left]]<=k) maxLen = max(maxLen, cnt[s[left]]);
    }
    cout << maxLen;
}