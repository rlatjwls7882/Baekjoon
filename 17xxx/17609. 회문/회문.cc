#include<bits/stdc++.h>
using namespace std;

string s;

int isPalindrome(int left, int right, bool jumped) {
    while(left<right) {
        if(s[left]==s[right]) {
            left++;
            right--;
        } else if(left+1<s.length() && s[left+1]==s[right] && !jumped && !isPalindrome(left+1, right, true) || right-1>=0 && s[left]==s[right-1] && !jumped && !isPalindrome(left, right-1, true)) {
            return 1;
        } else {
            return 2;
        }
    }
    return 0;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        cin >> s;
        cout << isPalindrome(0, s.length()-1, false) << '\n';
    }
}