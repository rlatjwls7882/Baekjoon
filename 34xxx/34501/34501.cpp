#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n; string s; cin >> n >> s;

        cout << s[0] << s[2];
        int cnt=2, idx=2;
        while(idx<n-1) {
            vector<bool> used(128);
            used[s[idx-2]]=used[s[idx-1]]=used[s[idx]]=true;
            if(idx+2<n && !used[s[idx+2]] && s[idx+1]!=s[idx+2]) {
                cout << s[idx+2];
                cnt++;
                idx+=2;
            } else if(idx+1<n && !used[s[idx+1]]) {
                cout << s[idx+1];
                cnt++;
                idx++;
            } else {
                int next=idx;
                while(next+1<n && used[s[next]]) next++;
                if(!used[s[next]]) {
                    cout << s[next];
                    cnt++;
                    idx=next;
                } else {
                    break;
                }
            }
        }
        vector<bool> used(128);
        used[s[idx-2]]=used[s[idx-1]]=used[s[idx]]=true;
        while(cnt++<n) {
            if(!used['r']) cout << 'r';
            else if(!used['g']) cout << 'g';
            else if(!used['b']) cout << 'b';
            else cout << 'y';
        }
        cout << '\n';
    }
}