#  JAVA Swing 기반 강의 관리 시스템 (Lecture Management System)
### 제60회 전국기능경기대회 정보기술 직종 공개 과제

---

이 프로젝트는 제60회 전국기능경기대회에서 제시된 **요구사항 명세서와 데이터베이스 스키마를 기반으로** 개발한 Java Swing 기반의 데스크톱 애플리케이션입니다.

---
## 프로젝트 실행화면
---

### 패키지 구성
이 프로젝트는 **MVC** 디자인 패턴을 기반으로 설계되었습니다.

* `src/control`: 사용자 입력 및 이벤트 처리를 담당하는 컨트롤러 클래스
    * `main`: 애플리케이션의 시작점인 `Main.java` 포함
* `src/model`: 데이터와 비즈니스 로직을 담당하는 모델 클래스
    * `dao`: 데이터베이스 접근 객체(Data Access Object)
    * `dto`: 데이터 전송 객체(Data Transfer Object)
* `src/util`: 다양한 유틸리티 클래스
    * `BaseFrame.java`: 기본 프레임
    * `Session.java`: 사용자 세션 관리
    * `UIUtil.java`: UI 관련 유틸리티
* `src/view`: 사용자 인터페이스(UI)를 담당하는 뷰 패키지
  
---

## 주요기능

---

### 사용기술
* **Language:** Java (JDK 12.0.1)
* **Framework/Library:** Java Swing, JDBC
* **Database:** MySQL 8.0
* **IDE:** Eclipse

---

### 데이터베이스 스키마
* 총 11개의 테이블(user, category, teacher, course_registration, certi, test, sale, lecture, schedule,, review, inquiry) 로 구성되어있습니다

---

### 배운 점 및 문제 해결 경험
