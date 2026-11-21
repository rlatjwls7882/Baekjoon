#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    string vowel = "aiyeou";
    string consonant = "bkxznhdcwgpvjqtsrlmf";

    while(!cin.eof()) {
        string s; getline(cin, s);
        for(int i=0;i<s.length();i++) {
            if('a'<=s[i] && s[i]<='z') {
                if(s[i]=='a' || s[i]=='i' || s[i]=='y' || s[i]=='e' || s[i]=='o' || s[i]=='u') {
                    cout << vowel[(vowel.find(s[i])+3)%6];
                } else {
                    cout << consonant[(consonant.find(s[i])+10)%20];
                }
            } else if('A'<=s[i] && s[i]<='Z') {
                if(s[i]=='A' || s[i]=='I' || s[i]=='Y' || s[i]=='E' || s[i]=='O' || s[i]=='U') {
                    cout << char(vowel[(vowel.find((char)(s[i]+32))+3)%6]-32);
                } else {
                    cout << char(consonant[(consonant.find((char)(s[i]+32))+10)%20]-32);
                }
            } else {
                cout << s[i];
            }
        }
        cout << endl;
    }
}