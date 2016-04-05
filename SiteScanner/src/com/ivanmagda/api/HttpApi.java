package com.ivanmagda.api;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class HttpApi {

    // Properties.

    /**
     * Log tag for debug statements.
     */
    private static String LOG_TAG = HttpApi.class.getSimpleName();

    // Network.

    protected static String execute(String requestURL) {
        // Getting a connection to the resource referred to by this URL
        // and trying to connect.
        HttpURLConnection connection = null;

        try {
            URL url = new URL(requestURL);

            connection = (HttpURLConnection) url.openConnection();
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);

            connection.connect();

            return processOnResponse(connection);
        } catch (IOException exception) {
            System.out.println(LOG_TAG + ": Failed to download raw data. Error: "
                    + exception.getMessage());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return null;
    }

    private static String processOnResponse(HttpURLConnection connection) {
        BufferedReader reader = null;
        InputStream inputStream = null;

        try {
            inputStream = connection.getInputStream();

            if (inputStream == null) {
                return null;
            }

            // Will be storing response data.
            StringBuilder stringBuilder = new StringBuilder();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            // Reading each line of the data.
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

            return stringBuilder.toString();
        } catch (IOException exception) {
            System.out.println(LOG_TAG + ": Failed to process on http response. Error "
                    + exception.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }

                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException exception) {
                System.out.println(LOG_TAG + ": Failed to close. Error: "
                        + exception.getMessage());
            }
        }

        return null;
    }

}
