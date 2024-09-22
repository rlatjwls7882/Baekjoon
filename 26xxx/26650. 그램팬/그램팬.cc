#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    long long cnt[26] = {0, };
    long long total=0, fillCnt=0;
    for(int i=0;i<s.length();i++) {
        if(++cnt[s[i]-'A']==1) fillCnt++;
        if(i>0 && s[i-1]>s[i] || i==s.length()-1) {
            if(fillCnt==26) {
                if(s[i]=='A') cnt[0]--;
                total += cnt[0]*cnt[25];
            }
            fill(cnt, cnt+26, 0);
            fillCnt=1;
            cnt[s[i]-'A']=1;
        }
    }
    cout << total;
}