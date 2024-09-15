#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    int _min=s.length()/2*2;
    for(int i=0;i<s.length();i++) {

        // 홀수개의 문자
        int left=i, right=i;
        while(left>=0 && right<s.length()) {
            if(s[left]!=s[right]) {
                break;
            }
            if(right==s.length()-1) {
                _min = min(_min, left + (int)s.length()-1-right);
            }
            left--;
            right++;
        }

        // 짝수개의 문자
        if(i+1<s.length() && s[i]==s[i+1]) {
            left=i; right=i+1;
            while(left>=0 && right<s.length()) {
                if(s[left]!=s[right]) {
                    break;
                }
                if(right==s.length()-1) {
                    _min = min(_min, left + (int)s.length()-1-right);
                }
                left--;
                right++;
            }
        }
    }
    cout << s.length()+_min;
}