1. 웹서버 프로그램이란?
  - 클라이언트(요청자)에 의해 요청되는 값을 서버프로그램(제공자)으로 부터 받아올수있는 일련의 과정
  - browser에 의해 request를 요청하고 웹서버 + WAS + server App 에서 해당하는 값을 response로 반환


2. 서블릿코드의 컴파일 과정?
  -  1) 실핼하고자 하는 java파일을 생성하여 컴파일 후 .class파일의 형태로 저장
  -  (+ tomcat >  webapps > Root 의 경로에 txt파일을 저장하면 tomcat을 실행할때 localhost:8080/파일명 으로 접근이 가능)
  -  2) C:\9.0.71\webapps\ROOT\WEB-INF\classes 에 .class파일을 저장
  -  3) C:\9.0.71\webapps\ROOT\WEB-INF 의 web.mxl 파일에서 서블릿코드와 URL을 매핑
          - 1) web.xml파일에서 매핑
          - 2) annotation 이용 @webServlet
            import java.io.*;
            import javax.servlet.ServletException;
            import javax.servlet.http.*;
            import javax.servlet.annotation.WebServlet;
  -  (+ web.xml 파일이 변경되면 톰켓서버 재실행 필요) 

3. JSP와 Servlet
  - 1. 서블릿과 컨트롤러 비교
  @webServlet = @Controller + @RequestMapping
  - 상속 extend HttpServlet     - 상속 X
  - 클래스 단위별 매핑           - 매소드 단위별 매핑
  - 2. 서블릿의 생명주기
  - 1) 서블릿 초기화 init()
  - 2) 서블릿 사용 service()
  - 3) 서블릿 뒷정리 destroy()
  - 3. JSP와 서블릿 비교
  - JSP에서 <%~%>안에 자바코드를 사용
  - src/main/webapp의 경로에 작성
  - 4. JSP의 호출과정
  - 이미지 첨부
  - 5. JSP의 기본객체
  - 생성이 없이 사용가능한 객체들 ) request, pageContext, session, out, page, config ...
  - 6.유효범위와 속성
  - 1) pageContext lv저장 - 1개의 JSP 페이지
  - 2) application webapp 전체에서 사용가능 - context전체
  - 3) session 클라이언트 - 1+개 JSP 페이지
  - 7. URL패턴
  - @webServlet으로 서블릿을 URL에 매핑할때 사용
  - 1) exact mapping - 완전히 일치하는 정확한 URL 매핑 ex) "/login/hello.do"
  - 2) path mapping - 경로 URL 매핑       ex) "/login/*"
  - 3) extension mapping - 확장자 URL매핑 ex) "*.do"
  - 4) default mapping - 디폴트 URL매핑   ex) "/"
  - 8. deploy 경로
  - run configurations > Arguments deploy "c:~~~:"
  - 9. JSTL (JSP Standaed Tag Library)
  - <%=student%> => ${student}
  - <%=if%> => <c:if>
  - 10. EL (Expression Language)
  - 표현언어
  - 11. Filter _ 공통적인 요청 전처리와 응답 후처리에 사용 로깅,인코딩 등
  - 여러개의 필터 사용후 서블릿 호출 가능
  - 호출순서는 필터1 -> 필터2 -> 서블릿 (서블릿이 제일 마지막 호출)
  
  4. @RequestParam과 @ModelAttribute
  - @RequestParam _ 요청의 파라미터를 연결할 매개변수에 붙이는 애너테이션
  - cf) error 400 ) client / 500 ) server
