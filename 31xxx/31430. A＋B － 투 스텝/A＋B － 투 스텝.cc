#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    if(T==1) {
        long long A, B; cin >> A >> B;
        long long sum = A+B;
        string s = "aaaaaaaaaaaaa";
        for(int i=0;i<13 && sum;i++) {
            s[12-i] += sum%26;
            sum/=26;
        }
        cout << s;
    } else {
        string s; cin >> s;
        long long sum=0;
        for(int i=0;i<13;i++) {
            sum*=26;
            sum += s[i]-'a';
        }
        cout << sum;
    }
}