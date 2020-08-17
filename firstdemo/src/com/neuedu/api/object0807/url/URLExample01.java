package com.neuedu.api.object0807.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLExample01 {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://www.iqiyi.com/dianying/");
        System.out.println("host:"+url.getHost());
        System.out.println("protocol:"+url.getProtocol());
        System.out.println("path:"+url.getPath());
        System.out.println("file:"+url.getFile());

        InputStream inputStream = url.openStream();//输入流
        InputStreamReader isr=new InputStreamReader(inputStream,"utf-8");
        BufferedReader br=new BufferedReader(isr);
        String str=br.readLine();
        while(str!=null) {
            System.out.println(str);
            str=br.readLine();
        }
        br.close();
        isr.close();
        inputStream.close();

    }

}
