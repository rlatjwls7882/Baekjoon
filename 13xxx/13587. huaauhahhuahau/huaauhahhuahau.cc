#include <iostream>
#include <string>

using namespace std;

int main() {
  string str;
  getline(cin, str);

  string laugh = "";
  for (int i = 0; i < str.length(); i++) {
    if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' ||
        str[i] == 'u') {
      laugh += str[i];
    }
  }

  bool chk = true;
  for (int i = 0; i < laugh.length() / 2; i++) {
    if (laugh[i] != laugh[laugh.length() - 1 - i]) {
      chk = false;
      break;
    }
  }
  cout << (chk ? "S" : "N");
}