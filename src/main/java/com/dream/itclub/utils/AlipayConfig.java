package com.dream.itclub.utils;


import java.io.FileWriter;
import java.io.IOException;


public class AlipayConfig {
    public static String app_id = "2016101500691156";

    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCto1a1mREsib18yliCZ5rrEzE+2pxasLAjK+AfX93pBqMUPgtCOSiu2ymMO97oLplTZozVMlirIky9U47DbdekmqVXRFGOMh1TBarluitcgJW11QtDcYA8JZUHulUaywQUQusvoFJBFuSjqu/r20duLyUhN+lDyPqxJWOClwqm6fjSsBDNTJMOOcwbWl0rZxE/cgD8uWGQrIvqsY4RTI503A4POSMrOSbDxJKOfod2pkZJxbypk7zb8BFrDxuiP3NeD1rLavJeZJ2LCmn4X3BmCx1TGSqOCtRfsgUp8vsmjv8VPFWjXrGVyWNIEGbbiy8oDSEtlujDA0SYW6miS30bAgMBAAECggEAchCW6XzAF230mIGkWyYMUtisxQl/JORlEPXFqVakxGujvax0YPCDlTpLtN+vsv7Jokv/wB3uuZ0ypDy70A3cVzlv3D/5A1xQfzV96qO90Gp37pchaxComNpnaEgzmAI9j8HWFddPsYqEcC/epCXMasl1rri399uTM8PH9wWZ7cM4shFIeEmAAEQjASZS5y+PS6m1XSfN3DQre7mIUprKagZsnZ4eibDy1rcEv3WtV78f9Mf2xTIaB86hmoG/YMDjOcs64+uSY/h9nfqP53KN+AVBK4GgKY/TD30Zxyo6lLB4P/EOMquz/+laYK9nPjdElvborN/TURLjQA3TkD/+4QKBgQDWiecyD9VVn8g637AVbctbGjv+Rjpk6Zi8j2fdEu3gcptw63iTkOvPqYQdaIqFD2IY31hMibEe7mcMaBw1KNldV2L88YjP07jvD4w0hUazwY46bqHgs7qM73FPKlzg00wXJ8UfVdMtm2OCEajKkzcBgNisv/fGy3TdgSDJvcDm/QKBgQDPMepSHNtBRiyqfDvqqQT4UgQsrTyVo5GisEpDDsNbO0Kw89UiW8YeSB9T+hpGZZMlYHxanaf3nEf1bOpr6wTgR4Va1d9u91oQrUAkXCEZ0U3CwQ6WioOs1r4A97y4N79eR78aHnyQBAXefSezOcHh+quMpI/6+k1fP3fWmqrL9wKBgQChc5Zxrki171EYPU6eUco//TY43VEEsGcpQCLB1IT/7D/ectaC9wT/emraVton2LPSVAJ3VwfcZz1VsOPJfbxW6nSsNnjnLkZ2YhT5UXMrw/XtM2TPXXJ+rZNwKElNSLZylpNaSZRrNg1kzTVhffhfQT/OgYlOKb8BEzRBnnOVYQKBgQDK+XE9o7s/BMn48d+YkJ+nzGD+i29QgH7JS75UVwAWPcWlqBjhodpCDBF0qQxYbmVqNk1cUBoePeFYkqxLsF6EgEwpol9SS8rVj4PImuBqdFqjMZFi9KruBSj5tbgRF7vHVq3lnnwUcXx2a1EbCLfg8zpfe075ZX+qkXiKqdYsHQKBgQCi5dLJnEif20Ggn50ONL+7k3cUYRG0n9wvZPGEpfOdv30eYEtp79vNAegVQi1ydXmSU6glwdZvhFPLLKtpqz/Cm97D32fCKUxF/8lHeXCOZ9whJN7VemZoWkBqAypoZVmfOqfO0DMTbPpYD+odj822tKoo3Qhl4IVm+Zdk1Tuy+g==";

    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoB1E8jELyS+68XPdUm3XM07Vnm4RYEc2oS/tFQEIK49159Z2KyEKgQ5cbapDIJrbT8sby0b4x9YG1TYi232TOD9v9I97pxZRfXWh8WjCmI/8c0F3dssuhHlRwa7UCNrVNAnJaj/Y1tXkWeDN2mGjdrKGIDqZp0uKIM+5p0a+qEN4J6adCPWLgF6tQl1Z5X36SG3wdCLQVcK0VtCRcCov39gbV8l0P7MmAcTK5DvFZjWw9ldxXToR8+XKstAoRsPRlkHc/GyXECKrXqRjTQ4+nAeypRZ2x45tTbdtTXc7yniI4Km7w3CY2Rt/ImHFy0snWwQ6p+lDq1lPpUloOdre0wIDAQAB";

    public static String notify_url = "";

    public static String return_url = "http://localhost:8080/alipay/returnURL";

    public static String sign_type = "RSA2";

    public static String charset = "utf-8";

    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    public static String log_path = "C:\\";


    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
