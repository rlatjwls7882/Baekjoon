#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s1[14] = { "h", "b", "c", "n", "o", "f", "p", "s", "k", "v", "y", "i", "w", "u" };
    string s2[100] = { "ba", "ca" , "ga", "la", "na", "pa", "ra", "ta", "db", "nb", "pb", "rb", "sb", "tb", "yb", "ac", "sc", "tc", "cd", "gd", "md", "nd", "pd", "be", "ce", "fe", "ge", "he", "ne", "re", "se", "te", "xe", "cf", "hf", "rf", "ag", "hg", "mg", "rg", "sg", "bh", "rh", "th", "bi", "li", "ni", "si", "ti", "bk", "al", "cl", "fl", "tl", "am", "cm", "fm", "pm", "sm", "tm", "cn", "in", "mn", "rn", "sn", "zn", "co", "ho", "mo", "no", "po", "np", "ar", "br", "cr", "er", "fr", "ir", "kr", "lr", "pr", "sr", "zr", "as", "cs", "ds", "es", "hs", "os", "at", "mt", "pt", "au", "cu", "eu", "lu", "pu", "ru", "lv", "dy" };

    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;
        bool chk[s.length()] = {false, };
        for(int i=0;i<s.length();i++) {
            if(i-1<0 || chk[i-1]) {
                for(int j=0;j<14;j++) {
                    if(s[i] == s1[j][0]) {
                        chk[i]=true;
                        break;
                    }
                }
            }
            if(i>0 && i-2<0 || chk[i-2]) {
                for(int j=0;j<100;j++) {
                    if(s[i-1] == s2[j][0] && s[i] == s2[j][1]) {
                        chk[i]=true;
                        break;
                    }
                }
            }
        }
        if(chk[s.length()-1]) cout << "YES\n";
        else cout << "NO\n";
    }
}