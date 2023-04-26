package Lab6.pb4;

import java.io.File;
import java.io.FileFilter;

public class Filter implements FileFilter {
    static final String FILEPATH = "words.in";
    static final String FILEEXT = "extension.in";

    public boolean accept(File pathname) {
        return false;
    }
}
