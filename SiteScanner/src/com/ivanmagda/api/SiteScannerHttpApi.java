package com.ivanmagda.api;

public abstract class SiteScannerHttpApi extends HttpApi {

    // Requests.

    public static String getPageContent(String url) {
        return execute(url);
    }
}
