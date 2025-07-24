#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;

    for(int len=min(a.length(), b.length());len>0;len--) {
        set<vector<int>> subStrA;

        vector<int> cnt(26);
        for(int i=0;i<len;i++) cnt[a[i]-'a']++;
        subStrA.insert(cnt);

        int left=0, right=len;
        while(right<a.length()) {
            cnt[a[right++]-'a']++;
            cnt[a[left++]-'a']--;
            subStrA.insert(cnt);
        }

        cnt.assign(26, 0);
        for(int i=0;i<len;i++) cnt[b[i]-'a']++;
        if(subStrA.count(cnt)) {
            cout << len;
            return 0;
        }

        left=0, right=len;
        while(right<b.length()) {
            cnt[b[right++]-'a']++;
            cnt[b[left++]-'a']--;
            if(subStrA.count(cnt)) {
                cout << len;
                return 0;
            }
        }
    }
    cout << 0;
}