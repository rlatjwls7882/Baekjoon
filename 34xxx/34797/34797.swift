let n = Int(readLine()!)!

var score=0.0, bonus=0.0
for _ in 1...n {
    let s = readLine()!
    if s=="A1" || s=="B1" || s=="C1" {
        bonus+=0.05;
    } else if s=="A2" || s=="B2" || s=="C2" {
        bonus+=0.025;
    }

    if s.first=="A" {
        score+=4
    } else if s.first=="B" {
        score+=3
    } else if s.first=="C" {
        score+=2
    } else if s.first=="D" {
        score+=1
    }
}
print(score/Double(n)+bonus)