package com.email.writer;

import java.util.List;

public class Part {

    private String text;

    public Part(TextPart text) {
        this.text = text.getText();
    }
}
