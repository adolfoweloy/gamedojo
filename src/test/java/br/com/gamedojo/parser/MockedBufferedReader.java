package br.com.gamedojo.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class MockedBufferedReader extends BufferedReader {

    private String[] lines = {
            "23/04/2013 15:34:22 - New match 11348965 has started",
            "23/04/2013 15:36:04 - Roman killed Nick using M16",
            "23/04/2013 15:36:33 - <WORLD> killed Nick by DROWN",
            "23/04/2013 15:39:22 - Match 11348965 has ended"
    };

    private int cursor = 0;

    public MockedBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {
        if (cursor >= lines.length) {
            return null;
        }

        return lines[cursor++];
    }

}