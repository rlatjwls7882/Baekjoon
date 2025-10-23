#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll cnt[26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; int n; cin >> s >> n;
    while(n--) {
        string handle; cin >> handle;
        cnt[handle[0]-'A']++;
    }

    ll res=1;
    for(int i=0;i<3;i++) res *= cnt[s[i]-'A']--;
    if(s[0]==s[1] && s[1]==s[2]) res/=6;
    else if(s[0]==s[1] || s[0]==s[2] || s[1]==s[2]) res/=2;
    cout << res;
}