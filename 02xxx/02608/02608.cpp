#include<bits/stdc++.h>
using namespace std;

unordered_map<char, int> m = {
    {'I', 1},
    {'V', 5},
    {'X', 10},
    {'L', 50},
    {'C', 100},
    {'D', 500},
    {'M', 1000},
};

int getNum(string s) {
    int ret=0;
    for(int i=0;i<s.length();i++) {
        if(i+1<s.length() && m[s[i]]<m[s[i+1]]) {
            ret += m[s[i+1]]-m[s[i]];
            i++;
        }
        else ret += m[s[i]];
    }
    return ret;
}

string getStr(int n) {
    string str="";
    while(n!=0) {
        if(n>=1000) {
            str += "M";
            n -= 1000;
        } else if(n>=900) {
            str += "CM";
            n -= 900;
        } else if(n>=500) {
            str += "D";
            n -= 500;
        } else if(n>=400) {
            str += "CD";
            n -= 400;
        } else if(n>=100) {
            str += "C";
            n -= 100;
        } else if(n>=90) {
            str += "XC";
            n -= 90;
        } else if(n>=50) {
            str += "L";
            n -= 50;
        } else if(n>=40) {
            str += "XL";
            n -= 40;
        } else if(n>=10) {
            str += "X";
            n -= 10;
        } else if(n>=9) {
            str += "IX";
            n -= 9;
        } else if(n>=5) {
            str += "V";
            n -= 5;
        } else if(n>=4) {
            str += "IV";
            n -= 4;
        } else {
            str += "I";
            n--;
        }
    }
    return str;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string a, b; cin >> a >> b;
    int n = getNum(a)+getNum(b);
    cout << n << '\n' << getStr(n);
}