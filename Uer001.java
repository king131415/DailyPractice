package javaDailyProctice;

import java.io.Serializable;
//序列化
public class Uer001 implements Serializable {
    private String uerName;

    public Uer001(String uerName) {
        this.uerName = uerName;
    }

    public String getUerName() {
        return uerName;
    }
}
