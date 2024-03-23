import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.tools.javac.Main;

/**
 * HelloWorld
 * [使用SLF4J和Logback - 廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/1252599548343744/1264739155914176)
 */
public class HelloWorld {
    // slf4j 接口
    // logback 是 slf4j 的实现
    static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("你好，我是日志记录器");
        System.out.println("hello, world");
    }
}