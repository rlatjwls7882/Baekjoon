#include<bits/stdc++.h>
using namespace std;

int main(void) {
    int t; cin >> t;
    while(t-->0) {
        string s; cin >> s;

        int idx=0;
        char condition[4] = {'A', 'F', 'C', 'C'};
        for(int i=0;i<s.length();i++) {
            if(condition[idx]==s[i]) {
                if(idx!=3) {
                    idx++;
                }
            } else if(!(idx>=0&&i>0&&condition[idx-1]==s[i]&&s[i]==s[i-1])) {
                idx=0;
            }
        }

        if(idx==3) cout << "Infected!\n";
        else cout << "Good\n";
    }
}