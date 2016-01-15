package com.vanyaland;

import java.io.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // Load all xml files from folder.
        XMLFilesLoader xmlFilesLoader = new XMLFilesLoader(new File("/Users/ivanmagda/IdeaProjects/Lab_3_XML"));
        File[] xmlFiles =  xmlFilesLoader.getXmlFiles();

        // Linked lists instatiantions.
        LinkedList<String> fromList = new LinkedList<String>();
        LinkedList<String> toList = new LinkedList<String>();
        LinkedList<String> headList = new LinkedList<String>();
        LinkedList<XMLParser> xmlParserLinkedList = new LinkedList<XMLParser>();

        // Work on files.
        for (File file: xmlFiles) {
            XMLParser xmlParser = new XMLParser();
            try {
                xmlParser.parseFromFile(file);
                System.out.println(xmlParser);

                xmlParserLinkedList.add(xmlParser);

                if (!fromList.contains(xmlParser.from)) {
                    fromList.add(xmlParser.from);
                }
                if (!toList.contains(xmlParser.to)) {
                    toList.add(xmlParser.to);
                }
                if (!headList.contains(xmlParser.heading)) {
                    headList.add(xmlParser.heading);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Write to out.txt file.
        String outString = null;
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("out.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        printWriter.write("Список отправителей:"+"\r"+"\n");
        for (String lf : fromList) {
            outString = lf;
            if (outString != null) {
                printWriter.write(outString + "\r\n");
            }
        }
        printWriter.write("\r\nСписок получателей:" + "\r\n");
        for (String lt : toList) {
            outString = lt;
            if (outString != null) {
                printWriter.write(outString + "\r\n");
            }
        }
        printWriter.write("\r\nЗаголовки:" + "\r\n");
        for (String lh : headList) {
            outString = lh;
            if (outString != null) {
                printWriter.write(outString+"\r\n");
            }
        }
        printWriter.close();
    }
}
