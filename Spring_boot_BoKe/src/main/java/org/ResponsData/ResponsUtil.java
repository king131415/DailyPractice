package org.ResponsData;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * 定义统一的响应格式
 * 业务操作成功或失败都返回200
 */
@Getter
@Setter
@ToString
public class ResponsUtil {
    //表示业务操作是否成功
    private boolean ok;

    //业务操作成功时，响应的数据

    private Object data;

    //业务操作失败时，返回的错误信息

    private String massge;

}
