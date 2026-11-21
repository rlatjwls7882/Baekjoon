#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    while(N-->0) {
        string name, s; cin >> name >> s;

        int cnt[4] = {0, };
        for(int i=0;i<s.length();i++) {
            if(s[i]=='C') cnt[0]++;
            else if(s[i]=='B') cnt[1]++;
            else if(s[i]=='W') cnt[2]++;
            else cnt[3]++;
        }

        for(int i=0;i<4;i++) {
            cnt[i] *= i+1;
        }

        cout << name << ": ";
        if(cnt[0]>cnt[1] && cnt[0]>cnt[2] && cnt[0]>cnt[3]) cout << "The Coyote is the dominant species\n";
        else if(cnt[1]>cnt[0] && cnt[1]>cnt[2] && cnt[1]>cnt[3]) cout << "The Bobcat is the dominant species\n";
        else if(cnt[2]>cnt[0] && cnt[2]>cnt[1] && cnt[2]>cnt[3]) cout << "The Wolf is the dominant species\n";
        else if(cnt[3]>cnt[0] && cnt[3]>cnt[1] && cnt[3]>cnt[2]) cout << "The Mountain Lion is the dominant species\n";
        else cout << "There is no dominant species\n";
    }
}