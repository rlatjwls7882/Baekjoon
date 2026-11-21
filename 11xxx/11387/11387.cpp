#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll input[4][5];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=0;i<4;i++) {
        for(int j=0;j<5;j++) {
            cin >> input[i][j];
            if(j<2) input[i][j] *= 100;
        }
    }

    ll original = input[0][0]*(100+input[0][1]/100)*(10000-min(10000LL, input[0][2]*100) + min(100LL, input[0][2])*input[0][3])*(100+input[0][4]);
    ll change = (input[0][0]-input[2][0]+input[3][0])*(100+(input[0][1]-input[2][1]+input[3][1])/100)*(10000-min(10000LL, (input[0][2]-input[2][2]+input[3][2])*100) + min(100LL, input[0][2]-input[2][2]+input[3][2])*(input[0][3]-input[2][3]+input[3][3]))*(100+input[0][4]-input[2][4]+input[3][4]);
    if(original<change) cout << "+\n";
    else if(original>change) cout << "-\n";
    else cout << "0\n";

    original = input[1][0]*(100+input[1][1]/100)*(10000-min(10000LL, input[1][2]*100) + min(100LL, input[1][2])*input[1][3])*(100+input[1][4]);
    change = (input[1][0]-input[3][0]+input[2][0])*(100+(input[1][1]-input[3][1]+input[2][1])/100)*(10000-min(10000LL, (input[1][2]-input[3][2]+input[2][2])*100) + min(100LL, input[1][2]-input[3][2]+input[2][2])*(input[1][3]-input[3][3]+input[2][3]))*(100+input[1][4]-input[3][4]+input[2][4]);
    if(original<change) cout << "+\n";
    else if(original>change) cout << "-\n";
    else cout << "0\n";
}