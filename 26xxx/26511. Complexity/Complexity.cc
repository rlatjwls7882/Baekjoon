#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int t; cin >> t;

    while(t-->0) {
        string S; cin >> S;
        
        int chars[26] = {0, };
        int complexity=0;
        for(int i=0;i<S.length();i++) {
            if(++chars[S[i]-'a']==1) {
                complexity++;
            }
        }
        sort(chars, chars+26);

        int cnt=0, idx=0;
        while(complexity>2) {
            if(chars[idx]!=0) {
                cnt+=chars[idx];
                complexity--;
            }
            idx++;
        }
        cout << cnt << endl;
    }
}