#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<string> v(n);
    for(int i=0;i<n;i++) cin >> v[i];

    for(int i=0;i<n;i++) {
        if(i+1<n && v[i].length()==v[i+1].length()) {
            for(int j=0;j<v[i].length();j++) {
                char tmp = v[i][j];
                v[i][j]='9';
                if(stoll(v[i])>stoll(v[i+1])) {
                    for(int k=0;k<n;k++) cout << v[k] << ' ';
                    return 0;
                }
                v[i][j]=tmp;
            }
        }
        if(i-1>=0 && v[i].length()==v[i-1].length()) {
            for(int j=0;j<v[i].length();j++) {
                char tmp = v[i][j];
                if(v[i].length()==1) v[i][j]='0';
                else v[i][j]='1';
                if(stoll(v[i-1])>stoll(v[i])) {
                    for(int k=0;k<n;k++) cout << v[k] << ' ';
                    return 0;
                }
                v[i][j]=tmp;
            }
        }
    }
    cout << "impossible";
}