#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int len=0, idx;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
        if(s[i][0]=='$') idx=i;
        else len += s[i].length();
    }

    string first[10] = {"", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred", "eighthundred", "ninehundred"};
    string second[10] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    string third[10] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for(int i=1;i<=999;i++) {
        string tmp = first[i/100];
        if(i/10%10==1) {
            if(i%100==10) tmp += "ten";
            else if(i%100==11) tmp += "eleven";
            else if(i%100==12) tmp += "twelve";
            else if(i%100==13) tmp += "thirteen";
            else if(i%100==14) tmp += "fourteen";
            else if(i%100==15) tmp += "fifteen";
            else if(i%100==16) tmp += "sixteen";
            else if(i%100==17) tmp += "seventeen";
            else if(i%100==18) tmp += "eightteen";
            else tmp += "nineteen";
        } else {
            tmp += second[i/10%10] + third[i%10];
        }

        if(len+tmp.length() == i) {
            for(int j=0;j<N;j++) {
                if(j!=idx) cout << s[j] << ' ';
                else cout << tmp << ' ';
            }
            return 0;
        }
    }
}