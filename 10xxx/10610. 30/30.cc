#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string N; cin >> N;

    int chars[10] = {0};
    int sum=0;
    for(int i=0;i<N.length();i++) {
        sum += N[i]-'0';
        chars[N[i]-'0']++;
    }

    if(sum%3==0&&chars[0]>0) {
        for(int i=9;i>=0;i--) {
            while(chars[i]-->0) {
                cout << i;
            }
        }
    } else {
        cout << -1;
    }
}