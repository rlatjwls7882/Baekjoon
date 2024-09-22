#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    bool notIncreasing=false;
    long long cnt[26] = {0, };
    long long total=0, fillCnt=0, idx=0;
    while(idx<s.length()) {
        if(!notIncreasing) {
            if(++cnt[s[idx]-'A']==1) fillCnt++;
            if(idx>0 && s[idx-1]>s[idx]) notIncreasing=true;
            idx++;
        }
        if((idx==s.length() || notIncreasing)) {
            if(fillCnt==26) {
                if(s[idx-1]=='A') total += (cnt[0]-1)*cnt[25];
                else total += cnt[0]*cnt[25];
            }
            fill(cnt, cnt+26, 0);
            fillCnt=1;
            notIncreasing=false;
            cnt[s[idx-1]-'A']++;
        }
    }
    cout << total;
}