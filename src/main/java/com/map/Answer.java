package com.map;

import javax.persistence.*;

@Entity

public class Answer {
    @Id
    @Column(name = "Answer_ID")
    private int answerId;

    @Column(name = "Answers")
    private String answer;

    @OneToOne(mappedBy = "ans")
    @JoinColumn(name = "Q_ID")
    private Question que;


    public Question getQue() {
        return que;
    }

    public void setQue(Question que) {
        this.que = que;
    }


    public Answer(int answerId, String answer, Question que) {
        this.answerId = answerId;
        this.answer = answer;
        this.que = que;
    }



    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
