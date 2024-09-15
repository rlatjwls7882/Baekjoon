#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int R; cin >> R;
    string Sangguen; cin >> Sangguen;

    int N; cin >> N;
    string friends[N];
    for(int i=0;i<N;i++) {
        cin >> friends[i];
    }

    int score=0;
    for(int i=0;i<R;i++) {
        for(int j=0;j<N;j++) {
            if(Sangguen[i]==friends[j][i]) {
                score++;
            } else if(Sangguen[i]=='R'&&friends[j][i]=='S' || Sangguen[i]=='S'&&friends[j][i]=='P' || Sangguen[i]=='P'&&friends[j][i]=='R') {
                score+=2;
            }
        }
    }
    cout << score << endl;

    score=0;
    for(int i=0;i<R;i++) {
        int R=0, S=0, P=0;
        for(int j=0;j<N;j++) {
            if(friends[j][i]=='R') {
                R++;
            } else if(friends[j][i]=='S') {
                S++;
            } else {
                P++;
            }
        }
        score += max(max(R*2+P, S*2+R), P*2+S);
    }
    cout << score;
}