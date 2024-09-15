#include<bits/stdc++.h>
using namespace std;

int arr[5000000][26];

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    memset(arr, 0, sizeof(arr));

    int cnt=1;
    while(N-->0) {
        string s; cin >> s;
        int now=0;
        for(int i=0;i<s.length();i++) {
            if(arr[now][s[i]-'a']==0) arr[now][s[i]-'a']=cnt++;
            now = arr[now][s[i]-'a'];
        }
    }

    cnt=0;
    while(M-->0) {
        string s; cin >> s;
        int now=0;
        for(int i=0;i<s.length();i++) {
            if(arr[now][s[i]-'a']==0) {
                now=0;
                break;
            }
            now = arr[now][s[i]-'a'];
        }
        if(now) cnt++;
    }
    cout << cnt;
}