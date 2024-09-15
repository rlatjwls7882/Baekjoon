#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    int M1[3] = {0, };
    for(int i=0;i<s.find('+');i++) {
        if(s[i]=='C') {
            M1[0]++;
        } else if(s[i]=='H') {
            M1[1]++;
        } else if(s[i]=='O') {
            M1[2]++;
        } else {
            if(s[i-1]=='C') {
                M1[0]+=s[i]-'1';
            } else if(s[i-1]=='H') {
                M1[1]+=s[i]-'1';
            } else {
                M1[2]+=s[i]-'1';
            } 
        }
    }

    int M2[3] = {0, };
    for(int i=s.find('+')+1;i<s.find('=');i++) {
        if(s[i]=='C') {
            M2[0]++;
        } else if(s[i]=='H') {
            M2[1]++;
        } else if(s[i]=='O') {
            M2[2]++;
        } else {
            if(s[i-1]=='C') {
                M2[0]+=s[i]-'1';
            } else if(s[i-1]=='H') {
                M2[1]+=s[i]-'1';
            } else {
                M2[2]+=s[i]-'1';
            } 
        }
    }

    int M3[3] = {0, };
    for(int i=s.find('=')+1;i<s.length();i++) {
        if(s[i]=='C') {
            M3[0]++;
        } else if(s[i]=='H') {
            M3[1]++;
        } else if(s[i]=='O') {
            M3[2]++;
        } else {
            if(s[i-1]=='C') {
                M3[0]+=s[i]-'1';
            } else if(s[i-1]=='H') {
                M3[1]+=s[i]-'1';
            } else {
                M3[2]+=s[i]-'1';
            } 
        }
    }

    for(int i=1;i<=10;i++) {
        for(int j=1;j<=10;j++) {
            for(int k=1;k<=10;k++) {
                if(M1[0]*i+M2[0]*j==M3[0]*k && M1[1]*i+M2[1]*j==M3[1]*k && M1[2]*i+M2[2]*j==M3[2]*k) {
                    cout << i << " " << j << " " << k;
                    i=j=k=10; break;
                }
            }
        }
    }
}