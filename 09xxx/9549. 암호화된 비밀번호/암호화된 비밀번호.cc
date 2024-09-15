#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        string end, start; cin >> end >> start;
        int startCnt[26] = {0, };
        for(int i=0;i<start.length();i++) {
            startCnt[start[i]-'a']++;
        }

        int s=0, e=0;
        bool chk=false;
        while(e<end.length()) {
            while(e-s<start.length()) {
                startCnt[end[e++]-'a']--;
            }

            bool isSame=true;
            for(int i=0;i<26;i++) {
                if(startCnt[i]!=0) {
                    isSame=false;
                    break;
                }
            }
            if(isSame) {
                chk=true;
                break;
            }
            startCnt[end[s++]-'a']++;
        }
        if(chk) cout << "YES\n";
        else cout << "NO\n";
    }
}