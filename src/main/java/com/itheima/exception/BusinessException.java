package com.itheima.exception;
//自定义异常处理器，用于封装异常信息，对异常进行分类
public class BusinessException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException(Integer code, String message) {
        super(message);
        //super关键字在构造方法中使用，它表示调用父类的构造方法。在这段代码中，
        // super(message)表示调用RuntimeException类的构造方法，将message参数传递给父类构造方法来初始化异常的详细信息。
        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

}
