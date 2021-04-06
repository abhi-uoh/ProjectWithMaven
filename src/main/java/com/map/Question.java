package com.map;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name = "Quesiton_ID")
    private int questionId;

    @Column(name="Questions")
    private String question;

    @OneToOne
    @JoinColumn(name = "A_ID")
    private  Answer ans;


    public Question(int questionId, String question, Answer ans) {
        this.questionId = questionId;
        this.question = question;
        this.ans = ans;
    }

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }
}
