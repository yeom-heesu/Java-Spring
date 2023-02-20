Spring framework 
- 자바 : JDK19 (sts미지원으로) -> JDK11
- IDE : STS
- web server : tomcat9
- web browser : chrome
- database : MySQL 5.7
- 기타 : VS code, git, AWS, Maven

1. 원격 프로그램 실행 과정
브라우저 => (URL 호출) WAS (Tomcat 등으로 원격프로그램 실행)

1) 프로그램 등록
@Controller
2) URL과 프로그램 (ex, main등 )연결 
@RequestMapping
3) 실행
