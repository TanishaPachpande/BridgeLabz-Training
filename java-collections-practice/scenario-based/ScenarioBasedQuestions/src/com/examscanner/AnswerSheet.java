package com.examscanner;

import java.util.List;

public abstract class AnswerSheet {
    protected List<Character> answers;

    public AnswerSheet(List<Character> answers) {
        this.answers = answers;
    }

    public List<Character> getAnswers() {
        return answers;
    }
}

