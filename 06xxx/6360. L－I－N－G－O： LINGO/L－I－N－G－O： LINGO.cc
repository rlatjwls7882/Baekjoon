#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string lastPrint;
    while(true) {
        string answer; getline(cin, answer);
        if(answer.compare("LINGO")==0) break;
        if(answer.empty()) {
            lastPrint = "\n";
            cout << lastPrint;
            continue;
        }

        int totalCnt[26] = {0, };
        for(char ch:answer) totalCnt[ch-'A']++;

        lastPrint = answer; lastPrint[1]=lastPrint[2]=lastPrint[3]=lastPrint[4]='.'; lastPrint += '\n';
        cout << lastPrint;

        bool chk=false;
        for(int t=1;;t++) {
            string guess; getline(cin, guess);
            if(guess.empty()) {
                if(!chk) cout << (char)(answer[0]+32) << (char)(answer[1]+32) << (char)(answer[2]+32) << (char)(answer[3]+32) << (char)(answer[4]+32) << '\n';
                lastPrint = "\n";
                cout << lastPrint;
                break;
            }
            if(t>5 || chk) continue;
            if(guess.size()>5 || guess[0]<'A' || guess[0]>'Z' || guess[1]<'A' || guess[1]>'Z' || guess[2]<'A' || guess[2]>'Z' || guess[3]<'A' || guess[3]>'Z' || guess[4]<'A' || guess[4]>'Z') {
                cout << lastPrint;
                continue;
            }

            int curCnt[26] = {0, };
            lastPrint = ".....\n";
            for(int i=0;i<5;i++) {
                if(answer[i]==guess[i]) {
                    lastPrint[i] = answer[i];
                    curCnt[answer[i]-'A']++;
                }
            }

            for(int i=0;i<5;i++) {
                if(lastPrint[i]=='.' && totalCnt[guess[i]-'A']>curCnt[guess[i]-'A']) {
                    lastPrint[i] = guess[i]+32;
                    curCnt[guess[i]-'A']++;
                }
            }

            cout << lastPrint;
            if(lastPrint.compare(answer+"\n")==0) chk=true;
        }
    }
}