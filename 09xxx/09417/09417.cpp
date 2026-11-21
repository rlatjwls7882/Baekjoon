#include <bits/stdc++.h>
using namespace std;

int gcd(int a, int b) {
    while(b!=0) {
        int tmp = a%b;
        a=b;
        b=tmp;
    }
    return a;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N; cin.ignore();

    while(N-->0) {
        string s; getline(cin, s); s += " ";
        vector<int> v;

        int pos, lastPos=0;
        while((pos=s.find(" ", lastPos)) != string::npos) {
            v.push_back(stoi(s.substr(lastPos, pos-lastPos)));
            lastPos=pos+1;
        }

        int maxGcd=1;
        for(int i=0;i<v.size();i++) {
            for(int j=i+1;j<v.size();j++) {
                maxGcd = max(maxGcd, gcd(v[i], v[j]));
            }
        }
        cout << maxGcd << '\n';
    }
}