#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

pair<ld, ld> pos[3];

ld getDistSquare(int idx) {
    return (pos[idx].first-pos[(idx+1)%3].first)*(pos[idx].first-pos[(idx+1)%3].first) + (pos[idx].second-pos[(idx+1)%3].second)*(pos[idx].second-pos[(idx+1)%3].second);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        for(int i=0;i<3;i++) cin >> pos[i].first >> pos[i].second;
        if(cin.fail()) break;

        vector<ld> distSquare;
        for(int i=0;i<3;i++) distSquare.push_back(getDistSquare(i));
        sort(distSquare.begin(), distSquare.end());

        if(sqrtl(distSquare[2])-(sqrtl(distSquare[0])+sqrtl(distSquare[1]))>=-0.1) {
            cout << "Not a Triangle\n";
        } else {
            if(abs(sqrtl(distSquare[0])-sqrtl(distSquare[2]))<=0.1) cout << "Equilateral ";
            else if(abs(sqrtl(distSquare[0])-sqrtl(distSquare[1]))<=0.1 || abs(sqrtl(distSquare[1])-sqrtl(distSquare[2]))<=0.1) cout << "Isosceles ";
            else cout << "Scalene ";

            if(distSquare[2]-(distSquare[0]+distSquare[1])>0.1) cout << "Obtuse\n";
            else if(distSquare[2]-(distSquare[0]+distSquare[1])<-0.1) cout << "Acute\n";
            else cout << "Right\n";
        }
    }
}