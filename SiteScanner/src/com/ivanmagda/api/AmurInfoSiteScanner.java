package com.ivanmagda.api;

import java.net.URI;
import java.net.URISyntaxException;

public class AmurInfoSiteScanner extends SiteScannerHttpApi {

    // Properties.

    private static String LOG_TAG = AmurInfoSiteScanner.class.getSimpleName();

    // URLs.
    private static final String SCHEME = "http";
    private static final String HOST = "www.amur.info";

    // Requests.

    public static String getPageContent() {
        return getPageContent(amurInfoURLWithPathExtension(null));
    }

    // Helpers.

    private static String amurInfoURLWithPathExtension(String path) {
        try {
            URI uri = new URI(SCHEME, HOST, path, null);

            System.out.println(uri.toString());

            return uri.toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return null;
    }

}
