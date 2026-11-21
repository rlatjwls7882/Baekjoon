#include<bits/stdc++.h>

using namespace std;

bool compare(string a, string b) {
    if(a.size()!=b.size()) {
        return a.size()<b.size();
    }

    int sum1=0, sum2=0;
    for(int i=0;i<a.size();i++) {
        if('0'<=a[i] && a[i]<='9') {
            sum1 += a[i]-'0';
        }
        if('0'<=b[i] && b[i]<='9') {
            sum2 += b[i]-'0';
        }
    }
    if(sum1!=sum2) {
        return sum1<sum2;
    }
    return a<b;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    
    vector<string> v;
    while(N-->0) {
        string s; cin >> s;
        v.push_back(s);
    }
    sort(v.begin(), v.end(), compare);

    for(string strings:v) {
        cout << strings << '\n';
    }
}