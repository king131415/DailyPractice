package javaDailyProctice.Test0511;
//Connector/
public interface Servlet {
    void  init();
    void  service(Request request,Response response);
    void  destory();
}
