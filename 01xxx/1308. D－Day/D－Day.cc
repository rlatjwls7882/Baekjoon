#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int Ys, Ms, Ds, Ye, Me, De; cin >> Ys >> Ms >> Ds >> Ye >> Me >> De;
    if(Ye>Ys+1000 || Ye==Ys+1000 && Me>Ms || Ye==Ys+1000 && Me==Ms && De>=Ds) {
        cout << "gg";
        return 0;
    }

    int cnt=0;
    while(!(Ys==Ye && Ms==Me && Ds==De)) {
        cnt++;
        Ds++;
        if(Ds==30 && Ms==2 && (Ys%4==0 && Ys%100!=0 || Ys%400==0) || Ds==29 && Ms==2 && !(Ys%4==0 && Ys%100!=0 || Ys%400==0) || Ds==32 && (Ms==1 || Ms==3 || Ms==5 || Ms==7 || Ms==8 || Ms==10 || Ms==12) || Ds==31 && (Ms==4 || Ms==6 || Ms==9 || Ms==11)) {
            Ds=1;
            Ms++;
            if(Ms==13) {
                Ms=1;
                Ys++;
            }
        }
    }
    cout << "D-" << cnt;
}