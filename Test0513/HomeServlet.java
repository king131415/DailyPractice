package javaDailyProctice.Test0511;

public class HomeServlet implements Servlet {

    public HomeServlet(){
        init();
    }


    @Override
    public void init() {
        System.out.println("初始！");

    }

    @Override
    public void service(Request request, Response response) {
        System.out.println("this is home");
        response.write("<h1>home</h1>");
    }

    @Override
    public void destory() {

    }
}
