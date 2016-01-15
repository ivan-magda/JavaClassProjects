package com.vanyaland;

import java.io.*;
import java.nio.file.*;

/**
 * Created by ivanmagda on 13.11.15.
 */
public class XMLWriter {
    BufferedWriter bufferedWriter = null;

    public XMLWriter(String directory) throws IOException {
        this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(directory)));
        bufferedWriter.write("<?xml version=\"1.0\"?>\n");
    }

    public void startCategoryTag() {
    }
}
