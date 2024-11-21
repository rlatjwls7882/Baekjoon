#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; string s; cin >> N >> K >> s;

    vector<char> arr[3];
    for(int i=0;i<N;i++) {
        if(s[i]=='s') {
            if(arr[0].size()<K) arr[0].push_back(s[i]);
            else if(arr[1].size()<K) arr[1].push_back(s[i]);
            else arr[2].push_back(s[i]);
        } else if(s[i]=='r') {
            if(arr[1].size()<K) arr[1].push_back(s[i]);
            else if(arr[2].size()<K) arr[2].push_back(s[i]);
            else arr[0].push_back(s[i]);
        } else {
            if(arr[2].size()<K) arr[2].push_back(s[i]);
            else if(arr[0].size()<K) arr[0].push_back(s[i]);
            else arr[1].push_back(s[i]);
        }
    }

    for(int i=0;i<3;i++) {
        for(char e:arr[i]) cout << e;
        cout << '\n';
    }
}