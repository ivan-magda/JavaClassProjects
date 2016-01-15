package com.vanyaland;

import java.io.*;

/**
 * Created by ivanmagda on 23.10.15.
 */
public class XMLParser {
    String to = null;
    String from = null;
    String heading = null;
    String body = null;

    public void parseFromFile(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String readLine = null;
        StringBuilder string = new StringBuilder();

        boolean needToAddNewLine = false;
        while ((readLine = bufferedReader.readLine()) != null) {
            string.append(readLine);

            if (readLine.indexOf("<body>") != -1) {
                needToAddNewLine = true;
            } else if (readLine.indexOf("</body>") != -1) {
                needToAddNewLine = false;
            }

            if (needToAddNewLine) {
                string.append("\n");
            }
        }

        to = getTagValue(string.toString(), "<to>", "</to>");
        from = getTagValue(string.toString(), "<from>", "</from>");
        heading = getTagValue(string.toString(), "<heading>", "</heading>");
        body = getTagValue(string.toString(), "<body>", "</body>");
    }

    @Override public String toString() {
        return "Кому: " + to + "\nОт кого: " + from + "\nЗаголовок: " + heading + "\nТекст: " + body;
    }

    private String getTagValue(String string, String startTag, String endTag){
        int openTag = string.indexOf(startTag);
        int closeTag = string.indexOf(endTag);
        if (openTag > -1 && closeTag > -1) {
            return string.substring(openTag + startTag.length(), closeTag);
        } else {
            return null;
        }
    }
}
