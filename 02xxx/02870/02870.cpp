#include<bits/stdc++.h>

using namespace std;

vector<string> v;

string deleteLeadingZero(string s) {
    for(int i=0;i<s.length();i++) {
        if(s[i]!='0') {
            return s.substr(i, s.length());
        }
    }
    return "0";
}

bool comp(string a, string b) {
    if(a.length()!=b.length()) return a.length()<b.length(); 
    return a.compare(b)<0;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    while(N-->0) {
        string s; cin >> s;
        int lastIdx=0, curLength=0;
        for(int i=0;i<s.length();i++) {
            if(s[i]<='9') {
                curLength++;
            } else {
                if(curLength>0) {
                    v.push_back(s.substr(lastIdx, curLength));
                }
                lastIdx=i+1;
                curLength=0;
            }
        }
        if(s[s.length()-1]<='9') {
            v.push_back(s.substr(lastIdx, curLength));
        }
    }

    for(int i=0;i<v.size();i++) {
        v[i] = deleteLeadingZero(v[i]);
    }
    sort(v.begin(), v.end(), comp);

    for(int i=0;i<v.size();i++) {
        cout << v[i] << '\n';
    }
}