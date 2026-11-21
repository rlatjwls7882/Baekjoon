#include<bits/stdc++.h>
using namespace std;

bool compareSameDegree(string a, string b) {
    if((a[1]==a[3]) != (b[1]==b[3])) return (a[1]==a[3]) > (b[1]==b[3]);
    if(max(a[0], a[2]) != max(b[0], b[2])) return max(a[0], a[2]) > max(b[0], b[2]);
    if(min(a[0], a[2]) != min(b[0], b[2])) return min(a[0], a[2]) > min(b[0], b[2]);
    if(a[0]>a[2] && a[1]=='b' || a[0]<a[2] && a[3]=='b') return true; // 자리 바꿈
    return false; // 자리 안바꿈
}

bool comp(string a, string b) {
    for(int i=0;i<4;i+=2) {
        if(a[i]>='a') a[i] = '9'+1+a[i]-'a';
        if(b[i]>='a') b[i] = '9'+1+b[i]-'a';
    }
    if(abs(a[0]-a[2])==1 || abs(a[0]-a[2])==14) {
        if(abs(b[0]-b[2])==1 || abs(b[0]-b[2])==14) return compareSameDegree(a, b);
        else return true; // 자리 안바꿈
    } else if(a[0]==a[2]) {
        if(abs(b[0]-b[2])==1 || abs(b[0]-b[2])==14) return false; // 자리 바꿈
        else if(b[0]==b[2]) return compareSameDegree(a, b);
        else return true; // 자리 안바꿈
    } else {
        if(abs(b[0]-b[2])==1 || abs(b[0]-b[2])==14 || b[0]==b[2]) return false; // 자리 바꿈
        else return compareSameDegree(a, b);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    vector<string> v;
    for(int i=0;i<s.length();i+=3) {
        for(int j=i+3;j<s.length();j+=3) {
            v.push_back(s.substr(i, 2)+s.substr(j, 2));
        }
    }
    sort(v.begin(), v.end(), comp);
    for(string res:v) cout << res << '\n';
}
