#include<bits/stdc++.h>
using namespace std;

bool isPalindrome(string s) {
    for(int i=0;i<s.length()/2;i++) {
        if(s[i]!=s[s.length()-1-i]) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b; cin >> a >> b;

    vector<bool> notSosu(b+1);
    for(int i=2;i*i<=b;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<=b;j+=i) {
                notSosu[j]=true;
            }
        }
    }

    for(int i=a;i<=b;i++) {
        if(!notSosu[i] && isPalindrome(to_string(i))) {
            cout << i << '\n';
        }
    }
    cout << -1;
}