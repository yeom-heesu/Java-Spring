1. 웹서버 프로그램이란?
  - 클라이언트(요청자)에 의해 요청되는 값을 서버프로그램(제공자)으로 부터 받아올수있는 일련의 과정
  - browser에 의해 request를 요청하고 웹서버 + WAS + server App 에서 해당하는 값을 response로 반환


2. 서블릿코드의 컴파일 과정?
  -  1) 실핼하고자 하는 java파일을 생성하여 컴파일 후 .class파일의 형태로 저장
  -  (+ tomcat >  webapps > Root 의 경로에 txt파일을 저장하면 tomcat을 실행할때 localhost:8080/파일명 으로 접근이 가능)
  -  2) C:\9.0.71\webapps\ROOT\WEB-INF\classes 에 .class파일을 저장
  -  3) C:\9.0.71\webapps\ROOT\WEB-INF 의 web.mxl 파일에서 서블릿코드와 URL을 매핑
  -  (+ web.xml 파일이 변경되면 톰켓서버 재실행 필요) 
