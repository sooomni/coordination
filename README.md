# coordination

## 1. 구현 범위 및 내용 
#### 1) 기능 구현
	- 카테고리 별로 최저가격인 브랜드와 가격을 조회, 총액 조회
	- 단일 브랜드로 전체 카테고리 상품을 구매 시 최저가격인 브랜드와 총액 조회
	- 특정 카테고리에서 최저가격 브랜드와 최고가격 브랜드를 확인하고 각 브랜드 상품의 가격 조회
	- 새로운 브랜드를 등록하고, 모든 브랜드의 상품을 추가, 변경, 삭제
#### 2) 로컬 H2 DB 사용

## 2. 코드 빌드, 테스트 및 실행 방법
### 1. 환경 설정
- Java JDK 17
- Gradle 8.8

### 2. 클론 및 빌드
```bash
# 프로젝트 클론
git https://github.com/sooomni/coordination.git

# 프로젝트 디렉토리로 이동
cd coordination

# Gradle을 사용하여 빌드
./gradlew build
```

### 3. 실행
```bash
./gradlew bootRun
```

### 4. 테스트 
별도의 테스트 코드는 작성하지 못하였고, postman 통해 테스트 진행하였습니다.

### 5. 샘플 데이터
샘플 Data와 테이블 DDL 위치 경로 
- src/main/resources/conf/init.sql
