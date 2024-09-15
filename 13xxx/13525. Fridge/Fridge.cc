#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string s; cin >> s;

    int chars[10] = {0, };
    for(int i=0;i<s.length();i++) {
        chars[s[i]-'0']++;
    }

    int num=-1, cnt=INT_MAX;
    int num2=-1, cnt2=INT_MAX;
    for(int i=0;i<10;i++) {
        if(cnt>chars[i]) {
            cnt2=cnt;
            num2=num;
            cnt=chars[i];
            num=i;
        } else if(cnt2>chars[i]) {
            cnt2=chars[i];
            num2=i;
        }
    }

    if(cnt==cnt2 && num==0) {
        for(int i=0;i<cnt2+1;i++) {
            cout << num2;
        }
    } else if(num==0) {
        cout << num2;
        for(int i=0;i<cnt+1;i++) {
            cout << 0;
        }
    } else {
        for(int i=0;i<cnt+1;i++) {
            cout << num;
        }
    }
}