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

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int _size = 1003002;
    bool notPrime[_size] = {true, true, false, };
    for(int i=2;i*i<_size;i++) {
        if(!notPrime[i]) {
            for(int j=i*i;j<_size;j+=i) {
                notPrime[j]=true;
            }
        }
    }

    int N; cin >> N;
    for(int i=N;;i++) {
        if(!notPrime[i] && isPalindrome(to_string(i))) {
            cout << i;
            return 0;
        }
    }
}