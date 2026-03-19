package OnetoManye;

import jakarta.persistence.*;

//@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String answer;
    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;
public  Answer(String answer, Question question){
    super();
    this.answer=answer;
    this.question=question;
}
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getAid() {
        return aid;
    }

    public String getAnswer() {
        return answer;
    }
}
