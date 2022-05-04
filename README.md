```
https://github.com/miniplugin/ezen (수업전소스)
https://github.com/kimilguk/ezen (수업후소스)

동기화 하는 방법: (기본은 비동기화-파일다운로드,동영상재생 이다.)
- 동기화예, 대용량파일 업로드, 안드로이드 앱에서 데이터(어댑터)화면처리
- 메서드동기화: synchronized 메서드명() 
- 객체동기화: synchronized(객체명)=wait(), notify()로 대기상태를 풀어준다

이론 -> sudo코드(수도코드):가짜코드,유사코드
https://blog.daum.net/web_design

프로젝트 1번째 작업: 현황파악
- 클래스다이어그램(자바용) : 자바코딩 기준
- E(엔티티)-R(릴레이션)다이어그램(DB용): 자바코딩 기준

포트폴리오(portfolio) 프로젝트(패키지) 제작
- 성적산출 프로그램
- 설정클래스(전역클래스): 프로그램전체에 영향을 주는 static 상수 클래스
- 도메인패키지(데이터클래스): 도메인주도개발(DDD:해당분야전문가위주개발)
- 성적패키지(데이터처리클래스):서비스클래스-성적을 학점으로 변경구현
- 스쿨패키지(몸체구조클래스): 비어있고, 위에서 제작한 도메인과, 성적구현 사용
- 화면클래스(메인실행클래스): 메인스레드. 콘솔출력에 대해서 확인.

1.스레드객체.start()실행, .stop()중지, .inturrupt()중지예외발생
2.ArrayList(배열객체): .add(배열객체) 입력, 배열객체(index번호) 출력
- C(.add)R([인덱스번호])U(.set메서드)D(.remove메서드)

?key=f5eef3421c602c6cb7ea224104795888
&
targetDt=20220101
Serialize(시리얼라이즈:데이터직렬화)
- 구현: StringBuilder 클래스
# 파싱하는 개발자 입장
14장 17번째 슬라이드 람다식 시작예정
성적산출프로그램 제작

아이작스(Ajax: Asyncronize Json데이터 & Xml데이터):RestAPI 기술의 핵심
스레드에 사용되는 용어
- 동기화(싱크로나이즈) : 작업순서대로만 프로그램이 진행 async=false;
-- 예, 첨부파일을 업로드: 1. 첨부파일 업로드, 2. 게시물내용등록

- 비동기화(A싱크로나이즈) : 스레드사용 목적. 기본이 비동기,async=true;
-- 예, 대용량 다운로드시 비동기화(기본)
-- 여러작업을 동시에 실행하기 위해서(예, 1~100카운트하는 작업을 동시에진행)

http://kimilguk-boot2.herokuapp.com/api/file_download/2
13장 31번째 슬라이드 File 클래스 사용부터 시작
- test 패키지를 만들어서, 문제에서 원하는 3가지 코딩작업.

- 영화진흥위원회API전송받음->InputStream객체사용->우리프로젝트->StringBuilder직렬화시킴
->JSONArray 객체를 이용해서 파싱한다.
# 영화진흥위원회API개발자 입장
- MovieBoxOffice(클래스) -> ArrayList<MovieBoxOffice> 객체 -> JSONArray<세로데이터> 객체
StringBuilder클래스로 직렬화를 시킨다.-> 우리프로젝트로 전송한다.

프로그램에서 사용하는 경로 2가지로 나눈다.
1. 상대경로: 현재위치를 기준(.)으로, ..(상위폴더) 예, ./src/ppt12/eclipse.ini
2. 절대경로: 컴퓨터기준(드라이브)으로 예, C:\\ezen\\eclipse\\eclipse.ini
- 윈도우기준: 경로구분에 \(역슬래시)를 사용 예, \n(엔터) \\특수문자 일반문자
- 리눅스(유닉스)기준: 경로구분에 /(최상위경로루트) 사용.-그대로 사용가능

abcdefghijklmnopqrstuvwxyz(배열사용)
zyxvu....(암호화키=1:1매칭이 기보로직)
바이너리서치(2진탐색): 원본데이터를 2부분으로 분리한후 비교하는 
- 과정을 찾을 때까지 반복하는 검색
sort(), suffle() : 원본데이터를 손상시킨다.

익명클래스(객체이름없음)에서 사용: 1. 익명클래스 생략
- 람다식(메서드이름생략) -> {구현내용}=익명메서드
그래픽 객체를 만드는 2가지 방식
1.고정값(스칼라값): bmp,jpg,png(화면확대하면 이미지가 깨진다.)
-자바데이터(기본형x,y): int[][] intArray = new int[2][2];
2.가변값(벡터값): svg,안드로이드이미지(확대를 해도 이미지가 화질불변)
-자바데이터(객체형,배열리스트):ArrayList<Integer[]> aList = new ArrayList<Integer[]>();

11장 38번 슬라이드부터 시작-빠르게진행-사람그리기 추가

RestAPI 기술: 데이터제공서버(공공데이터) -> Representation State Transfer
- 처리해서 화면에 출력하는 개발(파싱Parsing)
- 위 프로그램을 실행파일로 제작(jar:JavaArchive 자바실행파일)

10장 39번 슬라이드부터 시작-빠르게진행

유효성검사(validation): 입력값이 정확한지 확인(회원로그인,회원가입)
프로그램 오류(error)는 2가지 경우로 나눈다.
- 구문오류(Syntax에러): 이클립스에디터에서 확인 javac SimpleGame.java(컴파일)
- 실행오류(Runtime오류): 이클립스콘솔에서 확인 java SimpleGame(.class.main()생략)
                                : sum(a, b) = a + b; (원하는 결과가 않나올때 찾기가 어려움)
          : NullPointerException(널포인터익셉션):클래스,변수,메서드 Call호출할때 값이 없을때.
          : OutOfBound(배열의 인덱스가 없는 데 Call참조할때 발생)
10장 시작전 - SimpleGame 클래스 원그리기, KeyAdapter() 예외.

람다식(생략구문): 애로우(화살표)함수
9장 슬라이드 11: MyFrame 디자인 부터
어제 왜? 안될까 추가내용
//jPanel.setSize(150, 200);//패널크기 왜 일까? 아래 처럼 추가
jPanel.setPreferredSize(new Dimension(150, 200));
JLabel jLabel = new JLabel("안녕하세요");
jLabel.setFont(new Font(null, Font.BOLD, 20));//글자크기 조정

프레임 > add(패널) > 패널.add(버튼)
https://github.com/miniplugin/ezen/blob/main/src/basic/Basic02_ClassMethod.java
-------------------(내림차순 완료)
5 4 3 2 1
5 3 4 2 1
-------------------
3 5 4 2 1
3 5 4 2 1
3 5 2 4 1
3 2 5 4 1
-------------------
2 3 5 4 1
2 3 5 1 4
2 3 1 5 4
2 1 3 5 4
-------------------
2 1 3 5 4
7장 연습문제 8번 시작(컴퓨터시간에 대해서, Calendar 클래스)

모든 프로그램 작업
#데이터 처리(Create,Read,Update,Delete)
- CUD(입력수정삭제): ArrayList<HashMap>, 예외처리, 첨부파일
- Select(조회): 순서(정렬:OrderBy), 검색

#보안(인증Authentication, 권한Authority) OAuth2.0 - SNS인증
- 인증(출입) > 권한(접근:관리자,사용자)

6장 연습문제1 +, - 설명부터

학생클래스(객체 1개 가로데이터=레코드)
학번1, 이름, 학점(중간고사,기말고사,"",""), ...
학번2, 이름, 학점(중간고사,기말고사,퀴즈,과제), ...
학번3, 이름, 학점(중간고사,기말고사,퀴즈,""), ...

학점클래스(객체 가로데이터 -> 세로데이터로 변경)
- 학번, 학점종류, 점수
   1  , 중간고사 , 70
   1 , 기말고사, 80
   2 , 중간고사 , 70
   2 , 기말고사 , 70
   2 , 퀴즈 , 70
   2 , 과제 , 70
데이터를 주고 받을 때 배열 객체형태를 사용.

String name = "아무개";
name = null;//객체가 소멸
static: 1번만 생성되는 메모리(실행) [고정]영역=고정값
heap: new 로 생성되는 객체 [동적]인 메모리(실행) 영역

public > protected > default > private
클래스 객체의 다형성
- overloading(오버로딩): 메서드의 매겨변수의 로딩값으로 구현
--예, add(int a, int b, int c);add(int a, int b);add();
- @Overriding(오버라이딩): 상속받은 @애노테이션으로 구현
-- 구현(메서드를 사용)

Integer[] number = {1, 2, 3, 4};//객체
학생 클래스(데이터클래스): 이름, 학번, 주소, 학점, 졸업여부 등
(5멤버변수=필드5=클래스변수5)
   제한  학번  이름  학점 ...
private 2201 학생1 A ... 로그인객체1
private 2202 학생2 B ... 로그인객체2
private 2203 학생2 C ...
  제한
public Getter(출력기능), Setter(입력기능) 
...
학교업무(학사업무): 기능 클래스(서비스클래스권한부여가능)
학점을 입력 point()메서드(함수-접근권한) 2022학번의 학생
겟,셋 메서드로 접근해서 Data수정

sum += i*i+1;// sum = sum + (i*I+1);
 i += 3;
// i = i+3;
int[] s = new int[10];//index 0 ~ 9 
- (10 인덱스 값을 가져오려고 할 때, out of bound 에러)
for문 2가지: 
- for문(시작값;종료값;증감값) { 반복구현내용 }
- 향상된 for문(for ~ each문)
  for(출력변수:배열-리스트) { 반복구현내용 }
                       컴퓨터
                   가위(0)    바위(1)    보(2)
사용자 가위(0)              0 1(컴)    0 2(사)
          바위(1)  1 0(사)                 1 2(컴)
            보(2)   2 0(컴)   2 1(사)         
1. 비겼습니다.
2. 컴퓨터가 이겼습니다.
3. 사용자가 이겼습니다.
컴퓨터가 이겼을 경우(아래)
0 1
1 2
2 0

ppt03_17슬라이드까지 진행.
https://github.com/miniplugin/ezen
AND 연산(&&엔퍼센드2개):곱하기연산
 1(true) x 1(trun) = 1, 1(true)x0(false)=0(false)
OR연산(||파이프라인2개) 0(false)+0(false)=0
0(false)+1(true)=1(true), 단, 논리연산에서는 1+1=1
JDK8이상 설치: 오라클자바(라이센스)
오픈자바 설치(오픈소스)
인*****(netplwiz)
다국어 프로그램 지원: 
이클립스의 언어 설정(encoding) 변경
최초(ms949) -> UTF-8(다국어지원)
이름지정 규칙: 카멜(낙타등)표기법
전공이름 = majorName(자바) = major_name(DB데이터베이스)
int = Integer(null허용)
long(기본형)null공백X 
김일국ghpkimilguk
_pUbRCwXrkIPrLjgj5VY2huczEAlE591YqKJ1
= Long(클래스:참조형 특징 null공백이 가능)