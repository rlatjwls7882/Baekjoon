#include<bits/stdc++.h>
using namespace std;

string reverse(string s) {
    string tmp = "";
    for(int i=s.length()-1;i>=0;i--) {
        if(s[i]=='6') {
            tmp += "9";
        } else if(s[i]=='9') {
            tmp += "6";
        } else {
            tmp += s[i];
        }
    }
    return tmp;
}

bool isPrime(string s) {
    for(int i=0;i<s.length();i++) {
        if(s[i]=='3' || s[i]=='4' || s[i]=='7') return false;
    }

    long long n = stoll(s);
    if(n==1) return false;

    for(long long i=2;i*i<=n;i++) {
        if(n%i==0) {
            return false;
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    if(isPrime(s) && isPrime(reverse(s))) cout << "yes";
    else cout << "no";
}