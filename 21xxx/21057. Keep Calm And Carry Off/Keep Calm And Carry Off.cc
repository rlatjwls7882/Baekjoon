#include<bits/stdc++.h>
using namespace std;

string reverse(string s) {
    for(int i=0;i<s.length()/2;i++) {
        swap(s[i], s[s.length()-1-i]);
    }
    return s;
}

string getMinus(string s) { // 10^(s.length()) - s 수행
    string reversedRes = "";
    int carry=0;
    for(int i=s.length()-1;i>=0;i--) {
        int curDigit = 10-(s[i]-'0') - carry;
        if(curDigit<0) {
            curDigit += 10;
            carry=2;
        } else if(curDigit==10) {
            carry=0;
            curDigit=0;
        } else {
            carry=1;
        }
        reversedRes += (char)(curDigit+'0');
    }

    while(reversedRes[reversedRes.length()-1]=='0') reversedRes.pop_back();
    return reverse(reversedRes);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string a, b; cin >> a >> b;
    if(a.length()>b.length()) swap(a, b);

    int cnt9=0; // carry가 발생하기 바로 직전에 연속되는 9의 개수 (carry가 발생하면 이 수들도 추가적으로 carry가 발생)
    for(int i=0;i<a.length();i++) {
        if(a[i]-'0' + b[b.length()-a.length()+i]-'0' >= 10) {
            string case1 = getMinus(b.substr(b.length()-a.length()+i-cnt9, a.length()-i+cnt9)); // B에다 A를 더하는 경우 (B를 1씩 더해서 현재자리 이하를 전부 0으로 만듬)
            string case2 = getMinus(a.substr(i-cnt9, a.length()-i+cnt9)); // A에다 B를 더하는 경우 (A를 1씩 더해서 현재자리 이하를 전부 0으로 만듬)
            if(case1.length()<case2.length() || case1.length()==case2.length() && case1.compare(case2)<0) cout << case1;
            else cout << case2;
            return 0;
        }
        if(a[i]-'0' + b[b.length()-a.length()+i]-'0'==9) cnt9++;
        else cnt9=0;
    }
    cout << 0;
}