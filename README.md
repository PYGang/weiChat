# weiChat
com.weiChat.nianhao.entity:封装了receive消息实体类和response消息实体类。将接收到的xml字符串转换成receive消息类，将response实体类转换成xml字符发送给微信服务器。

com.weiChat.nianhao.service:只有一个Core Service类。用来响应不同的xml消息。比如对文本类消息，提取关键信息，根据content的内容生成不同的xml格式的字符串。

com.weiChat.nianhao.servlet:接收https请求（GET、POST），并根据请求类型调用不同的响应程序

com.weiChat.nianhao.Util:工具类，封装了一些用到的工具。CheckUtil:验证工具，实现与微信服务器的认证
                                                   Constant：一些常量
                                                   MessageUtil：消息处理类，包括将xml字符转换成HashMap和将消息实体类转换成xml字符
