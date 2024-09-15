#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; char B; cin >> N >> B;
    string S; cin >> S;

    int chars[127] = {0, };
    for(char ch:S) {
        chars[ch]++;
    }
    bool contain=false;
    if(chars[B]) contain=true;

    vector<char> v;
    bool first=true;
    for(char i='A';i<='Z';i++) {
        if(B!=i || first) {
            if(i==B && !v.empty() && chars[B+32] && contain) {
                v.push_back(B+32);
                chars[B+32]--;
            }
            while(chars[i]-->0) {
                first=false;
                v.push_back(i);
            }
            if(i==B && chars[B+32] && contain) {
                v.push_back(B+32);
                chars[B+32]--;
            }
        }
    }
    for(char i='a';i<='z';i++) {
        if(i==B+32 && (v.size()+chars[i]==N || chars[i]>=2)) {
            if(chars[i]-->0) v.push_back(i);
            while(chars[B]-->0) {
                v.push_back(B);
            }
            while(chars[i]-->0) {
                v.push_back(i);
            }
        } else if(i!=B+32) {
            while(chars[i]-->0) {
                v.push_back(i);
            }
        }
    }
    if(chars[B+32]-->0 && contain) v.push_back(B+32);
    while(chars[B]-->0) {
        v.push_back(B);
    }
    while(chars[B+32]-->0) v.push_back(B+32);

    for(char ch:v) {
        cout << ch;
    }
}