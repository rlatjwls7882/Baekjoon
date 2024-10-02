#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double score[20];
    int idx=0;
    for(int i=0;i<20;i++) {
        cin >> score[i];
        if(score[i]==20) idx=i;
    }

    double Alice = (score[idx]+score[(idx+1)%20]+score[(idx+19)%20])/3;
    if(Alice>10.5) cout << "Alice";
    else if(Alice<10.5) cout << "Bob";
    else cout << "Tie";
}