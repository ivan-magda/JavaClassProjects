package com.ivanmagda;

import com.ivanmagda.api.AmurInfoSiteScanner;

public class Main {

    public static void main(String[] args) {
        String pageContent = AmurInfoSiteScanner.getPageContent();
        System.out.println(pageContent);
    }
}
