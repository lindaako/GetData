package com.example.getdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.net.MalformedURLException;


public class MainActivity extends AppCompatActivity
{

    public void GetData() throws FailingHttpStatusCodeException,IOException
    {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(false);
        System.out.println("Hello web : " + webClient);
        //HtmlPage page = webClient.getPage("https://pyxis.knu.ac.kr/en/#/search/detail/4500295");
        //HtmlPage page = (HtmlPage) webClient.getPage("https://en.wikipedia.org/wiki/Main_Page");
        //String pageContent=page.asText();
        //System.out.println(pageContent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try
        {
            GetData();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
