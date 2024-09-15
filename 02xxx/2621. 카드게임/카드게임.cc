#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string card[5] = {};
    bool cnt[10] = {false, };
    for(int i=0;i<5;i++) {
        char a, b; cin >> a >> b;
        card[i]+=a;
        card[i]+=b;
        cnt[b-'0']=true;
    }
    sort(card, card+5);

    if(card[0][0]==card[1][0]&&card[0][0]==card[2][0]&&card[0][0]==card[3][0]&&card[0][0]==card[4][0]&&card[4][1]-card[0][1]==4) {
        cout << card[4][1]-'0'+900;
    } else if(card[0][1]==card[1][1]&&card[0][1]==card[2][1]&&card[0][1]==card[3][1]||card[0][1]==card[1][1]&&card[0][1]==card[2][1]&&card[0][1]==card[4][1]||card[0][1]==card[1][1]&&card[0][1]==card[3][1]&&card[0][1]==card[4][1]||card[0][1]==card[2][1]&&card[0][1]==card[3][1]&&card[0][1]==card[4][1]) {
        cout << card[0][1]-'0'+800;
    } else if(card[1][1]==card[2][1]&&card[1][1]==card[3][1]&&card[1][1]==card[4][1]) {
        cout << card[1][1]-'0'+800;
    } else if(card[0][1]==card[1][1]&&card[0][1]==card[2][1]&&card[3][1]==card[4][1]) {
        cout << (card[0][1]-'0')*10+(card[3][1]-'0')+700;
    } else if(card[0][1]==card[1][1]&&card[0][1]==card[3][1]&&card[2][1]==card[4][1]) {
        cout << (card[0][1]-'0')*10+(card[2][1]-'0')+700;
    } else if(card[0][1]==card[1][1]&&card[0][1]==card[4][1]&&card[2][1]==card[3][1]) {
        cout << (card[0][1]-'0')*10+(card[2][1]-'0')+700;
    } else if(card[0][1]==card[2][1]&&card[0][1]==card[3][1]&&card[1][1]==card[4][1]) {
        cout << (card[0][1]-'0')*10+(card[1][1]-'0')+700;
    } else if(card[0][1]==card[2][1]&&card[0][1]==card[4][1]&&card[1][1]==card[3][1]) {
        cout << (card[0][1]-'0')*10+(card[1][1]-'0')+700;
    } else if(card[0][1]==card[3][1]&&card[0][1]==card[4][1]&&card[1][1]==card[2][1]) {
        cout << (card[0][1]-'0')*10+(card[1][1]-'0')+700;
    } else if(card[1][1]==card[2][1]&&card[1][1]==card[3][1]&&card[0][1]==card[4][1]) {
        cout << (card[1][1]-'0')*10+(card[0][1]-'0')+700;
    } else if(card[1][1]==card[2][1]&&card[1][1]==card[4][1]&&card[0][1]==card[3][1]) {
        cout << (card[1][1]-'0')*10+(card[0][1]-'0')+700;
    } else if(card[1][1]==card[3][1]&&card[1][1]==card[4][1]&&card[0][1]==card[2][1]) {
        cout << (card[1][1]-'0')*10+(card[0][1]-'0')+700;
    } else if(card[2][1]==card[3][1]&&card[2][1]==card[4][1]&&card[0][1]==card[1][1]) {
        cout << (card[2][1]-'0')*10+(card[0][1]-'0')+700;
    } else if(card[0][0]==card[1][0]&&card[0][0]==card[2][0]&&card[0][0]==card[3][0]&&card[0][0]==card[4][0]) {
        cout << card[4][1]-'0'+600;
    } else if(cnt[1]&&cnt[2]&&cnt[3]&&cnt[4]&&cnt[5]) {
        cout << 505;
    } else if(cnt[2]&&cnt[3]&&cnt[4]&&cnt[5]&&cnt[6]) {
        cout << 506;
    } else if(cnt[3]&&cnt[4]&&cnt[5]&&cnt[6]&&cnt[7]) {
        cout << 507;
    } else if(cnt[4]&&cnt[5]&&cnt[6]&&cnt[7]&&cnt[8]) {
        cout << 508;
    } else if(cnt[5]&&cnt[6]&&cnt[7]&&cnt[8]&&cnt[9]) {
        cout << 509;
    } else if(card[0][1]==card[1][1]&&card[0][1]==card[2][1]||card[0][1]==card[1][1]&&card[0][1]==card[3][1]||card[0][1]==card[1][1]&&card[0][1]==card[4][1]||card[0][1]==card[2][1]&&card[0][1]==card[3][1]||card[0][1]==card[2][1]&&card[0][1]==card[4][1]||card[0][1]==card[3][1]&&card[0][1]==card[4][1]) {
        cout << (card[0][1]-'0')+400;
    } else if(card[1][1]==card[2][1]&&card[1][1]==card[3][1]||card[1][1]==card[2][1]&&card[1][1]==card[4][1]||card[1][1]==card[3][1]&&card[1][1]==card[4][1]) {
        cout << (card[1][1]-'0')+400;
    } else if(card[2][1]==card[3][1]&&card[2][1]==card[4][1]) {
        cout << (card[2][1]-'0')+400;
    } else if(card[0][1]==card[1][1]&&card[2][1]==card[3][1]||card[0][1]==card[1][1]&&card[2][1]==card[4][1]) {
        cout << max(card[0][1]-'0', card[2][1]-'0')*10+min(card[0][1]-'0', card[2][1]-'0')+300;
    } else if(card[0][1]==card[1][1]&&card[3][1]==card[4][1]||card[0][1]==card[2][1]&&card[1][1]==card[3][1]||card[0][1]==card[2][1]&&card[3][1]==card[4][1]) {
        cout << max(card[0][1]-'0', card[3][1]-'0')*10+min(card[0][1]-'0', card[3][1]-'0')+300;
    } else if(card[0][1]==card[3][1]&&card[1][1]==card[2][1]) {
        cout << max(card[0][1]-'0', card[1][1]-'0')*10+min(card[0][1]-'0', card[1][1]-'0')+300;
    } else if(card[0][1]==card[3][1]&&card[2][1]==card[4][1]) {
        cout << max(card[0][1]-'0', card[2][1]-'0')*10+min(card[0][1]-'0', card[2][1]-'0')+300;
    } else if(card[0][1]==card[4][1]&&card[1][1]==card[2][1]) {
        cout << max(card[0][1]-'0', card[1][1]-'0')*10+min(card[0][1]-'0', card[1][1]-'0')+300;
    } else if(card[0][1]==card[4][1]&&card[2][1]==card[3][1]) {
        cout << max(card[0][1]-'0', card[1][1]-'0')*10+min(card[0][1]-'0', card[2][1]-'0')+300;
    } else if(card[1][1]==card[2][1]&&card[0][1]==card[3][1]||card[1][1]==card[2][1]&&card[3][1]==card[4][1]) {
        cout << max(card[1][1]-'0', card[3][1]-'0')*10+min(card[1][1]-'0', card[3][1]-'0')+300;
    } else if(card[1][1]==card[3][1]&&card[0][1]==card[2][1]) {
        cout << max(card[1][1]-'0', card[0][1]-'0')*10+min(card[1][1]-'0', card[0][1]-'0')+300;
    } else if(card[1][1]==card[3][1]&&card[2][1]==card[4][1]) {
        cout << max(card[1][1]-'0', card[2][1]-'0')*10+min(card[1][1]-'0', card[2][1]-'0')+300;
    } else if(card[1][1]==card[4][1]&&card[0][1]==card[2][1]||card[1][1]==card[4][1]&&card[2][1]==card[3][1]) {
        cout << max(card[1][1]-'0', card[2][1]-'0')*10+min(card[1][1]-'0', card[2][1]-'0')+300;
    } else if(card[2][1]==card[3][1]&&card[0][1]==card[1][1]||card[2][1]==card[3][1]&&card[1][1]==card[4][1]||card[2][1]==card[4][1]&&card[0][1]==card[1][1]||card[2][1]==card[4][1]&&card[1][1]==card[3][1]) {
        cout << max(card[2][1]-'0', card[1][1]-'0')*10+min(card[2][1]-'0', card[1][1]-'0')+300;
    } else if(card[0][1]==card[1][1]||card[0][1]==card[2][1]||card[0][1]==card[3][1]||card[0][1]==card[4][1]) {
        cout << card[0][1]-'0'+200;
    } else if(card[1][1]==card[2][1]||card[1][1]==card[3][1]||card[1][1]==card[4][1]) {
        cout << card[1][1]-'0'+200;
    } else if(card[2][1]==card[3][1]||card[2][1]==card[4][1]) {
        cout << card[2][1]-'0'+200;
    } else if(card[3][1]==card[4][1]) {
        cout << card[3][1]-'0'+200;
    } else {
        cout << 100 + max(max(max(max(card[0][1], card[1][1]), card[2][1]), card[3][1]), card[4][1])-'0';
    }
}