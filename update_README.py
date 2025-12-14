# https://github.com/Hiyabye/Baekjoon/blob/main/scripts/update_readme.py 에 있는 코드 변경하여 사용
import glob
import json
import requests
from tqdm import tqdm

# solved.ac API로 해결한 문제 수를 int로 가져옴
def get_solved_count(handle):
  response = requests.get(f"https://solved.ac/api/v3/user/show", params={"handle": handle})
  response.raise_for_status()
  return int(response.json()["solvedCount"])

# solved.ac API로 해결한 문제들을 50개씩 가져옴
def get_problems(handle, page):
  response = requests.get("https://solved.ac/api/v3/search/problem", params={"query": f"solved_by:{handle}", "direction": "asc", "page": page, "sort": "id"})
  response.raise_for_status()
  return response.json()

# 문제 번호를 입력받아 문제 URL을 반환
def get_problem_url(id):
  return f"https://boj.kr/{id}"

# 문제 제목의 특수문자를 처리하여 반환
def get_problem_title(title):
  title = title.replace("|", "\\|") # 17203번: ∑|ΔEasyMAX|
  title = title.replace("\\(", "$") # 10386번: LaTeX로 구성된 제목
  title = title.replace("\\)", "$") # 10386번: LaTeX로 구성된 제목
  return title

# 문제 난이도를 입력받아 문제 티어를 반환
def get_problem_tier(level):
  tier = {
    0: "Unrated",
    1: "Bronze 5", 2: "Bronze 4", 3: "Bronze 3", 4: "Bronze 2", 5: "Bronze 1",
    6: "Silver 5", 7: "Silver 4", 8: "Silver 3", 9: "Silver 2", 10: "Silver 1",
    11: "Gold 5", 12: "Gold 4", 13: "Gold 3", 14: "Gold 2", 15: "Gold 1",
    16: "Platinum 5", 17: "Platinum 4", 18: "Platinum 3", 19: "Platinum 2", 20: "Platinum 1",
    21: "Diamond 5", 22: "Diamond 4", 23: "Diamond 3", 24: "Diamond 2", 25: "Diamond 1",
    26: "Ruby 5", 27: "Ruby 4", 28: "Ruby 3", 29: "Ruby 2", 30: "Ruby 1"
  }
  return tier[level]

# 문제 번호를 입력받아 솔루션 경로를 모두 반환 (문자열로)
def get_solution_path(id):
  tmpId = id
  # 디렉토리
  if (id < 10000):
    id = f"0{id}"
  dir = f"{str(id)[:2]}xxx"

  # 파일 확장자
  ext = {
    ".ada": "Ada",
    ".a68": "Algol 68",
    ".bas": "FreeBASIC",
    ".c"  : "C",
    ".cc": "C++",
    ".cpp": "C++",
    ".f"  : "Fortran",
    ".gs" : "Golfscript",
    ".java" : "Java",
    ".py" : "Python",
    ".txt": "Text",
    ".vb" : "Visual Basic",
    ".swift" : "Swift"
  }

  # 파일 찾기
  files = glob.glob(f"{dir}/{tmpId}.*/*")
  files.sort()
  solution = ""
  for file in files:
    if file[file.rfind('.'):] == '.md':
      continue
    file = file.replace(" ", "%E2%80%85") # 링크에 띄어쓰기가 있는경우
    solution += f"[{ext[file[file.rfind('.'):]]}](./{file}) "
  return solution

# README.md 헤더 반환
def get_header(handle):
  header = '<div align="center">\n\n'
  header += "# Baekjoon\n\n"
  header += " [![Solved.ac Profile](http://mazassumnida.wtf/api/v2/generate_badge?boj=rlatjwls3333)](https://solved.ac/rlatjwls3333/)\n"
  header += " ![mazandi profile](http://mazandi.herokuapp.com/api?handle=rlatjwls3333&theme=dark)\n"
  header += "#### [여기](https://github.com/Hiyabye/Baekjoon/blob/main/scripts/update_readme.py)에 있는 코드를 변경하여 자동으로 생성하였습니다.\n"
  header += "#### 500KB까지 렌더링되기에 중간에 짤립니다. 전체 목록은 [여기](./README.md)에서 확인해주세요.\n\n"
  return header

# README.md 테이블을 반환
def get_table(problems):
  table = "| No. | Title | Difficulty | Solution |\n"
  table += "|:---|:---|:----:|:---:|\n"

  for (id, title, level) in tqdm(problems):
    idString = str(id)
    if len(idString)==4:
      idString = "0"+idString
    url = get_problem_url(id)
    title = get_problem_title(title)
    tier = get_problem_tier(level)
    path = get_solution_path(id)
    table += f"| [{idString}]({url}) | {title} | {tier} | {path}|\n"
  return table

# 메인 함수
if __name__ == "__main__":
  # solved.ac API로 푼 문제 수 가져오기
  solved_count = get_solved_count("rlatjwls3333")
  pages = (solved_count - 1) // 50 + 1
  problems = []

  # solved.ac API로 문제 정보 가져오기
  for page in tqdm(range(1, pages+1)):
    attempts = 0
    while attempts < 3:
      try:
        solved = get_problems("rlatjwls3333", page)
        break
      except:
        attempts += 1
    for problem in solved["items"]:
      problems.append((int(problem["problemId"]), problem["titleKo"], int(problem["level"])))

  # README.md 파일 업데이트
  with open("README.md", "w", encoding="utf-8") as f:
    f.write(get_header("rlatjwls3333") + get_table(problems) + "</div>\n")
