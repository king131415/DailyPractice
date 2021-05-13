package javaDailyProctice.Test0511;

import java.io.IOException;
import java.io.OutputStream;

public class IndexServlet implements Servlet {


    public IndexServlet() {
        init();
    }

    @Override
    public void init() {

    }

    @Override
    public void service(Request request, Response response) {
        System.out.println("这是首页！");
        response.write("<h1>hello</h1>");

    }

    @Override
    public void destory() {

    }
}
