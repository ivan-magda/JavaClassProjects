package com.vanyaland;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanmagda on 23.10.15.
 */
public class XMLFilesLoader {
    // Folder from find xml files.
    private static File folder = null;

    // Init with folder
    public XMLFilesLoader(File folderToRead) {
        folder = folderToRead;
    }

    public File[] getXmlFiles() {
        List<File> list = new ArrayList<File>();

        File[] files = folder.listFiles();
        for (File file : files) {
            if (file.isFile() && (getFileExtensionName(file).indexOf("xml") != -1)) {
                list.add(file);
            }
        }
        return list.toArray(new File[list.size()]);
    }

    private String getFileExtensionName(File file) {
        if ((file.getName().indexOf(".")) == -1) {
            return "";
        } else {
            return file.getName().substring(file.getName().length() - 3, file.getName().length());
        }
    }
}
