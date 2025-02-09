# CORS Configuration Core Library Client

멘토링 때 설명한 CORS 설정을 위한 코어 모듈(간소화 버전) 라이브러리를 불러와 사용하는 프로젝트입니다.  
[CORS 코어 라이브러리](https://github.com/merge-simpson/mentoring-cors-core-2025) 모듈은
[Jitpack](https://jitpack.io) 저장소에 게시되어 있습니다.

## Download

```bash
git clone https://github.com/merge-simpson/mentoring-cors-core-2025-client.git
```

<details>
  <summary>SSH</summary>

- SSH 인증 방법: [GitHub SSH Authentication](https://nettee.notion.site/git-ssh-authentication)  
  https://nettee.notion.site/git-ssh-authentication

```bash
git clone git@github.com:merge-simpson/mentoring-cors-core-2025-client.git
```

</details>

## 어떤 작업을 포함하나요?

- JitPack 저장소를 스캔하도록 repositories 목록에 JitPack 메이븐 저장소를 등록합니다.  
  Gradle 프로젝트에서는 `build.gradle`(`build.gradle.kts`) 파일에서 등록합니다.
- 다음 라이브러리를 의존성 목록(`dependencies`)에 추가합니다.
  - Group ID: `com.github.merge-simpson`
  - Artifact: `mentoring-cors-core-2025`
  - Version: `0.1.0-rc2`
- CORS 설정을 위한 속성을 작성합니다. 예시를 참고하세요.  
  ```yaml
  demo.webmvc.cors:
    allowed:
      headers: "*"
      methods: "*"
      origins:
        - http://localhost:3000
        - https://localhost:3000
      credentials: true
    exposed:
      headers: "*"
    max-age: 3600
  ```

## Preflight 요청 테스트

브라우저가 서버에 요청할 때와 유사한 스펙으로 preflight 요청을 합니다.

다음 두 헤더를 포함합니다. 이 헤더의 내용을 바꾸며 preflight 요청이 성공하는지 확인할 수 있습니다.

|          Header Name          | Content               |
|:-----------------------------:|:----------------------|
|            Origin             | http://localhost:3000 |
| Access-Control-Request-Method | **GET**               |

다음 메서드로 요청합니다.

- **OPTION**

다음 URL로 요청합니다. (이 서버 애플리케이션에 기본으로 설정된 예시입니다.)

- http://localhost:8080

### Postman 사용 시 다음 파일을 임포트

- [postman-preflight-request.json](postman-preflight-request.json)