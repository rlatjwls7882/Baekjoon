#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    string s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }
    
    int cnt=0;
    for(int i=0;i<m;i++) {
        int chars[26] = {0, };
        for(int j=0;j<n;j++) {
            chars[s[j][i]-'A']++;
        }
        
        int max = 0; char ch='A';
        for(int j=0;j<26;j++) {
            if(max<chars[j]) {
                max=chars[j];
                ch=j+'A';
            }
        }
        cout << ch;
        cnt += n-max;
    }
    cout << '\n' << cnt;
}