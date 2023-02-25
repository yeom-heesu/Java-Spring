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

<HTTP 요청과 응답>
1) HttpServletRequest request
  객체에 요청정보를 담아 Tomcat의 매개변수로 요청
2) HttpServletRequest 의 메서드


   ![HttpServletRequest Method](https://user-images.githubusercontent.com/43159337/221356499-da61c189-9209-403a-b6b6-afc2ba3bae51.png)

3) 클라이언트와 서버

![서버와 클라이언트](https://user-images.githubusercontent.com/43159337/221357515-32bec646-dc36-40fd-8bce-3ef0d6ed54c3.png)
  
  - Tomcat의 내부구조
  
  
  ![Tomcat내부구조](https://user-images.githubusercontent.com/43159337/221357555-0954e70b-be39-4bce-afe8-fd76cf56852c.png)

  - [Http란?](https://github.com/yeom-heesu/Java-Spring/blob/main/Spring/Http.md)
  

 
  
