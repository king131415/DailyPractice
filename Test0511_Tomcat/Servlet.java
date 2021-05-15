package javaDailyProctice.Test0511_Tomcat;
//Connector/
public interface Servlet {
    void  init();
    void  service(Request request,Response response);
    void  destory();
}
