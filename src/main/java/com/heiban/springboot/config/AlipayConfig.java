package com.heiban.springboot.config;

public class AlipayConfig {

    // 商户appid
    public static String APPID = "2016101500691218";
    // 私钥 pkcs8格式的
    public static String RSA_PRIVATE_KEY = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDMaL71vTR/ANAWKSd5eCDfai8eHqRS13BsG3S6WO4mdo0qyd0w4YmSXKMng+Myt796p7Xqioy/ts6YBcDqyZRQGzfwxO/gbR6L2giHRWq8Z6Na88Q1Dt3HNYwrMZ9r4HsABmj6qNvkfTska0DfAYsjsbiz7slSS3DSeaFsoD8ZdA6Q19y/+830zOLnzwndcFCpcash/yZFFwTqLCkdP26YG/+huuQq99lGofGS9ZTd4+WY5ek0r1GI4QiflbYmVFS77hR3jRyyto6TMM1HgLZvfFIdD0+dK1lUCTz3qD6MXRYtX7uWHV4ksD15AGwrIv6Z9wo2khJ3P2bFDY1xZkA3AgMBAAECggEAMAqyTvlQHEVporu7bl4gg8HmHxMeleXSo2X0klOSbXHRjevx06o+dirVodTqkiIDm+VM6Tn1CJ4DglFf3Q7Rj95F0I3IvxuGYWI2POzAwFUvXJIMXFgJIefg8Mnx6R3SatgW1krXm6UfQFkA3yjytcnwWkHWCUR32NADc49aJTXpDXEaR0EBbXw3uRy5kLtm3vyD0KL6jqnfaooQsBYURDi4Jzn0ow9Io8TdcxDjGVQ7Osq4rE1MKAg70B+Zikkgixfqr/kFTYn1ZEZ7e1NULgt9Zb/2PVgVpeJdLOjccekgcnN/R/owHFAI635B90+uQWS6r7bGoZb8Ec1TUpf6+QKBgQDvnbi0Id5CCBm5MXhcGc1LYeWEJkqQwsWMQRFuGokdp5jDidSD6aTrjLGiI89+X1YayXazLrcXZKa7K4vJCgFR4X77ZNN/Z6FAy5tfSAExclA5jTtIQ2U91X7E0Rvhg+Z6Lqb4agxLDRZ/VEvYbNxO30GPInogycDxtzXjG0OGqwKBgQDaYsGxECQ3b7BmiVcmROznW1Xsj5hG1dPJ3BZFxQWnpEr8Z+hOY2WD0mlq6I2lLLX4bqO5Ep44sKlT4Rwhf80jhlhU/ZbOqZS7SSxLcq3IFAfKSyoaxkgG88u4ESyXn3Khlh2RZ09IRLBGmkG1LGx0YKlHv4XH43uJqqWae3FcpQKBgQC5iJ1w1NycslsAm35/ifb9DINDzMZlynpd/C/72g4baR8PIRTtQydQv/L3AdVzG2y3dxEy8tQQB/5V5QTqmJWnCfxhuZNODja8ziqzHzTVTZcyyNmDPbQRqdLroKJ+/ruiFadxp+N25V5rHyFPJhN7+sBvjRmVc8KzJtJR1FV32wKBgQCI2VHfDupjAs5bsry18oMyB340m1clLGFnIU+jsO72OnHy8XoVhRvcG0KMB+abFwWBBHP8Sbp0c9/n/CyQoXF/TXSU7cRPBN1670Oek+JqeoLXNXrRBGemU6fZVInJCdXfhB5LO53m/4Qm+gsq6QeddeUeXNoMhHSptBHKWIiVMQKBgQC88Nak+atjduoYv/QpsZVut4EneeQxPqpSQtvSCD9WqMbaR/HcWZdhIT7v8UxlUQUmZ29O61N5bHlvrwXfnlm3k67P4EjX96BOY9uDKD0jaNPA8f44JekNSiUYyNHJdyTzGC6rO/3zAfOySkAOPC4700fNbj/uQ75NGEt46neL+g==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://zhuml.free.idcfengye.com/notify_url";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    public static String return_url = "http://zhuml.free.idcfengye.com/return_url";
    // 请求网关地址
    public static String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    public static String CHARSET = "UTF-8";
    // 返回格式
    public static String FORMAT = "json";
    // 支付宝公钥
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj2eG6QVS2iEszAQXnLnnyU8AWRIuzUynCv+qgJ2coh6GQ6iHEo+cPIp1cJBqaqucb4JWZCXsAGaTVPY/s7k7N7TlzUMJe7EzSI1PYBQMHxbZ1fzpaTnxTgGIZhUxYiDK7JsjZOpQ+I94r98IX04RpK4kBG9pNmKJtGUzVIC5OGZ/Mqi1ZH6S1pT6CG+e2tvVPaOAOzqED1K7tNoHKLP22o9vLrUfHuYs53r9VJefC7YtNnmZeocwd6nfdyroxAi4bkWIcJzv6nDgkanvbKsnLRzIXUwDqFpTWxMDk0CeKaaUGwdAaAS+pMGxoMC2OI5jlM0QSpp5fX1ZUY1PH2JTXwIDAQAB";
    // 日志记录目录
    public static String log_path = "/log";
    // RSA2
    public static String SIGNTYPE = "RSA2";

}
