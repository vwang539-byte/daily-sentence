# Daily Sentence 앱 설치 가이드

## 앱 소개
매일 앱을 열면 그날의 영어 문장이 표시됩니다.
- Day 1~20: 아주 짧고 단순한 문장
- Day 21~50: 조금씩 길어지는 문장
- Day 51~80: 접속사, 관계절 포함
- Day 81~100: 자연스러운 복문

시작일: **2025년 6월 1일** (MainActivity.kt에서 수정 가능)

---

## 설치 방법 (Android Studio 이용)

### 1단계: Android Studio 설치
- https://developer.android.com/studio 에서 무료 다운로드

### 2단계: 프로젝트 열기
1. Android Studio 실행
2. **"Open"** 클릭
3. 이 폴더(DailySentence) 선택

### 3단계: APK 빌드
1. 상단 메뉴 → **Build → Build Bundle(s) / APK(s) → Build APK(s)**
2. 빌드 완료 후 우측 하단 팝업에서 **"locate"** 클릭
3. `app/build/outputs/apk/debug/app-debug.apk` 파일 확인

### 4단계: 삼성폰에 설치
1. APK 파일을 카카오톡, 이메일, USB 등으로 폰으로 전송
2. 폰에서 파일 열기
3. **"출처를 알 수 없는 앱 설치 허용"** → 허용
4. 설치 완료!

---

## 시작일 변경 방법
`app/src/main/java/com/example/dailysentence/MainActivity.kt` 파일에서:
```kotlin
private val startDate = LocalDate.of(2025, 6, 1)  // ← 여기를 수정
```

---

## 문장 수정 방법
같은 파일의 `sentences` 리스트에서 원하는 문장으로 교체하면 됩니다.
